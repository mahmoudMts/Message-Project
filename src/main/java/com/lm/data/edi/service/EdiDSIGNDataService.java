package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
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

public class EdiDSIGNDataService {

    private RedshiftConnectionUtil redshiftConnectionUtil = new RedshiftConnectionUtil();


    public ResultSet getDsignDataFromDb(String sqlQuery, List<String> paramList, LambdaLogger logger) {
        ResultSet dataFromDB =null;
        try (Connection conn = redshiftConnectionUtil.getDBconnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)) {

            for (int i = 0; i < paramList.size(); i++) {
                preparedStatement.setString(i + 1, paramList.get(i));
            }

             dataFromDB = preparedStatement.executeQuery();
            if (dataFromDB != null) {
                return dataFromDB;
            }
            else
            {
            	throw new EdiRuntimeException(EdiStatusCode.DATA_NOT_FOUND, "Issue while getting iluscb data");
            }

        } catch (ClassNotFoundException | SQLException e) {
            logger.log("An error occurred: " + e.getMessage());
            //e.printStackTrace();
        }
        return dataFromDB;
    }
}
