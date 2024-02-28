package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.constants.EdiSql;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.model.ilucsb.SettlementPaymentRow;
import com.lm.data.edi.repository.RedshiftConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EdiDataService {

    private RedshiftConnectionUtil redshiftConnectionUtil = new RedshiftConnectionUtil();


    public List<SettlementPaymentRow> getIlucsbDataFromDb(String partyId, String settlementDate, String fromDate, String toDate, LambdaLogger logger) {
    	
    	/* Prepare parameter list and SQL query - Start */
    	
    	List<String> paramList = new ArrayList<>();
		paramList.add(partyId);
		
    	if (fromDate == null && toDate != null) {
		    fromDate = toDate;
		} else if (toDate == null && fromDate != null) {
		    toDate = fromDate;
		}


		StringBuilder sqlQueryBuilder = new StringBuilder(EdiSql.ILUCSB_SQL_QUERY_1);

		if (settlementDate != null) {
			paramList.add(settlementDate);
		    sqlQueryBuilder.append(EdiSql.ILUCSB_SQL_QUERY_2);
		}

		if (fromDate != null && toDate != null) {
			paramList.add(fromDate);
			paramList.add(toDate);
		    sqlQueryBuilder.append(EdiSql.ILUCSB_SQL_QUERY_3);
		}

		String sqlQuery = sqlQueryBuilder.toString();
		
		/* Prepare parameter list and SQL query - End */
		
        List<SettlementPaymentRow> listSettlementPaymentRow = null;
        try (Connection conn = redshiftConnectionUtil.getDBconnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)) {

            for (int i = 0; i < paramList.size(); i++) {
                preparedStatement.setString(i + 1, paramList.get(i));
            }

            ResultSet dataFromDB = preparedStatement.executeQuery();
            if (dataFromDB != null) {
                listSettlementPaymentRow = new ArrayList<>();
                try {
                    while (dataFromDB.next()) {
                        listSettlementPaymentRow.add(new SettlementPaymentRow(
                                dataFromDB.getString("marketId"),
                                dataFromDB.getString("settlementDate"),
                                dataFromDB.getString("companyAccountingCode"),
                                dataFromDB.getString("settlementRunNumber"),
                                dataFromDB.getString("companyCode"),
                                dataFromDB.getString("actualPaymentDate"),
                                dataFromDB.getString("settlementCurrencyCode"),
                                dataFromDB.getString("brokerCode"),
                                dataFromDB.getString("businessCategory"),
                                dataFromDB.getString("iluReference"),
                                dataFromDB.getBigDecimal("netPremiumClaim"),
                                dataFromDB.getDate("settlementDueDate"),
                                dataFromDB.getInt("instalmentNumber")
                        ));
                    }
                } catch (SQLException e) {
                    //e.printStackTrace();
                    logger.log("SQLException in handleRequest " + e.getMessage());
                }
            }
            else
            {
            	throw new EdiRuntimeException(EdiStatusCode.DATA_NOT_FOUND, "Issue while getting iluscb data");
            }

        } catch (ClassNotFoundException | SQLException e) {
            logger.log("An error occurred: " + e.getMessage());
            //e.printStackTrace();
        }
        return listSettlementPaymentRow;
    }
}
