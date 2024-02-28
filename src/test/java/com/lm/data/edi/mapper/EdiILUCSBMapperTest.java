package com.lm.data.edi.mapper;

import com.lm.data.edi.model.ilucsb.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EdiILUCSBMapperTest {

    @Test
    void mapIlucsbData() {
        SettlementPaymentRow spr = new SettlementPaymentRow();
        spr.setIluReference("123");
        spr.setCompanyCode("XYZ");
        spr.setIluReference("123");
        spr.setBrokerCode("B001");
        spr.setBusinessCategory("806");
        //spr.setBrokerBusinessBalanceAmount(5000);
        spr.setSettlementCurrencyCode("USD");
        //spr.setCurrencyTotalForSettlement(10000);
        spr.setCompanyAccountingCode("ACC123");
        spr.setSettlementRunNumber("SRN001");
        spr.setActualPaymentDate("2022-04-05");
        spr.setNetPremiumClaim(new BigDecimal("1500.00"));


        List<SettlementPaymentRow> listSettlementPaymentRow = new ArrayList<>();
        listSettlementPaymentRow.add(spr);


        EdiILUCSBMapper mapper = new EdiILUCSBMapper();


        ILUCSBNotificationPayload result = mapper.mapIlucsbData(listSettlementPaymentRow);

        // Assert the result
        assertNotNull(result);
        assertNotNull(result.getSettlement());
        assertEquals(1, result.getSettlement().size());

        Settlement settlement = result.getSettlement().get(0);
        assertNotNull(settlement);

        List<ILUCSBContainerArray> containerArray = settlement.getILUCSBContainerArray();
        assertNotNull(containerArray);
        assertEquals(1, containerArray.size());

        ILUCSBContainerArray ilucsbContainerArray = containerArray.get(0);
        assertNotNull(ilucsbContainerArray);

        assertEquals("ACC123", ilucsbContainerArray.getCompanyAccountingCode());
        assertEquals("SRN001", ilucsbContainerArray.getSettlementRunNumber());
        assertEquals("2022-04-05", ilucsbContainerArray.getActualPaymentDate());

        List<ILUCSBCurrencySettlementTotalArray> currencySettlementTotalArray = ilucsbContainerArray.getILUCSBCurrencySettlementTotalArray();
        assertNotNull(currencySettlementTotalArray);
        assertEquals(1, currencySettlementTotalArray.size());

        ILUCSBCurrencySettlementTotalArray ilucsbCurrencySettlementTotalArray = currencySettlementTotalArray.get(0);
        assertNotNull(ilucsbCurrencySettlementTotalArray);
        assertEquals("USD", ilucsbCurrencySettlementTotalArray.getSettlementCurrencyCode().value());
        //assertEquals("10000", ilucsbCurrencySettlementTotalArray.getCurrencyTotalForSettlement());
    }
}
