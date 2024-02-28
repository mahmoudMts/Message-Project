package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.model.wsett.WSETTSettlementRow;
import com.lm.data.edi.repository.RedshiftConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EdiWSETTDataService {
    private RedshiftConnectionUtil redshiftConnectionUtil = new RedshiftConnectionUtil();
    public List<WSETTSettlementRow> getWSETTDataFromDb(String sqlQuery, List<String> wsettParamList, LambdaLogger logger) {
        List<WSETTSettlementRow> listWSETTSettlementRow = null;
        try (Connection conn = redshiftConnectionUtil.getDBconnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)) {

            ResultSet dataFromDB = preparedStatement.executeQuery();
            if (dataFromDB != null) {
                listWSETTSettlementRow = new ArrayList<>();
                try {
                    while (dataFromDB.next()) {
                        listWSETTSettlementRow.add(new WSETTSettlementRow(
                                dataFromDB.getString("settlementCurrencyISOCode"),
                                dataFromDB.getString("settlementCurrencyILUCode"),
                                dataFromDB.getString("M02RecordsNumberForCurrency"),
                                dataFromDB.getString("centralSettlementCashAmountTotal"),
                                dataFromDB.getString("centralSettlementDeferredAmountTotal"),
                                dataFromDB.getString("centralSettlementReserveReleaseAmountTotal"),
                                dataFromDB.getString("centralSettlementTTYStatementAmountTotal"),
                                dataFromDB.getString("centralSettlementClaimAmountTotal"),
                                dataFromDB.getString("nonCentralSettlementCashAmountTotal"),
                                dataFromDB.getString("nonCentralSettlementDeferredAmountTotal"),
                                dataFromDB.getString("nonCentralSettlementReserveReleaseAmountTotal"),
                                dataFromDB.getString("nonCentralSettlementTTYStatementAmountTotal"),
                                dataFromDB.getString("nonCentralSettlementClaimAmountTotal"),
                                dataFromDB.getString("companyIdentificationDSIGNGroupCode"),
                                dataFromDB.getString("M02RecordsNumberPerCurrencyAndBroker"),
                                dataFromDB.getString("brokerCodeShort"),
                                dataFromDB.getString("brokerCode"),
                                dataFromDB.getString("carrierIdentificationCode"),
                                dataFromDB.getString("carrierIdentificationDSIGNGroupCode"),
                                dataFromDB.getString("carrierReference"),
                                dataFromDB.getString("carrierShortName"),
                                dataFromDB.getString("brokerShortCode"),
                                dataFromDB.getString("brokerReference"),
                                dataFromDB.getString("brokerShortName"),
                                dataFromDB.getString("entryType"),
                                dataFromDB.getString("policySigningAccountingOfficeNumber"),
                                dataFromDB.getString("carriersProportionAmountOriginalCurrency"),
                                dataFromDB.getString("carriersProportionAmountSettlementCurrency"),
                                dataFromDB.getString("defferedPaymentIndicator"),
                                dataFromDB.getString("settledInOriginalCurrencyIndicator"),
                                dataFromDB.getString("originalCurrencyILUCode"),
                                dataFromDB.getString("originalCurrencyISOCode"),
                                dataFromDB.getString("centralSettlementIndicator"),
                                dataFromDB.getString("settlementActualPaymentDate"),
                                dataFromDB.getString("settlementPeriodStartDate"),
                                dataFromDB.getString("settlementPeriodEndDate"),
                                dataFromDB.getString("carrierSecondaryReference"),
                                dataFromDB.getString("nettInstalmentDateOn"),
                                dataFromDB.getString("brokerSecondaryReference"),
                                dataFromDB.getString("carrierIdentificationGroupCode"),
                                dataFromDB.getString("numberOfRecordsInTheFile")
                        ));
                    }
                } catch (SQLException e) {
                    logger.log("SQLException in handleRequest " + e.getMessage());
                }
            } else {
                throw new EdiRuntimeException(EdiStatusCode.DATA_NOT_FOUND, "Issue while getting WSETT data");
            }

        } catch (ClassNotFoundException | SQLException e) {
            logger.log("An error occurred: " + e.getMessage());
        }
        return listWSETTSettlementRow;
    }
}
