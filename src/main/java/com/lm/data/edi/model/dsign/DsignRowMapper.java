package com.lm.data.edi.model.dsign;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class DsignRowMapper {

    /**
     * recordTypeD01
     */
    private String companyCode;
    private String workDate;
    private String settlementPeriodStart;
    private String settlementPeriodEnd;
    /**
     * group1array -->> controlRecordD08
     */
    private String settlementCurrencyCodeISO;
    private String signingDate;
    //private String companyCode;
    private  String settlementDate;

    //centralSettlementReserveReleaseAmountTotal
    private String cenSetmtResrvRelseAmtTotal;
    //centralSettlementTTYStatementAmountTotal
    private String cenSetmtTTYStmentAmtTotal;
    //centralSettlementClaimAmountTotal
    private String cenSetmtClaimAmtTotal;
    //nonCentralSettlementPremiumAmountTotal
    private String nonCenSetmtPremiumAmtTotal;
    //nonCentralSettlementReserveReleaseAmountTotal
    private String nonCenSetmtReserveReleaseAmtTotal;
    //nonCentralSettlementTTYStatementAmountTotal
    private String nonCenSetmtTTYStmtAmtTotal;
    //nonCentralSettlementClaimAmountTotal
    private  String nonCenSetmtClaimAmtTotal;
    private String deferredAmountTotal;
    private  String reserveCreditAmountTotal;
    private List<String> actualSigningAndClaimsDataAray;
    private  String premiumsD02;
    private  String claimsD03;
    private String treatyStatementFDODO4;
    private String treatyStatementSigningsD05;
    private String defferedD02;
    private String adjustmentD02;
    private String otherPremiumsTypesD02;
    private String D02D03D04D05CommonContainers;
    private String paymentMethodIndicator;
    private String dueDate;
    private String premiumProportionOriginalCurrency;
    private String premiumProportionSettlementCurrency;

    private String adjustmentDataIndicator;
    private String adjustedRate;
    private String D02D03D04D05InCommon;
    private String originalCurrencyISO;
    private String minimumPremium;
    private String depositPremium;
    private String exchangeRateMinimumPremium;
    private String minimumPremiumTotal;
    private String minimumAndDepositPremiumNarrative;
    private String coInsuranceIndicator;
    private String cedentPremiumPaid;
    private String exchangeRateMinimumPremiumISO;
    private String reappointedPremiumRateOfExchange;
    private String adjustedAmount;
    private String previouslyPaid;
    private String adjustmentDue;
    private String minimumReapointedAmount;
    private String itemsTableD05;
    private String addClaimsPresent;
    private String addClaimsNew;
    private String dateOfLoss;
    private String majorCasualtyNumber;
    private String propertyClaimsServiceCode;
    private String lossName ;
    private String claimNature;
    private String lossDetails;
    private String claimReserveRetained;
    private String claimReserveReleased;
    private String outstandingClaimsRetained;
    private String outstandingClaimsReleased;
    private String claimPortfolioIncoming;
    private String claimPortfolioOutgoing;
    private String  reinsuranceRecoveries;
    private String claimReserveOCAInterest;
    private String outstandingLosses;
    private String  paidClaims;
    private String  paidRefunds;
    private String  cashLosses;
    private String  cashLossContraEntry;
    private String  amendmentRecordDA1;
    private String  changeDate;
    private String carrierIdentificationCode;
    private String  dsignCompanyCode;
    private String  memberShortName;
    private String  brokerCodeShort;
    private String brokerPseudonym;
    private String  brokerShortName;
    private String brokerReference;
    private String  secondaryBrokerReference;
    private String  lirmaSigningReferenceAmended;
    private String originalMemberReference;
    private String newMemberReference;

    private String carrierIdCode;
    private String settlementCurrencyCodeILU;
    private String mandatorySumInsuredProperties;
    private String sumInsuredProperties;

    private String total;
    private String currencyCodeISO;
    private String currencyCodeILU;
    private String sumInsuredIncreasedIndicator;
    private String nonStandardIndicator ;

    private  String mandatorySlipLineProperties;
    private String slipOrder;
    private String revisedSlipOrder;
    private String nonStandardSlipOrder;
    private String  mandatoryPeriodProperties;
    private String startDate;
    private String endDate;
    private String nonStandardPolicyPeriod;

    private String numberD05Items;
    private String amountItems;
    private String memberSettlementAmount;
    private String outstandingLoss;

    private String transactionTypeCodeIndicator;
    private String entryType2;
    private String centralSettlementIndicator;
    //private String carrierIdentificationCode;
    private String carrierShortName;
    private String carrierReference;
    private String settlementIndicator;

    private String psacSigningReference;
    private String policySigningAccountingOfficeNumber;
    private String alternativePSACFormNumber;
    private String originalCurrencyILU;

    private String settledInOriginalCurrency;
    private String originalPolicyholderName;
    private String interestInsured;
    private String perilsInsured;
    private String locationInsured;
    private String originalSumInsuredTotal;
    private String sumInsuredRevised;
    private String originalSlipOrder;
    private String revisedOriginalSlipOrder;
    private String policyOriginalDates;
    private String originalPremiumDates;
    private String previousNetAmount;
    private String brokerContacts;
    private String  adjustmentExpectedIndicator;
    private String VATCode;
    private String attachmentsIndicator;
    private String initialsSigningDataAdministrator;
    private String claimBulkSettlementIndicator;
    private String multipleSmallRisksIncludedIndicator;
    private String rateOfExchange;
    private String totaShareBureauMembers;
    private String insurersWrittenLine;
    private String grossPremium;
    private String grossPremiumOriginalCurrencyCompanyShare;
    private String grossPremiumSettlementCurrencyCompanyShare;
    private String brokerageAmountOriginalCurrency;
    private String  brokerageAmountSettlementCurrency;
    private String  taxDeductedOriginalCurrency;
    private String taxDeductedSettlementCurrency;
    private String otherDeductionsOriginalCurrency;
    private String  otherDeductionsSettlementCurrency;
    private String netPremiumOrClaimProportionOriginalCurrency;
    private String netPremiumOrClaimProportionSettlementCurrency;
    private String brokeragePercentage;
    private String taxPercentage;
    private String otherDeductionsPercentage;
    private String  terrorismIndicator;
    private String  premiumTaxSettlementCurrency;
    private String  brokerCode;
    private String uniqueMarketReference;
    private String premiumTaxOriginalCurrency;
    private String  insurancePremiumTaxPercentage;
    private String  dsignEntryTypeCode;
    private String delinkedTransactionIndicator;
    private String brokerPhoneNumber;


}
