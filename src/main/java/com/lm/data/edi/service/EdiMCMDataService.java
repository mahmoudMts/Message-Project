package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.model.mcm.MCMSettlementRow;
import com.lm.data.edi.repository.RedshiftConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EdiMCMDataService {
    private RedshiftConnectionUtil redshiftConnectionUtil = new RedshiftConnectionUtil();

    public List<MCMSettlementRow> getMCMDataFromDb(String sqlQuery, List<String> mcmParamList, LambdaLogger logger) {
        List<MCMSettlementRow> listMCMSettlementRow = null;
        try (Connection conn = redshiftConnectionUtil.getDBconnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)) {


            ResultSet dataFromDB = preparedStatement.executeQuery();
            if (dataFromDB != null) {
                listMCMSettlementRow = new ArrayList<>();
                try {
                    while (dataFromDB.next()) {
                        listMCMSettlementRow.add(new MCMSettlementRow(
                                dataFromDB.getString("segmentTag"),
                                dataFromDB.getString("monetoryAmountQualifier"),
                                dataFromDB.getString("amount"),
                                dataFromDB.getString("currency"),
                                dataFromDB.getString("controlQualifier"),
                                dataFromDB.getString("transactionCount"),
                                dataFromDB.getString("dateTimeQualifier"),
                                dataFromDB.getString("controlMessagePeriod"),
                                dataFromDB.getString("yearOfAccount"),
                                dataFromDB.getString("messageName"),
                                dataFromDB.getString("userNumber"),
                                dataFromDB.getString("messageReferenceNumber"),
                                dataFromDB.getString("processingIndicatorAuditOrRiskCode"),
                                dataFromDB.getString("processingIndicatorBusinessCategoryCode"),
                                dataFromDB.getString("gisQualifier"),
                                dataFromDB.getString("separatorId"),
                                dataFromDB.getString("nameAndAddressQualifier"),
                                dataFromDB.getString("partyIdentificationCoded")
                        ));
                    }
                } catch (SQLException e) {

                    logger.log("SQLException in handleRequest " + e.getMessage());
                }
            } else {
                throw new EdiRuntimeException(EdiStatusCode.DATA_NOT_FOUND, "Issue while getting MCM data");
            }

        } catch (ClassNotFoundException | SQLException e) {
            logger.log("An error occurred: " + e.getMessage());

        }
        return listMCMSettlementRow;
    }
}