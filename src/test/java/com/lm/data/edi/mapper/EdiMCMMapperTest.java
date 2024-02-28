package com.lm.data.edi.mapper;

import com.lm.data.edi.model.mcm.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EdiMCMMapperTest {
    @Test
    public void  mapMCMDataTest_WhenMCMSettlementRow_ContainsData(){
        MCMSettlementRow mCMSettlementRow = MCMSettlementRow.builder()
                .segmentTag("BGM")
                 .monetoryAmountQualifier(MoaDetails.MonetoryAmountQualifier.NCR.value())
                .amount("123.56")
                .currency("GRB")
                .controlQualifier("TXN")
                .transactionCount("1")
                .dateTimeQualifier(String.valueOf(DateTimeDetails.DateTimeQualifier.CMP))
                .controlMessagePeriod("2004-02-29")
                .yearOfAccount("2003-11-30")
                .messageName("CON")
                .userNumber("1234")
                .messageReferenceNumber("1")
                .processingIndicatorAuditOrRiskCode("0")
                .processingIndicatorBusinessCategoryCode(GisDetails.ProcessingIndicatorBusinessCategoryCode.PRM.value())
                .gisQualifier(GisDetails.GisQualifier.NAC.value())
                .separatorId("seper")
                .partyIdentificationCoded("123").build();
        List<MCMSettlementRow> list = new ArrayList<>();
        list.add(mCMSettlementRow);

        EdiMCMMapper ediMCMMapper = new EdiMCMMapper();
        MCMNotificationsMessage response =ediMCMMapper.mapMcmData(list);

        assertNotNull(response);
        assertNotNull(response.getPayload());
    }
}
