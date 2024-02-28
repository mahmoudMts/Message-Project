package com.lm.data.edi.mapper;

import com.lm.data.edi.model.wsett.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EdiWSETTMapperTest {

    private static EdiWSETTMapper ediWSETTMapper;

    @BeforeAll
    public static void setUp() {
        ediWSETTMapper = new EdiWSETTMapper();
    }

    @Test
    public void testMapSettlementData() throws ParseException {

        List<WSETTSettlementRow> settlementRows = new ArrayList<>();

        // Adding dummy settlement row
        WSETTSettlementRow settlementRow = new WSETTSettlementRow();
        settlementRow.setCarrierIdentificationCode("ABC123");
        settlementRow.setCarrierReference("REF123");
        settlementRow.setCarrierShortName("CarrierName");
        settlementRow.setBrokerShortCode("BROKER123");
        settlementRow.setBrokerReference("BROKERREF123");
        settlementRow.setBrokerShortName("BrokerName");
        settlementRow.setSettlementCurrencyILUCode("US$");
        settlementRow.setSettlementCurrencyISOCode("CAD");
        settlementRow.setPolicySigningAccountingOfficeNumber("PolicyOffice");
        settlementRow.setEntryType("PM");
        settlementRow.setCarriersProportionAmountOriginalCurrency("100.0");
        settlementRow.setCarriersProportionAmountSettlementCurrency("200.0");
        settlementRow.setDefferedPaymentIndicator("D");
        settlementRow.setSettledInOriginalCurrencyIndicator("Y");
        settlementRow.setOriginalCurrencyILUCode("CAD");
        settlementRow.setOriginalCurrencyISOCode("CAD");
        settlementRow.setCentralSettlementIndicator("Y");
        settlementRow.setSettlementActualPaymentDate("2021-01-01");
        settlementRow.setSettlementPeriodStartDate("2021-01-01");
        settlementRow.setSettlementPeriodEndDate("2021-01-31");
        settlementRow.setCarrierSecondaryReference("CarrierSecondaryRef");
        settlementRow.setNettInstalmentDateOn("2021-02-01");
        settlementRow.setBrokerSecondaryReference("BrokerSecondaryRef");
        settlementRow.setBrokerCode("BROKER");
        settlementRow.setCarrierIdentificationGroupCode("GroupCode");
        settlementRow.setCarrierIdentificationDSIGNGroupCode("DSIGNGroupCode");
        settlementRows.add(settlementRow);


        RegenWSETT regenWSETT = ediWSETTMapper.mapSettlementData(settlementRows);


        assertEquals(1, regenWSETT.getMessagePayload().size());

        WsettNotificationPayloadMessagePayload payload = regenWSETT.getMessagePayload().get(0);
        WholeMessageHeader wholeMessageHeader = payload.getWholeMessageHeader();
        assertEquals("CompanyABC", wholeMessageHeader.getCarrierName());
        assertEquals("4792", wholeMessageHeader.getMessageNo());
        assertEquals("2021-07-28", wholeMessageHeader.getLastDate());
        assertEquals("2021-07-29", wholeMessageHeader.getCurrentDate());
        assertEquals("A39", wholeMessageHeader.getCarrierIdentificationGroupCode());

        AuditBlock audit = payload.getAudit();
        assertEquals("svc99", audit.getUser());
        assertEquals(LocalDateTime.parse("2021-03-03T08:24:51Z", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")), audit.getAt());

        SettlementDataDetails settlementDataDetails = payload.getSettlementDataDetails();
        assertEquals(0, settlementDataDetails.getM01Record().size()); // Assuming this list should be empty for this test

        List<TotalPerCurrencyM08Inner> m08SettlementContainers = settlementDataDetails.getWSETTM08SettlementContainers();
        assertEquals(1, m08SettlementContainers.size());
        TotalPerCurrencyM08Inner m08Container = m08SettlementContainers.get(0);
        assertEquals(TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.CAD, m08Container.getSettlementCurrencyISOCode());
        assertEquals(TotalPerCurrencyM08Inner.IluCurrencyCode.US_$, m08Container.getSettlementCurrencyILUCode());

        List<TotalPerBrokerM07Inner> m07SettlementContainers = settlementDataDetails.getWSETTM07SettlementContainers();
        assertEquals(1, m07SettlementContainers.size());
        TotalPerBrokerM07Inner m07Container = m07SettlementContainers.get(0);
        assertEquals(TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.CAD, m07Container.getSettlementCurrencyISOCode());
        assertEquals(TotalPerCurrencyM08Inner.IluCurrencyCode.fromValue("US$"), m07Container.getSettlementCurrencyILUCode());

        List<SettlementTransactionDetailM02Inner> m02Array = settlementDataDetails.getWSETTM02Array();
        assertEquals(1, m02Array.size());
        SettlementTransactionDetailM02Inner m02Inner = m02Array.get(0);
        assertEquals("ABC123", m02Inner.getCarrierIdentificationCode());
        assertEquals("REF123", m02Inner.getCarrierReference());
        assertEquals("CarrierName", m02Inner.getCarrierShortName());
        assertEquals("BROKER123", m02Inner.getBrokerShortCode());
        assertEquals("BROKERREF123", m02Inner.getBrokerReference());
        assertEquals("BrokerName", m02Inner.getBrokerShortName());
        assertEquals(TotalPerCurrencyM08Inner.IluCurrencyCode.US_$, m02Inner.getSettlementCurrencyILUCode());
        assertEquals(TotalPerCurrencyM08Inner.WsettIsoCurrencyCode.CAD, m02Inner.getSettlementCurrencyISOCode());
        assertEquals("PolicyOffice", m02Inner.getPolicySigningAccountingOfficeNumber());
        assertEquals(SettlementTransactionDetailM02Inner.EntryType.PM, m02Inner.getEntryType());
        assertEquals("100.0", m02Inner.getCarriersProportionAmountOriginalCurrency(), "0.01");
        assertEquals("200.0", m02Inner.getCarriersProportionAmountSettlementCurrency(), "0.01");
        assertEquals(SettlementTransactionDetailM02Inner.DefferedPaymentIndicator.D, m02Inner.getDefferedPaymentIndicator());
        assertEquals(SettlementTransactionDetailM02Inner.SettledInOriginalCurrencyIndicator.Y, m02Inner.getSettledInOriginalCurrencyIndicator());
        assertEquals("CAD", m02Inner.getOriginalCurrencyILUCode());
        assertEquals("CAD", m02Inner.getOriginalCurrencyISOCode());
        assertEquals(SettlementTransactionDetailM02Inner.CentralSettlementIndicator.Y, m02Inner.getCentralSettlementIndicator());
        assertEquals("2021-01-01", m02Inner.getSettlementActualPaymentDate());
        assertEquals("2021-01-01", m02Inner.getSettlementPeriodStartDate());
        assertEquals("2021-01-31", m02Inner.getSettlementPeriodEndDate());
        assertEquals("CarrierSecondaryRef", m02Inner.getCarrierSecondaryReference());
        assertEquals("2021-02-01", m02Inner.getNettInstalmentDateOn());
        assertEquals("BrokerSecondaryRef", m02Inner.getBrokerSecondaryReference());
        assertEquals("BROKER", m02Inner.getBrokerCode());
        assertEquals("GroupCode", m02Inner.getCarrierIdentificationGroupCode());
        assertEquals("DSIGNGroupCode", m02Inner.getCarrierIdentificationDSIGNGroupCode());
    }

}