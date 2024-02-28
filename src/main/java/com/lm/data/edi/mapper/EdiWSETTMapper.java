package com.lm.data.edi.mapper;

import com.lm.data.edi.model.wsett.*;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EdiWSETTMapper {


    public static RegenWSETT mapSettlementData(List<WSETTSettlementRow> listWSETTSettlementRow) throws ParseException {

        List<WsettNotificationPayloadMessagePayload> wsettNotificationPayloadMessagePayloads = new ArrayList<WsettNotificationPayloadMessagePayload>();
        WsettNotificationPayloadMessagePayload wsettNotificationPayloadMessagePayload = new WsettNotificationPayloadMessagePayload();
        WholeMessageHeader wholeMessageHeader = new WholeMessageHeader("CompanyABC", "4792", "2021-07-28", "2021-07-29", "A39");
        LocalDateTime localDateTime = LocalDateTime.parse("2021-03-03T08:24:51Z", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        AuditBlock audit = new AuditBlock("svc99",localDateTime );
        SettlementDataDetails settlementDataDetail = new SettlementDataDetails();

        for (WSETTSettlementRow wSETTSettlementRow : listWSETTSettlementRow) {

            List<CompanyGroupHeaderM01Inner> m01Record = new ArrayList<CompanyGroupHeaderM01Inner>();
            List<TotalPerCurrencyM08Inner> wSETTM08SettlementContainers = new ArrayList<TotalPerCurrencyM08Inner>();
            List<TotalPerBrokerM07Inner> wSETTM07SettlementContainers = new ArrayList<TotalPerBrokerM07Inner>();
            List<SettlementTransactionDetailM02Inner> wSETTM02Array = new ArrayList<SettlementTransactionDetailM02Inner>();

            SettlementTransactionDetailM02Inner m02Inner = new SettlementTransactionDetailM02Inner(wSETTSettlementRow.getCarrierIdentificationCode(), wSETTSettlementRow.getCarrierReference(), wSETTSettlementRow.getCarrierShortName(), wSETTSettlementRow.getBrokerShortCode(), wSETTSettlementRow.getBrokerReference(), wSETTSettlementRow.getBrokerShortName(), TotalPerCurrencyM08Inner.IluCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyILUCode()), TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyISOCode()), wSETTSettlementRow.getPolicySigningAccountingOfficeNumber(), SettlementTransactionDetailM02Inner.EntryType.fromValue(wSETTSettlementRow.getEntryType()),
                    wSETTSettlementRow.getCarriersProportionAmountOriginalCurrency(), wSETTSettlementRow.getCarriersProportionAmountSettlementCurrency(), SettlementTransactionDetailM02Inner.DefferedPaymentIndicator.fromValue(wSETTSettlementRow.getDefferedPaymentIndicator()), SettlementTransactionDetailM02Inner.SettledInOriginalCurrencyIndicator.fromValue(wSETTSettlementRow.getSettledInOriginalCurrencyIndicator())
                    , wSETTSettlementRow.getOriginalCurrencyILUCode(), wSETTSettlementRow.getOriginalCurrencyISOCode(), SettlementTransactionDetailM02Inner.CentralSettlementIndicator.fromValue(wSETTSettlementRow.getCentralSettlementIndicator()), wSETTSettlementRow.getSettlementActualPaymentDate(), wSETTSettlementRow.getSettlementPeriodStartDate(), wSETTSettlementRow.getSettlementPeriodEndDate(), wSETTSettlementRow.getCarrierSecondaryReference(), wSETTSettlementRow.getNettInstalmentDateOn(), wSETTSettlementRow.getBrokerSecondaryReference(), wSETTSettlementRow.getBrokerCode(), wSETTSettlementRow.getCarrierIdentificationGroupCode(), wSETTSettlementRow.getCarrierIdentificationDSIGNGroupCode());

            wSETTM02Array.add(m02Inner);

            TotalPerBrokerM07Inner m07Inner = new TotalPerBrokerM07Inner(TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyISOCode()), TotalPerCurrencyM08Inner.IluCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyILUCode()), wSETTSettlementRow.getBrokerCodeShort(), wSETTSettlementRow.getM02RecordsNumberPerCurrencyAndBroker(),
                    wSETTSettlementRow.getCentralSettlementCashAmountTotal(), wSETTSettlementRow.getCentralSettlementDeferredAmountTotal(), wSETTSettlementRow.getCentralSettlementReserveReleaseAmountTotal(), wSETTSettlementRow.getCentralSettlementTTYStatementAmountTotal(), wSETTSettlementRow.getCentralSettlementClaimAmountTotal(),
                    wSETTSettlementRow.getNonCentralSettlementCashAmountTotal(), wSETTSettlementRow.getNonCentralSettlementDeferredAmountTotal(), wSETTSettlementRow.getNonCentralSettlementReserveReleaseAmountTotal(), wSETTSettlementRow.getNonCentralSettlementTTYStatementAmountTotal(), wSETTSettlementRow.getNonCentralSettlementClaimAmountTotal(), wSETTSettlementRow.getBrokerCode(), wSETTSettlementRow.getCarrierIdentificationCode(), wSETTSettlementRow.getCarrierIdentificationDSIGNGroupCode(), wSETTM02Array);

            wSETTM07SettlementContainers.add(m07Inner);

            TotalPerCurrencyM08Inner wsettm08SettlementContainer = new TotalPerCurrencyM08Inner(
                    TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyISOCode()), TotalPerCurrencyM08Inner.IluCurrencyCode.fromValue(wSETTSettlementRow.getSettlementCurrencyILUCode()), wSETTSettlementRow.getM02RecordsNumberForCurrency(), wSETTSettlementRow.getCentralSettlementCashAmountTotal(), wSETTSettlementRow.getCentralSettlementDeferredAmountTotal(), wSETTSettlementRow.getNonCentralSettlementReserveReleaseAmountTotal(), wSETTSettlementRow.getCentralSettlementTTYStatementAmountTotal(), wSETTSettlementRow.getCentralSettlementClaimAmountTotal(),
                    wSETTSettlementRow.getNonCentralSettlementCashAmountTotal(), wSETTSettlementRow.getNonCentralSettlementDeferredAmountTotal(), wSETTSettlementRow.getNonCentralSettlementReserveReleaseAmountTotal(), wSETTSettlementRow.getNonCentralSettlementTTYStatementAmountTotal(), wSETTSettlementRow.getNonCentralSettlementClaimAmountTotal(),
                    wSETTSettlementRow.getCompanyIdentificationDSIGNGroupCode(), wSETTM07SettlementContainers);

            wSETTM08SettlementContainers.add(wsettm08SettlementContainer);

            settlementDataDetail.setM01Record(m01Record);
            settlementDataDetail.setWSETTM08SettlementContainers(wSETTM08SettlementContainers);
            settlementDataDetail.setWSETTM07SettlementContainers(wSETTM07SettlementContainers);
            settlementDataDetail.setWSETTM02Array(wSETTM02Array);

            wsettNotificationPayloadMessagePayload.setWholeMessageHeader(wholeMessageHeader);
            wsettNotificationPayloadMessagePayload.setSettlementDataDetails(settlementDataDetail);
            wsettNotificationPayloadMessagePayload.setAudit(audit);
            wsettNotificationPayloadMessagePayloads.add(wsettNotificationPayloadMessagePayload);
        }
        return new RegenWSETT(wsettNotificationPayloadMessagePayloads) ;
    }
}


