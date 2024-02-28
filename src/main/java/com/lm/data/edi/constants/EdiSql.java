package com.lm.data.edi.constants;

public class EdiSql {
    public static final String ILUCSB_SQL_QUERY_1 = "SELECT " +
    	    "market_id AS marketID, " +
    	    "TO_CHAR(planned_settlement_date, 'YYYY-MM-DD') AS settlementDate, " +
    	    "sp.settlement_group_code AS companyAccountingCode, " +
    	    "CONCAT(TO_CHAR(start_date, 'YYYY'), LPAD(run_number, 3, '0')) AS settlementRunNumber, " +
    	    "market_id AS companyCode, " +
    	    "TO_CHAR(sp.actual_payment_date, 'YYYY-MM-DD') AS actualPaymentDate, " +
    	    "sp.currency_code AS settlementCurrencyCode, " +
    	    "sp.account_identifier AS brokerCode, " +
    	    "qualifying_category_code AS businessCategory, " +
    	    "signing_reference AS iluReference, " +
    	    "payment_amount AS netPremiumClaim, " +
    	    "planned_settlement_date AS settlementDueDate, " +
    	    "instalment_number AS instalmentNumber " +
    	    "FROM " +
    	    "dw.tdwh_settlement_payment_hub sp, " +
    	    "dw.tdwh_settlement_schedule_hub ss, " +
    	    "dw.tdwh_settlement_net_hub, " +
    	    "dw.tdwh_settlement_aggregation_hub, " +
    	    "dw.tdwh_premium_settlement_hub " +
    	    "WHERE " +
    	    "ss.id = sp.settlement_schedule " +
    	    "AND sp.net_settlement_id = dw.tdwh_settlement_net_hub.net_settlement_id " +
    	    "AND dw.tdwh_settlement_aggregation_hub.aggregation_id = dw.tdwh_settlement_net_hub.aggregation_id " +
    	    "AND dw.tdwh_premium_settlement_hub.settlement_id = ss.premium_settlement_id " +
    	    "AND sp.market_id = ? ";

    public static final String ILUCSB_SQL_QUERY_2 = "AND sp.planned_settlement_date = ? ";

    public static final String ILUCSB_SQL_QUERY_3 = "AND sp.actual_payment_date BETWEEN TO_DATE(?,'YYYY-MM-DD')+1 AND TO_DATE(?,'YYYY-MM-DD')+1";

