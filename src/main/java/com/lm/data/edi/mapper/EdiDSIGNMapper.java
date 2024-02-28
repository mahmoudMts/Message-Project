package com.lm.data.edi.mapper;


import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.model.dsign.*;
import org.apache.commons.lang.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EdiDSIGNMapper {

    final  public static String DEFAULT_DATE_FORMAT="yyyy-MM-dd";
    public Dsign mapIlucsbData(ResultSet dsignRowMapper) {
        Dsign dsign =Dsign.builder().build();
        List<DSIGNnotificationPayloadMessagePayload> messagePayloadList = new ArrayList<>();
        DSIGNnotificationPayloadMessagePayload messagePayload=null;
        SigningDataDetails signingDataDtlds = null;
        if(Objects.nonNull(dsignRowMapper)) {
            try {
                while (dsignRowMapper.next()) {
                    messagePayload= DSIGNnotificationPayloadMessagePayload.builder().build();
                    List<RecordTypeD01Inner> recordTypeD01List = getRecordTypeD01Inners(dsignRowMapper);

                    SumInsuredProperties sumInsuredRevised = SumInsuredProperties.builder()
                            .currencyCodeILU(dsignRowMapper.getString(""))
                            .currencyCodeISO("")
                            .total("")
                            .sumInsuredIncreasedIndicator(SumInsuredProperties
                                    .SumInsuredIncreasedIndicator.fromValue(""))
                            .nonStandardIndicator(SumInsuredProperties
                                    .NonStandardIndicator.fromValue(""))
                            .build();

                    SumInsuredProperties additionalPremiumSumInsured = SumInsuredProperties.builder()
                            .currencyCodeILU("")
                            .currencyCodeISO("")
                            .total("")
                            .sumInsuredIncreasedIndicator(SumInsuredProperties
                                    .SumInsuredIncreasedIndicator.fromValue(""))
                            .nonStandardIndicator(SumInsuredProperties
                                    .NonStandardIndicator.fromValue(""))
                            .build();
                    SumInsuredProperties originalSumInsuredTotal = SumInsuredProperties.builder()
                            .currencyCodeILU("")
                            .currencyCodeISO("")
                            .total("")
                            .sumInsuredIncreasedIndicator(SumInsuredProperties
                                    .SumInsuredIncreasedIndicator.fromValue(""))
                            .nonStandardIndicator(SumInsuredProperties
                                    .NonStandardIndicator.fromValue(""))
                            .build();
                    /*MandatorySumInsuredProperties originalSumInsuredTotal = MandatorySumInsuredProperties
                            .builder().build();
                    originalSumInsuredTotal.setTotal("");
                    originalSumInsuredTotal.setCurrencyCodeILU("");
                    originalSumInsuredTotal.setSumInsuredIncreasedIndicator(SumInsuredProperties
                            .SumInsuredIncreasedIndicatorEnum.fromValue(""));
                    originalSumInsuredTotal.setCurrencyCodeISO("");
                    originalSumInsuredTotal.setNonStandardIndicator(
                            SumInsuredProperties.NonStandardIndicator.fromValue(""));*/

                    SlipLineProperties originalSlipOrder= SlipLineProperties.builder()
                            .slipOrder(Double.valueOf(""))
                            .revisedSlipOrder(Double.valueOf(""))
                            .nonStandardSlipOrder(SlipLineProperties
                                    .NonStandardSlipOrder.fromValue(""))
                            .build();

                    /*MandatorySlipLineProperties originalSlipOrder = MandatorySlipLineProperties
                            .builder().build();
                    originalSlipOrder.setNonStandardSlipOrder(SlipLineProperties
                            .NonStandardSlipOrderEnum.fromValue(""));
                    originalSlipOrder.setSlipOrder(Double.valueOf(""));
                    originalSlipOrder.setRevisedSlipOrder(Double.valueOf(""));*/
                    SlipLineProperties revisedOriginalSlipOrder= SlipLineProperties.builder()
                            .slipOrder(Double.valueOf(""))
                            .revisedSlipOrder(Double.valueOf(""))
                            .nonStandardSlipOrder(SlipLineProperties
                                    .NonStandardSlipOrder.fromValue(""))
                            .build();
                   /* MandatorySlipLineProperties revisedOriginalSlipOrder = MandatorySlipLineProperties
                            .builder().build();
                    originalSlipOrder.setNonStandardSlipOrder(SlipLineProperties
                            .NonStandardSlipOrderEnum.fromValue(""));
                    originalSlipOrder.setSlipOrder(Double.valueOf(""));
                    originalSlipOrder.setRevisedSlipOrder(Double.valueOf(""));*/

                    SlipLineProperties additionalPremiumSlipOrder = SlipLineProperties.builder()
                            .revisedSlipOrder(Double.valueOf(""))
                            .slipOrder(Double.valueOf(""))
                            .nonStandardSlipOrder(SlipLineProperties
                                    .NonStandardSlipOrder.fromValue("")).build();

                    PeriodProperties policyOriginalDates = PeriodProperties.builder()
                            .endDate("")
                            .startDate("")
                            .nonStandardPolicyPeriod(PeriodProperties
                                    .NonStandardPolicyPeriodEnum.fromValue("")).build();
                    /*MandatoryPeriodProperties policyOriginalDates = MandatoryPeriodProperties.builder().build();
                    policyOriginalDates.setEndDate(getDateFromString("", DEFAULT_DATE_FORMAT));
                    policyOriginalDates.setStartDate(getDateFromString("", DEFAULT_DATE_FORMAT));
                    policyOriginalDates.setNonStandardPolicyPeriod(PeriodProperties
                            .NonStandardPolicyPeriodEnum.valueOf(""));*/

                    PeriodProperties revisedPolicyDates = PeriodProperties.builder()
                            .endDate("")
                            .startDate("")
                            .nonStandardPolicyPeriod(PeriodProperties
                                    .NonStandardPolicyPeriodEnum.fromValue("")).build();

                    PeriodProperties originalPremiumDates = PeriodProperties.builder().build();
                    originalPremiumDates.setNonStandardPolicyPeriod(PeriodProperties
                            .NonStandardPolicyPeriodEnum.fromValue(""));
                    originalPremiumDates.setStartDate("");
                    originalPremiumDates.setEndDate("");

                    /*MandatoryPeriodProperties originalPremiumDates = MandatoryPeriodProperties.builder().build();
                    originalPremiumDates.setNonStandardPolicyPeriod(PeriodProperties
                            .NonStandardPolicyPeriodEnum.fromValue(""));
                    originalPremiumDates.setStartDate(getDateFromString("", DEFAULT_DATE_FORMAT));
                    originalPremiumDates.setEndDate(getDateFromString("", DEFAULT_DATE_FORMAT));
*/
                    PeriodProperties additionalPremiumDates = PeriodProperties.builder()
                            .endDate("")
                            .startDate("")
                            .nonStandardPolicyPeriod(PeriodProperties
                                    .NonStandardPolicyPeriodEnum.fromValue("")).build();

                    D02D03D04D05InCommon d02D03D04D05InCommon = D02D03D04D05InCommon.builder()
                            .settledInOriginalCurrency(D02D03D04D05InCommon
                                    .SettledInOriginalCurrency.fromValue("")).
                            settlementCurrencyCodeILU(D02D03D04D05InCommon.SettlementCurrencyCodeILU.fromValue("")).
                            settlementCurrencyCodeISO(ControlRecordD08.SettlementCurrencyCodeISO.valueOf("")).
                            cedentName("").
                            originalPolicyholderName("").
                            interestInsured("").
                            perilsInsured("").
                            locationInsured("").
                            narrativeInformation("").
                            originalSumInsuredTotal(originalSumInsuredTotal).
                            sumInsuredRevised(sumInsuredRevised).
                            additionalPremiumSumInsured(additionalPremiumSumInsured).
                            originalSlipOrder(originalSlipOrder).
                            revisedOriginalSlipOrder(revisedOriginalSlipOrder).
                            additionalPremiumSlipOrder(additionalPremiumSlipOrder).
                            policyPeriodNarrative("").
                            policyOriginalDates(policyOriginalDates).
                            revisedPolicyDates(revisedPolicyDates).
                            narrativeInsuredDetails("").
                            originalPremiumDates(originalPremiumDates).
                            additionalPremiumDates(additionalPremiumDates).
                            additionalNarrativeDetails("").
                            additionalTransactionDetails("").
                            previousNetAmount("").
                            highestClaimEstimate("").
                            previouslySettled("").
                            outstandingClaimAmount("").
                            brokerClaimReference("").
                            brokerContacts("").
                            statementPeriodNarrative("").
                            statementPeriodStartDate("").
                            statementPeriodEndDate("").
                            adjustmentExpectedIndicator(D02D03D04D05InCommon.
                                    AdjustmentExpectedIndicator.valueOf("")).
                            attachmentsIndicator(D02D03D04D05InCommon.
                                    AttachmentsIndicator.valueOf("")).
                            initialsSigningDataAdministrator("").
                            multipleSmallRisksIncludedIndicator(D02D03D04D05InCommon
                                    .MultipleSmallRisksIncludedIndicator
                                    .fromValue("")).
                            slipLeaderShortName("").
                            leadingCompanyShortName("").
                            estimatedPremiumIncome("").
                            estimatedPremiumIncomeISO("").
                            writtenLine("").
                            tradeDateTerms("").
                            slipRegistrationSystemNumber("").
                            uniqueTransactionReference("").
                            claimMovementSequenceNumber("").
                            insurersClaimReference("").
                            insurersClaimReference2("").
                            rateOfExchange(Double.valueOf("")).
                            totaShareBureauMembers(Double.valueOf("")).
                            insurersWrittenLine(Double.valueOf("")).
                            grossPremium("").
                            grossPremiumOriginalCurrencyCompanyShare("").
                            grossPremiumSettlementCurrencyCompanyShare("").
                            brokerageAmountOriginalCurrency("").
                            brokerageAmountSettlementCurrency("").
                            taxDeductedOriginalCurrency("").
                            taxDeductedSettlementCurrency("").
                            otherDeductionsOriginalCurrency("").
                            otherDeductionsSettlementCurrency("").
                            netPremiumOrClaimProportionOriginalCurrency("").
                            netPremiumOrClaimProportionSettlementCurrency("").
                            brokeragePercentage(Double.valueOf("")).
                            taxPercentage(Double.valueOf("")).
                            otherDeductionsPercentage(Double.valueOf("")).
                            terrorismIndicator(D02D03D04D05InCommon.TerrorismIndicator.fromValue("")).
                            premiumTaxSettlementCurrency("").
                            brokerCode("").
                            uniqueClaimReference("").
                            uniqueMarketReference("").
                            transactionReference("").
                            premiumTaxOriginalCurrency("").
                            insurancePremiumTaxPercentage(Double.valueOf("")).
                            centralSettlementIndicator(D02D03D04D05InCommon
                                    .CentralSettlementIndicator.fromValue("")).
                            carrierIdentificationCode("").
                            carrierShortName("").
                            carrierReference("").
                            carrierSecondaryReference("").
                            brokerCodeShort("").
                            brokerPseudonym("").
                            brokerShortName("").
                            brokerReference("").
                            secondaryBrokerReference("").
                            settlementIndicator(D02D03D04D05InCommon
                                    .SettlementIndicator.fromValue("")).
                            settlementDate("").
                            psacSigningReference("").
                            policySigningAccountingOfficeNumber("").
                            alternativePSACFormNumber("").
                            lirmaSigningReferencePreviousTransaction("").
                            originalCurrencyILU("").
                            originalCurrencyISO("").
                            delinkedTransactionIndicator(D02D03D04D05InCommon
                                    .DelinkedTransactionIndicator.fromValue("")).
                            brokerPhoneNumber("").
                            claimBulkSettlementIndicator(D02D03D04D05InCommon
                                    .ClaimBulkSettlementIndicator.fromValue("")).
                            taxSettlementIndicator(D02D03D04D05InCommon
                                    .TaxSettlementIndicator.fromValue("")).
                            countryCode("").
                            dsignEntryTypeCode("")
                            .build();

                    List<ClaimsD03Inner> claimsD03List = new ArrayList<>();
                    ClaimsD03Inner claimsD03Inner = ClaimsD03Inner.builder()
                            .d02D03D04D05CommonContainers(d02D03D04D05InCommon)
                            .build();
                    claimsD03List.add(claimsD03Inner);

                    List<AdjustmentD02Inner> adjustmentD02List = new ArrayList<>();
                    AdjustmentD02Inner adjustmentD02Inner = AdjustmentD02Inner.builder().
                            d02D03D04D05CommonContainers(d02D03D04D05InCommon).
                            coInsuranceIndicator(AdjustmentD02Inner
                                    .CoInsuranceIndicator.fromValue("")).
                            cedentPremiumPaid("").
                            exchangeRateMinimumPremiumISO("").
                            reappointedPremiumRateOfExchange("").
                            adjustedAmount("").
                            previouslyPaid("").
                            adjustmentDue("").
                            minimumReapointedAmount("").
                            adjustmentDataIndicator(AdjustmentD02Inner
                                    .AdjustmentDataIndicator.fromValue("")).
                            adjustedRate("").
                            originalCurrencyISO("").
                            minimumPremium("").
                            depositPremium("").
                            exchangeRateMinimumPremium(Double.valueOf("")).
                            minimumPremiumTotal("").
                            minimumAndDepositPremiumNarrative("")
                            .build();
                    adjustmentD02List.add(adjustmentD02Inner);

                    List<DeferedD02Inner> deferedD02List = new ArrayList<>();
                    DeferedD02Inner deferedD02Inner = DeferedD02Inner.builder()
                            .d02D03D04D05CommonContainers(d02D03D04D05InCommon)
                            .dueDate("")
                            .paymentMethodIndicator(DeferedD02Inner
                                    .PaymentMethodIndicator.fromValue(""))
                            .premiumProportionSettlementCurrency("")
                            .premiumProportionOriginalCurrency("").build();
                    deferedD02List.add(deferedD02Inner);

                   List< PremiumsD02Inner> premiumsD02List = new ArrayList<>();
                    PremiumsD02Inner premiumsD02Inner = PremiumsD02Inner.builder()
                            .adjustmentD02(adjustmentD02List)
                            .defferedD02(deferedD02List)
                            .otherPremiumsTypesD02(d02D03D04D05InCommon)
                            .build();
                    premiumsD02List.add(premiumsD02Inner);

                    List<ItemsTableD05Inner> itemsTableD05List = new ArrayList<>();
                    ItemsTableD05Inner itemsTableD05Inner = ItemsTableD05Inner.builder()
                            .amountItems("")
                            .numberD05Items("")
                            .memberSettlementAmount("")
                            .narrativeInformation1("")
                            .narrativeInformation2("")
                            .narrativeInformation3("")
                            .narrativeInformation4("")
                            .outstandingLoss(ItemsTableD05Inner
                                    .OutstandingLoss.fromValue("")).build();
                    itemsTableD05List.add(itemsTableD05Inner);

                    List<TreatyStatementSigningsD05Inner> treatyStatementSigningsD05List = new ArrayList<>();
                    TreatyStatementSigningsD05Inner treatyStatementSigningsD05Inner =
                            TreatyStatementSigningsD05Inner.builder()
                                    .addClaimsNew(new ArrayList<>())
                                    .d02D03D04D05CommonContainers(d02D03D04D05InCommon)
                                    .itemsTableD05(itemsTableD05List)
                                    .addClaimsPresent(TreatyStatementSigningsD05Inner
                                            .AddClaimsPresent.fromValue(""))
                                    .build();
                    treatyStatementSigningsD05List.add(treatyStatementSigningsD05Inner);
                    List<ActualSigningAndClaimsDataAray> actualSigningAndClaimsDataAraysList=
                            new ArrayList<>();
                    ActualSigningAndClaimsDataAray actualSigningAndClaimsDataAray
                            = ActualSigningAndClaimsDataAray.builder()
                            .claimsD03(claimsD03List)
                            .premiumsD02(premiumsD02List)
                            .treatyStatementFDODO4(d02D03D04D05InCommon)
                            .treatyStatementSigningsD05(treatyStatementSigningsD05List)
                            .build();
                    actualSigningAndClaimsDataAraysList.add(actualSigningAndClaimsDataAray);

                    ControlRecordD08 controlRecordD08 = ControlRecordD08.builder()
                            .centralSettlementReserveReleaseAmountTotal("")
                            .centralSettlementTTYStatementAmountTotal("")
                            .centralSettlementClaimAmountTotal("")
                            .nonCentralSettlementPremiumAmountTotal("")
                            .nonCentralSettlementTTYStatementAmountTotal("")
                            .nonCentralSettlementClaimAmountTotal("")
                            .nonCentralSettlementReserveReleaseAmountTotal("")
                            .companyCode("")
                            .deferredAmountTotal("")
                            .reserveCreditAmountTotal("")
                            .settlementDate(getDateFromString("", DEFAULT_DATE_FORMAT))
                            .signingDate(getDateFromString("", DEFAULT_DATE_FORMAT))
                            .settlementCurrencyCodeISO(
                                    ControlRecordD08.SettlementCurrencyCodeISO.valueOf(""))
                                    .actualSigningAndClaimsDataAray(actualSigningAndClaimsDataAraysList)
                            .build();

                    List<Group1arrayInner> group1arrayList = new ArrayList<>();
                    Group1arrayInner group1arrayInner = Group1arrayInner.builder().
                            controlRecordD08(controlRecordD08)
                            .build();
                    group1arrayList.add(group1arrayInner);

                    List<AmendmentRecordDA1Inner> amendmentRecordDA1 = new ArrayList<>();
                    AmendmentRecordDA1Inner amendmentRecordDA1Inner = AmendmentRecordDA1Inner.builder()
                            .brokerPseudonym("")
                            .brokerReference("")
                            .brokerCodeShort("")
                            .brokerShortName("")
                            .memberShortName("")
                            .carrierIdentificationCode("")
                            .changeDate(getDateFromString("", DEFAULT_DATE_FORMAT))
                            .dsignCompanyCode("")
                            .lirmaSigningReferenceAmended("")
                            .newMemberReference("")
                            .originalMemberReference("")
                            .build();
                    amendmentRecordDA1.add(amendmentRecordDA1Inner);

                    /*SigningDataDetailsInner signingDataDetailsInner = SigningDataDetailsInner.builder().build();
                    signingDataDetailsInner.setGroup1(group1arrayList);
                    signingDataDetailsInner.setAmendmentRecordDA1(amendmentRecordDA1);
                    signingDataDetailsInner.setRecordTypeD01(recordTypeD01List);*/
                    signingDataDtlds = SigningDataDetails.builder().build();
                    signingDataDtlds.setGroup1(group1arrayList);
                    signingDataDtlds.setAmendmentRecordDA1(amendmentRecordDA1);
                    signingDataDtlds.setRecordTypeD01(recordTypeD01List);
                    Date dsignDate = new Date();
                    AuditBlock auditBlock= AuditBlock.builder()
                            .at(dsignDate)
                            .user("")
                            .build();
                    HeaderDSIGN headerDSIGN= HeaderDSIGN.builder()
                            .currentDate("")
                            .carrierName("")
                            .messageNo("")
                            .carrierIdentificationGroupCode("")
                            .signingDate("")
                            .build();
                    messagePayload.setSigningDataDetails(signingDataDtlds);
                    messagePayload.setAudit(auditBlock);
                    messagePayload.setHeader(headerDSIGN);
                }
                messagePayloadList.add(messagePayload);
            } catch (SQLException e) {
            throw  new EdiRuntimeException("SQLException in handleRequest "+e.getMessage());
            }
        }
        dsign.setMessagePayload(messagePayloadList);
            return dsign;
        }

    private List<RecordTypeD01Inner> getRecordTypeD01Inners(ResultSet dsignRowMapper) throws SQLException {
        List<RecordTypeD01Inner> recordTypeD01List = new ArrayList<>();
        RecordTypeD01Inner recordTypeD01Inner = RecordTypeD01Inner.builder().
                settlementPeriodEnd(getDateFromString("", DEFAULT_DATE_FORMAT)).
                settlementPeriodStart("").
                settlementPeriodEnd(getDateFromString("", DEFAULT_DATE_FORMAT))
                .workDate("")
                .companyCode(dsignRowMapper.getString(""))//TODO Comapny code
                .build();
        recordTypeD01List.add(recordTypeD01Inner);
        return recordTypeD01List;
    }

    private LocalDate getDateFromString(String inputDate,String formate)
    {
        LocalDate date =null;
        try {
            if (StringUtils.isNotEmpty(inputDate) && StringUtils.isNotEmpty(formate)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formate);
                date = LocalDate.parse(inputDate, formatter);
            }
            else {
                throw new DateTimeException("Unable to parse date time ") ;
            }
        }
        catch (DateTimeException dateTimeException)
        {
            throw new DateTimeException("Unable to parse date time ") ;
        }
        return date;
    }
}
