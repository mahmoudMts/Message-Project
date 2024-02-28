package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This object is a specific amoutItem associated to another object.
 */

@JsonTypeName("amountItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class AmountItem implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * This will describe the type of amount that is being described
   */
  public enum TypeNameEnum {
    LEADER_FEES("leader_fees"),
    
    OVERRIDER_COINSURANCE("overrider_coinsurance"),
    
    LOSS_REVIEW_PREMIUM("loss_review_premium"),
    
    BROKERAGE("brokerage"),
    
    PREMIUM("premium"),
    
    PROVISIONAL_PREMIUM("provisional_premium"),
    
    ADJUSTMENT_PREMIUM_DUE_BY_SENDER("adjustment_premium_due_by_sender"),
    
    RETROSPECTIVE_PREMIUM_ADJUSTMENT_DUE_BY_SENDER("retrospective_premium_adjustment_due_by_sender"),
    
    INSTALMENT_PREMIUM("instalment_premium"),
    
    INURING_OR_COMMON_ACCOUNT_RI_PREMIUM("inuring_or_common_account_ri_premium"),
    
    LAIDUP_RETURN_PREMIUM("laidup_return_premium"),
    
    REINSTATEMENT_PREMIUM("reinstatement_premium"),
    
    PREMIUM_RELATED_FEES("premium_related_fees"),
    
    PREMIUM_PORTFOLIO_IN("premium_portfolio_in"),
    
    PREMIUM_PORTFOLIO_WITHDRAWAL("premium_portfolio_withdrawal"),
    
    REINSURANCE_COMMISSION("reinsurance_commission"),
    
    PROVISIONAL_SLIDING_SCALE_COMMISSION("provisional_sliding_scale_commission"),
    
    ADJUSTMENT_SLIDING_SCALE_COMMISSION_DUE_TO_SENDER("adjustment_sliding_scale_commission_due_to_sender"),
    
    ADDITIONAL_COMMISSION_NOT_PROFIT_RELATED("additional_commission_not_profit_related"),
    
    OVERRIDING_COMMISSION("overriding_commission"),
    
    PROFIT_COMMISSION("profit_commission"),
    
    NOCLAIM_BONUS("noclaim_bonus"),
    
    COMMISSION_ON_PREMIUM_PORTFOLIO_ENTRY("commission_on_premium_portfolio_entry"),
    
    COMMISSION_ON_PREMIUM_PORTFOLIO_WITHDRAWAL("commission_on_premium_portfolio_withdrawal"),
    
    REINSURANCE_DEDUCTIONS("reinsurance_deductions"),
    
    DIFFERENCES_ON_EXCHANGE_RATE_FLUCTUATIONS_DUE_TO_SENDER("differences_on_exchange_rate_fluctuations_due_to_sender"),
    
    DIFFERENCES_ON_EXCHANGE_RATE_FLUCTUATIONS_DUE_FROM_SENDER("differences_on_exchange_rate_fluctuations_due_from_sender"),
    
    ADJUSTMENT_SLIDING_SCALE_COMMISSION_DUE_FROM_SENDER("adjustment_sliding_scale_commission_due_from_sender"),
    
    SALVAGE_OR_SUBROGATION_RECOVERED_TO_CONTRACT_LOSS("salvage_or_subrogation_recovered_to_contract_loss"),
    
    LOSS_PORTFOLIO_IN("loss_portfolio_in"),
    
    LOSS_PORTFOLIO_WITHDRAWAL("loss_portfolio_withdrawal"),
    
    DEPOSIT_RETAINED_UNEARNED_PREMIUM("deposit_retained_unearned_premium"),
    
    DEPOSIT_RETAINED_PREMIUM_FUND("deposit_retained_premium_fund"),
    
    DEPOSIT_RETAINED_OUTSTANDING_LOSSES("deposit_retained_outstanding_losses"),
    
    OUTSTANDING_CLAIMS_ADVANCE_RETAINED("outstanding_claims_advance_retained"),
    
    DEPOSIT_RELEASED_UNEARNED_PREMIUM("deposit_released_unearned_premium"),
    
    DEPOSIT_RELEASED_PREMIUM_FUND("deposit_released_premium_fund"),
    
    DEPOSIT_RELEASED_OUTSTANDING_LOSSES("deposit_released_outstanding_losses"),
    
    DEPOSIT_RELEASED_LOSS_RESERVE_FUND("deposit_released_loss_reserve_fund"),
    
    OUTSTANDING_CLAIMS_ADVANCE_RELEASED("outstanding_claims_advance_released"),
    
    INTEREST_ON_PREMIUM_RESERVE("interest_on_premium_reserve"),
    
    TAX_ON_DEPOSIT_INTEREST("tax_on_deposit_interest"),
    
    TAX_ON_CLAIM_RESERVE_OCA_INTEREST("tax_on_claim_reserve_oca_interest"),
    
    TAX_ON_INTEREST_FOR_LATE_PAYMENT("tax_on_interest_for_late_payment"),
    
    TAX_ON_INTEREST_ON_PORTFOLIO_RESERVE("tax_on_interest_on_portfolio_reserve"),
    
    TAX_ON_INTEREST_ON_PREMIUM_RESERVE("tax_on_interest_on_premium_reserve"),
    
    TAX_ON_LOSS_DEPOSIT_INTEREST("tax_on_loss_deposit_interest"),
    
    TAX_ON_PREMIUM_DEPOSIT_INTEREST("tax_on_premium_deposit_interest"),
    
    UNEARNED_PREMIUM_GROSS("unearned_premium_gross"),
    
    RESERVE_FOR_LOSSES_INCURRED_BUT_NOT_REPORTED("reserve_for_losses_incurred_but_not_reported"),
    
    OUTSTANDING_LOSS_RESERVE_REINSURANCE_FOR_COMMON_ACCOUNT("outstanding_loss_reserve_reinsurance_for_common_account"),
    
    UNDERLYING_PREMIUM("underlying_premium"),
    
    RETROSPECTIVE_PREMIUM_ADJUSTMENT_DUE_TO_SENDER("retrospective_premium_adjustment_due_to_sender"),
    
    OUTSTANDING_LOSS_FOR_THE_CONTRACT_AFTER_RETENTION("outstanding_loss_for_the_contract_after_retention"),
    
    CURRENT_PAYMENT_LOSSES_FOR_THE_CONTRACT("current_payment_losses_for_the_contract"),
    
    CURRENT_PAYMENT_EXPENSES_FOR_THE_CONTRACT("current_payment_expenses_for_the_contract"),
    
    OUTSTANDING_LOSS_AND_EXPENSE_FOR_CONTRACT_AFTER_RETENTION("outstanding_loss_and_expense_for_contract_after_retention"),
    
    CLAIM_REFUND_TOTAL("claim_refund_total"),
    
    ADJUSTMENT_PREMIUM_DUE_TO_SENDER("adjustment_premium_due_to_sender"),
    
    CLAIM_RESERVE_OCA_INTEREST("claim_reserve_oca_interest"),
    
    DEPOSIT_PREMIUM("deposit_premium"),
    
    MANAGEMENT_EXPENSES("management_expenses"),
    
    ADJUSTMENT_REINSTATEMENT_PREMIUM_DUE_BY_SENDER("adjustment_reinstatement_premium_due_by_sender"),
    
    ADJUSTMENT_REINSTATEMENT_PREMIUM_DUE_TO_SENDER("adjustment_reinstatement_premium_due_to_sender"),
    
    FRONTING_FEE("fronting_fee"),
    
    INURING_OR_COMMON_ACCOUNT_REINSURANCE_AMOUNT_LOSS("inuring_or_common_account_reinsurance_amount_loss"),
    
    SUBROGATION_RECOVERED_AMOUNT_TO_CONTRACT_EXP("subrogation_recovered_amount_to_contract_exp"),
    
    SUBROGATION_RECOV_AMOUNT_TO_CONTRACT_LOSS_PLUS_EXP("subrogation_recov_amount_to_contract_loss_plus_exp"),
    
    SALVAGE_RECOVERED_ACTUAL_AMOUNT_TO_CONTRACT_LOSS("salvage_recovered_actual_amount_to_contract_loss"),
    
    SALVAGE_RECOVERED_ACTUAL_AMOUNT_TO_CONTRACT_EXP("salvage_recovered_actual_amount_to_contract_exp"),
    
    SALVAGE_RECOVERED_AMOUNT_TO_CONTRACT_LOSS_PLUS_EXP("salvage_recovered_amount_to_contract_loss_plus_exp"),
    
    CLAIM_AUDIT_FEES("claim_audit_fees"),
    
    EXPENSE_IN_RECOVERY_OF_SALVAGESUBROGATION("expense_in_recovery_of_salvagesubrogation"),
    
    DEFERRED_COMMISSION_RETAINED("deferred_commission_retained"),
    
    DEFERRED_COMMISSION_RELEASED("deferred_commission_released"),
    
    DEFERRED_PREMIUM_RETAINED("deferred_premium_retained"),
    
    DEFERRED_PREMIUM_RELEASED("deferred_premium_released"),
    
    POLICY_FEES("policy_fees"),
    
    NONCASH_PREMIUM_DEPOSIT_RETAINED("noncash_premium_deposit_retained"),
    
    NONCASH_PREMIUM_DEPOSIT_RELEASED("noncash_premium_deposit_released"),
    
    PROFESSIONAL_ADVISOR_FEES_INCURRED("professional_advisor_fees_incurred"),
    
    PROFESSIONAL_ADVISOR_FEES_OUTSTANDING("professional_advisor_fees_outstanding"),
    
    PROFESSIONAL_ADVISOR_FEES_CURRENT_PAYMENT("professional_advisor_fees_current_payment"),
    
    OTHER_DEDUCTIONS("other_deductions"),
    
    ENGINEERING_FEES("engineering_fees"),
    
    BONUS_FOR_LOW_CLAIMS("bonus_for_low_claims"),
    
    DISCOUNT_FOR_PROMPT_PAYMENT("discount_for_prompt_payment"),
    
    INURING_REINSURANCE_AMOUNT_PREMIUM("inuring_reinsurance_amount_premium"),
    
    COMMON_ACCOUNT_REINSURANCE_AMOUNT_PREMIUM("common_account_reinsurance_amount_premium"),
    
    INURING_REINSURANCE_AMOUNT_LOSS("inuring_reinsurance_amount_loss"),
    
    INURING_REINSURANCE_AMOUNT_EXPENSE("inuring_reinsurance_amount_expense"),
    
    INURING_REINSURANCE_AMOUNT_LOSS_PLUS_EXPENSE("inuring_reinsurance_amount_loss_plus_expense"),
    
    COMMON_ACCOUNT_REINSURANCE_AMOUNT_LOSS("common_account_reinsurance_amount_loss"),
    
    COMMON_ACCOUNT_REINSURANCE_AMOUNT_EXPENSE("common_account_reinsurance_amount_expense"),
    
    COMMON_ACCOUNT_REINSURANCE_AMOUNT_LOSS_PLUS_EXPENSE("common_account_reinsurance_amount_loss_plus_expense"),
    
    SUBSCRIPTION_MARKET_BROKERAGE("subscription_market_brokerage"),
    
    DEPOSIT_RETAINED_LOSS_RESERVE_FUND("deposit_retained_loss_reserve_fund"),
    
    OUTSTANDING_EXPENSE_FOR_THE_CONTRACT_AFTER_RETENTION("outstanding_expense_for_the_contract_after_retention"),
    
    CASH_LOSS_ADVANCE("cash_loss_advance"),
    
    CASH_LOSS_REFUND("cash_loss_refund"),
    
    LOSSES_RECOVERED_REINSURANCE_FOR_COMMON_ACCOUNT("losses_recovered_reinsurance_for_common_account"),
    
    CURRENT_PAYMENT_LOSSES_AND_EXPENSES_FOR_CONTRACT("current_payment_losses_and_expenses_for_contract"),
    
    CLAIM_REFUND_LOSSES("claim_refund_losses"),
    
    CLAIM_REFUND_EXPENSES("claim_refund_expenses"),
    
    LOSS_ADJUSTMENT_EXPENSES("loss_adjustment_expenses"),
    
    SALVAGE_OR_SUBROGATION_RECOVERED_TO_CONTRACT_TOTAL("salvage_or_subrogation_recovered_to_contract_total"),
    
    INURING_OR_COMMON_ACCOUNT_REINSURANCE_AMOUNT_EXPENSE("inuring_or_common_account_reinsurance_amount_expense"),
    
    SUBROGATION_RECOVERED_AMOUNT_TO_CONTRACT_LOSS("subrogation_recovered_amount_to_contract_loss"),
    
    TECHNICAL_ACCOUNT_SETTLEMENT_BALANCE_DUE_TO_SENDER("technical_account_settlement_balance_due_to_sender"),
    
    TECHNICAL_ACCOUNT_SETTLEMENT_BALANCE_DUE_BY_SENDER("technical_account_settlement_balance_due_by_sender"),
    
    TAX_ADDED_TO_GROSS_PREMIUM("tax_added_to_gross_premium"),
    
    TAX_DEDUCTED_FROM_GROSS_PREMIUM("tax_deducted_from_gross_premium"),
    
    TAX_DEDUCTED_FROM_COMMISSION("tax_deducted_from_commission"),
    
    TAX_DEDUCTED_FROM_BROKERAGE("tax_deducted_from_brokerage"),
    
    TAX_DEDUCTED_FROM_PROFIT_COMMISSION("tax_deducted_from_profit_commission"),
    
    TAX_DEDUCTED_FROM_LOSS_COSTS("tax_deducted_from_loss_costs"),
    
    TAX_DEDUCTED_FROM_CLAIMS("tax_deducted_from_claims"),
    
    TAX_ADDED_TO_BROKERAGE("tax_added_to_brokerage"),
    
    INSURANCE_COMMISSION("insurance_commission"),
    
    INSURANCE_AGENT_COMMISSION("insurance_agent_commission"),
    
    ACQUISITION_COSTS("acquisition_costs"),
    
    REINSURER_CLAIM_DISCOUNT("reinsurer_claim_discount"),
    
    RISK_MANAGEMENT_BURSARY("risk_management_bursary"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_LOSS_RESERVES_DUE_BY_SENDER("rate_of_exchange_adjustment_on_loss_reserves_due_by_sender"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_LOSS_RESERVES_DUE_TO_SENDER("rate_of_exchange_adjustment_on_loss_reserves_due_to_sender"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_PORTFOLIO_RESERVES_DUE_BY_SENDER("rate_of_exchange_adjustment_on_portfolio_reserves_due_by_sender"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_PORTFOLIO_RESERVES_DUE_TO_SENDER("rate_of_exchange_adjustment_on_portfolio_reserves_due_to_sender"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_PREMIUM_RESERVES_DUE_BY_SENDER("rate_of_exchange_adjustment_on_premium_reserves_due_by_sender"),
    
    RATE_OF_EXCHANGE_ADJUSTMENT_ON_PREMIUM_RESERVES_DUE_TO_SENDER("rate_of_exchange_adjustment_on_premium_reserves_due_to_sender"),
    
    LIABILITY_CLAIMS_WORKING_FUND("liability_claims_working_fund"),
    
    LOSS_PARTICIPATION("loss_participation"),
    
    TOTAL_OF_UNEARNED_PREMIUM_DEPOSIT("total_of_unearned_premium_deposit"),
    
    DEFERRED_PREMIUM_RETAINED_NET_OF_COMMISSION("deferred_premium_retained_net_of_commission"),
    
    DEFERRED_PREMIUM_RELEASED_NET_OF_COMMISSION("deferred_premium_released_net_of_commission"),
    
    INTEREST_FOR_LATE_PAYMENT("interest_for_late_payment"),
    
    INTEREST_ON_PORTFOLIO_RESERVE("interest_on_portfolio_reserve"),
    
    INURING_OR_COMMON_ACCOUNT_REINSURANCE_OUTSTANDING_AMOUNT_LOSS("inuring_or_common_account_reinsurance_outstanding_amount_loss"),
    
    INURING_OR_COMMON_ACCOUNT_REINSURANCE_OUTSTANDING_AMOUNT_EXPENSES("inuring_or_common_account_reinsurance_outstanding_amount_expenses"),
    
    CURRENT_PAYMENT_ANNUITIES("current_payment_annuities"),
    
    RESERVE_FOR_ANNUITIES("reserve_for_annuities"),
    
    DEPOSIT_RETAINED_ANNUITIES("deposit_retained_annuities"),
    
    DEPOSIT_RELEASED_ANNUITIES("deposit_released_annuities"),
    
    TAXFREE_INTEREST_ANNUITY_DEPOSIT("taxfree_interest_annuity_deposit"),
    
    TAXABLE_INTEREST_ANNUITY_DEPOSIT("taxable_interest_annuity_deposit"),
    
    ORIGINAL_COMMISSION_COLLECTED("original_commission_collected"),
    
    DEPOSIT_RELEASED_INCURRED_BUT_NOT_REPORTED_LOSSES("deposit_released_incurred_but_not_reported_losses"),
    
    DEPOSIT_RETAINED_INCURRED_BUT_NOT_REPORTED_LOSSES("deposit_retained_incurred_but_not_reported_losses");

    private String value;

    TypeNameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeNameEnum fromValue(String value) {
      for (TypeNameEnum b : TypeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeNameEnum typeName;

  private BigDecimal value;

  /**
   * Coded indication of what the amount given applies to
   */
  public enum AppliesToCodeEnum {
    TECHACCOUNT("techAccount"),
    
    INDIVIDUALCLAIM("individualClaim"),
    
    TAX("tax"),
    
    BALANCE("balance"),
    
    BALANCEINTARGETCURRENCY("balanceInTargetCurrency");

    private String value;

    AppliesToCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AppliesToCodeEnum fromValue(String value) {
      for (AppliesToCodeEnum b : AppliesToCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AppliesToCodeEnum appliesToCode;

  /**
   * Coded indication of the status of the amount item
   */
  public enum StatusCodeEnum {
    INFORMATIONAL("informational"),
    
    NOT_AVAILABLE("not_available"),
    
    SUBJECT_TO_PREMIUM_PAYMENT_WARRANTY("subject_to_premium_payment_warranty");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusCodeEnum fromValue(String value) {
      for (StatusCodeEnum b : StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusCodeEnum statusCode;

  private LocalDate dueDate;

  private Integer occurrenceYear;

  private LocalDate occurrenceStartDate;

  private LocalDate occurrenceEndDate;

  private String lossOrEventName;

  private String referredClaimUUId;

  @Valid
  private List<@Valid Reference> references;

  public AmountItem typeName(TypeNameEnum typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * This will describe the type of amount that is being described
   * @return typeName
  */
  

  @JsonProperty("typeName")
  public TypeNameEnum getTypeName() {
    return typeName;
  }

  public void setTypeName(TypeNameEnum typeName) {
    this.typeName = typeName;
  }

  public AmountItem value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * This is the numeric value of the described amountItemType.
   * @return value
  */
  @Valid 

  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AmountItem appliesToCode(AppliesToCodeEnum appliesToCode) {
    this.appliesToCode = appliesToCode;
    return this;
  }

  /**
   * Coded indication of what the amount given applies to
   * @return appliesToCode
  */
  

  @JsonProperty("appliesToCode")
  public AppliesToCodeEnum getAppliesToCode() {
    return appliesToCode;
  }

  public void setAppliesToCode(AppliesToCodeEnum appliesToCode) {
    this.appliesToCode = appliesToCode;
  }

  public AmountItem statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Coded indication of the status of the amount item
   * @return statusCode
  */
  

  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  public AmountItem dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Date on which the associated amount is due to be paid.
   * @return dueDate
  */
  @Valid 

  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public AmountItem occurrenceYear(Integer occurrenceYear) {
    this.occurrenceYear = occurrenceYear;
    return this;
  }

  /**
   * Year in which a specific event (e.g. a loss) took place. European requirement to allow accounts to be split over different years of occurrence.
   * @return occurrenceYear
  */
  

  @JsonProperty("occurrenceYear")
  public Integer getOccurrenceYear() {
    return occurrenceYear;
  }

  public void setOccurrenceYear(Integer occurrenceYear) {
    this.occurrenceYear = occurrenceYear;
  }

  public AmountItem occurrenceStartDate(LocalDate occurrenceStartDate) {
    this.occurrenceStartDate = occurrenceStartDate;
    return this;
  }

  /**
   * Start date of period in which a specific event (e.g. a loss) took place.
   * @return occurrenceStartDate
  */
  @Valid 

  @JsonProperty("occurrenceStartDate")
  public LocalDate getOccurrenceStartDate() {
    return occurrenceStartDate;
  }

  public void setOccurrenceStartDate(LocalDate occurrenceStartDate) {
    this.occurrenceStartDate = occurrenceStartDate;
  }

  public AmountItem occurrenceEndDate(LocalDate occurrenceEndDate) {
    this.occurrenceEndDate = occurrenceEndDate;
    return this;
  }

  /**
   * End date of period in which a specific event (e.g. a loss) took place.
   * @return occurrenceEndDate
  */
  @Valid 

  @JsonProperty("occurrenceEndDate")
  public LocalDate getOccurrenceEndDate() {
    return occurrenceEndDate;
  }

  public void setOccurrenceEndDate(LocalDate occurrenceEndDate) {
    this.occurrenceEndDate = occurrenceEndDate;
  }

  public AmountItem lossOrEventName(String lossOrEventName) {
    this.lossOrEventName = lossOrEventName;
    return this;
  }

  /**
   * Textual details on the loss or event which is the subject of the original insurance of the individual loss included in the transaction.
   * @return lossOrEventName
  */
  

  @JsonProperty("lossOrEventName")
  public String getLossOrEventName() {
    return lossOrEventName;
  }

  public void setLossOrEventName(String lossOrEventName) {
    this.lossOrEventName = lossOrEventName;
  }

  public AmountItem referredClaimUUId(String referredClaimUUId) {
    this.referredClaimUUId = referredClaimUUId;
    return this;
  }

  /**
   * Reference of the Claim referred to (used to provide a cross-reference to the Claim linked to this TechAccount)
   * @return referredClaimUUId
  */
  

  @JsonProperty("referredClaimUUId")
  public String getReferredClaimUUId() {
    return referredClaimUUId;
  }

  public void setReferredClaimUUId(String referredClaimUUId) {
    this.referredClaimUUId = referredClaimUUId;
  }

  public AmountItem references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public AmountItem addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * Get references
   * @return references
  */
  @Valid 

  @JsonProperty("references")
  public List<@Valid Reference> getReferences() {
    return references;
  }

  public void setReferences(List<@Valid Reference> references) {
    this.references = references;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountItem amountItem = (AmountItem) o;
    return Objects.equals(this.typeName, amountItem.typeName) &&
        Objects.equals(this.value, amountItem.value) &&
        Objects.equals(this.appliesToCode, amountItem.appliesToCode) &&
        Objects.equals(this.statusCode, amountItem.statusCode) &&
        Objects.equals(this.dueDate, amountItem.dueDate) &&
        Objects.equals(this.occurrenceYear, amountItem.occurrenceYear) &&
        Objects.equals(this.occurrenceStartDate, amountItem.occurrenceStartDate) &&
        Objects.equals(this.occurrenceEndDate, amountItem.occurrenceEndDate) &&
        Objects.equals(this.lossOrEventName, amountItem.lossOrEventName) &&
        Objects.equals(this.referredClaimUUId, amountItem.referredClaimUUId) &&
        Objects.equals(this.references, amountItem.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, value, appliesToCode, statusCode, dueDate, occurrenceYear, occurrenceStartDate, occurrenceEndDate, lossOrEventName, referredClaimUUId, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountItem {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    appliesToCode: ").append(toIndentedString(appliesToCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    occurrenceYear: ").append(toIndentedString(occurrenceYear)).append("\n");
    sb.append("    occurrenceStartDate: ").append(toIndentedString(occurrenceStartDate)).append("\n");
    sb.append("    occurrenceEndDate: ").append(toIndentedString(occurrenceEndDate)).append("\n");
    sb.append("    lossOrEventName: ").append(toIndentedString(lossOrEventName)).append("\n");
    sb.append("    referredClaimUUId: ").append(toIndentedString(referredClaimUUId)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