    public static final String WSETT_SQL_QUERY =
                    "SELECT top 2\n" +
                    "substring(tbh.broker_code,1,4) as brokerCode,\n" +
                    "right (substring(tbh.broker_code,1,4),3) as brokerCodeShort,\n" +
                    "left (tcb.broker_claim_reference_1,12) as brokerReference,\n" +
                    "left (tcb.broker_claim_reference_2,12) as brokerSecondaryReference,\n" +
                    "right (substring(tbh.broker_code,1,4),3) as brokerShortCode,\n" +
                    "substring(tbs01.broker_name,1,20) as brokerShortName,\n" +
                    "substring('carrierIdentificationCode',1,5) as carrierIdentificationCode,\n" +
                    "substring(substring('carrierIdentificationCode',1,5),3) as carrierIdentificationDSIGNGroupCode,\n" +
                    "substring(substring('carrierIdentificationCode',1,5),3) as carrierIdentificationGroupCode,\n" +
                    "substring('carriername',1,9) as carriername,\n" +
                    "substring('company_reference_1',1,12) as carrierReference,\n" +
                    "substring('company_reference_2',1,12) as carrierSecondaryReference,\n" +
                    "substring('carriername',1,12) as carrierShortName,\n" +
                    "'carriersProportionAmountOriginalCurrency' as carriersProportionAmountOriginalCurrency,\n" +
                    "tsnh.net_settlement_amount as carriersProportionAmountSettlementCurrency,\n" +
                    "'companyIdentificationDSIGNGroupCode' as companyIdentificationDSIGNGroupCode,\n" +
                    "'centralSettlementCashAmountTotal' as centralSettlementCashAmountTotal,\n" +
                    "'centralSettlementClaimAmountTotal' as centralSettlementClaimAmountTotal,\n" +
                    "'centralSettlementDeferredAmountTotal' as centralSettlementDeferredAmountTotal,\n" +
                    "tsph.payment_method as centralSettlementIndicator,\n" +
                    "sysdate as currentdate,\n" +
                    "tpsh.qualifying_category_code as defferedPaymentIndicator,\n" +
                    "'entrytype' as entrytype,\n" +
                    "'lastDate' as lastDate,\n" +
                    "tsph.actual_payment_date as nettInstalmentDateOn,\n" +
                    "'nonCentralSettlementCashAmountTotal' as nonCentralSettlementCashAmountTotal,\n" +
                    "'nonCentralSettlementClaimAmountTotal' as nonCentralSettlementClaimAmountTotal,\n" +
                    "'CentralSettlementReserveReleaseAmountTotal' as CentralSettlementReserveReleaseAmountTotal,\n" +
                    "substring(cor.original_currency_code,1,3) as originalCurrencyISOCode,\n" +
                    "cor.settlement_amt_original_curr as settledInOriginalCurrencyIndicator,\n" +
                    "ccs.carrier_signing_number_date as policySigningAccountingOfficeNumber,\n" +
                    "'settlementActualPaymentDate' as settlementActualPaymentDate,\n" +
                    "'settlementCurrencyILUCode' as settlementCurrencyILUCode,\n" +
                    "'settlementCurrencyISOCode' as settlementCurrencyISOCode,\n" +
                    "'settlementPeriodEnd' as settlementPeriodEnd,\n" +
                    "'settlementPeriodEndDate' as settlementPeriodEndDate,\n" +
                    "'settlementPeriodStartDate' as settlementPeriodStartDate\n" +
                    "from dw.tdwh_claim_hub as tcb\n" +
                    "left join dw.tdwh_broker_hub as tbh\n" +
                    "on tcb.id = tbh.id\n" +
                    "left join dw.tdwh_broker_s01 as tbs01\n" +
                    "on tcb.id =tbs01.id\n" +
                    "left join dw.tdwh_settlement_net_hub as tsnh\n" +
                    "on tcb.id= tsnh.id\n" +
                    "left join dw.tdwh_settlement_payment_hub as tsph\n" +
                    "on tcb.id=tsph.id\n" +
                    "left join dw.tdwh_premium_settlement_hub as tpsh\n" +
                    "on tcb.id=tpsh.id\n" +
                    "left join icoslanding.claim_office_reference as cor\n" +
                    "on tcb.claim_id =cor.claim_id\n" +
                    "left outer join icoslanding.claim_carrier_signing as ccs\n" +
                    "on tcb.claim_id =ccs.carrier_response_id\n";

    public static final String MCM_SQL_QUERY = "select\n" +
            "'MOA' as segmentTag,\n" +
            "'NCR' as monetoryAmountQualifier,\n" +
            "123.56 as amount,\n" +
            "a.currency_code as currency,\n" +
            "'TXN' as controlQualifier,\n" +
            "'1' as transactionCount,\n" +
            "'CMP' as dateTimeQualifier,\n" +
            "'01/01/2024' as controlMessagePeriod,\n" +
            "d.account_year  as yearOfAccount,\n" +
            "'CON' as messageName,\n" +
            "'4' as userNumber,\n" +
            "'00000001' as messageReferenceNumber,\n" +
            "'0' as processingIndicatorAuditOrRiskCode,\n" +
            "'PRM' as processingIndicatorBusinessCategoryCode,\n" +
            "'NAC' as gisQualifier,\n" +
            "'1' as separatorId,\n" +
            "'SYN' as nameAndAddressQualifier,\n" +
            "c.lloyds_advising_syndicate as partyIdentificationCoded\n" +
            "FROM\n" +
            "dw.tdwh_settlement_net_hub a\n"+
            "left join dw.tdwh_settlement_payment_hub b\n" +
            "on a.net_settlement_id = b.net_settlement_id \n"+
            "left join dw.tdwh_settlement_payment_tax_hub c\n" +
            "on b.payment_id = c.payment_id\n" +
            "left join dw.tdwh_premium_settlement_hub d \n"+
            "on c.payment_id = d.payment_id\n";

}
