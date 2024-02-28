
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment NAD-A
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lloydsLeaderIdentification",
    "brokerNumber",
    "brokerPseudonym",
    "brokerTelephoneNumber",
    "brokerContactName",
    "externalAdjuster",
    "lawyer"
})
public class NADDetail {

    /**
     * The syndicate number of the leading Lloyd's underwriter as defined by Lloyd's Claims Schemes BLL
     * 
     */
    @JsonProperty("lloydsLeaderIdentification")
    @JsonPropertyDescription("The syndicate number of the leading Lloyd's underwriter as defined by Lloyd's Claims Schemes BLL")
    @Size(max = 9)
    private String lloydsLeaderIdentification;
    /**
     * The numeric code allocated to a broker for  BKR
     * 
     */
    @JsonProperty("brokerNumber")
    @JsonPropertyDescription("The numeric code allocated to a broker for  BKR")
    @Size(max = 4)
    private String brokerNumber;
    /**
     * Pseudonym for Broker.  Present when entered BKR
     * 
     */
    @JsonProperty("brokerPseudonym")
    @JsonPropertyDescription("Pseudonym for Broker.  Present when entered BKR")
    @Size(max = 3)
    private String brokerPseudonym;
    /**
     * Telephone Number for Broker BKR
     * 
     */
    @JsonProperty("brokerTelephoneNumber")
    @JsonPropertyDescription("Telephone Number for Broker BKR")
    @Size(max = 35)
    private String brokerTelephoneNumber;
    /**
     * Contact Name for Broker. Present when entere BKR.
     * 
     */
    @JsonProperty("brokerContactName")
    @JsonPropertyDescription("Contact Name for Broker. Present when entere BKR.")
    @Size(max = 35)
    private String brokerContactName;
    /**
     * The name of the external claims adjuster appointed by the insurers to report upon the claim EAD
     * 
     */
    @JsonProperty("externalAdjuster")
    @JsonPropertyDescription("The name of the external claims adjuster appointed by the insurers to report upon the claim EAD")
    @Size(max = 20)
    private String externalAdjuster;
    /**
     * The name of the lawyer appointed to advise insurers on a claim LAW
     * 
     */
    @JsonProperty("lawyer")
    @JsonPropertyDescription("The name of the lawyer appointed to advise insurers on a claim LAW")
    @Size(max = 20)
    private String lawyer;

    /**
     * The syndicate number of the leading Lloyd's underwriter as defined by Lloyd's Claims Schemes BLL
     * 
     */
    @JsonProperty("lloydsLeaderIdentification")
    public String getLloydsLeaderIdentification() {
        return lloydsLeaderIdentification;
    }

    /**
     * The syndicate number of the leading Lloyd's underwriter as defined by Lloyd's Claims Schemes BLL
     * 
     */
    @JsonProperty("lloydsLeaderIdentification")
    public void setLloydsLeaderIdentification(String lloydsLeaderIdentification) {
        this.lloydsLeaderIdentification = lloydsLeaderIdentification;
    }

    /**
     * The numeric code allocated to a broker for  BKR
     * 
     */
    @JsonProperty("brokerNumber")
    public String getBrokerNumber() {
        return brokerNumber;
    }

    /**
     * The numeric code allocated to a broker for  BKR
     * 
     */
    @JsonProperty("brokerNumber")
    public void setBrokerNumber(String brokerNumber) {
        this.brokerNumber = brokerNumber;
    }

    /**
     * Pseudonym for Broker.  Present when entered BKR
     * 
     */
    @JsonProperty("brokerPseudonym")
    public String getBrokerPseudonym() {
        return brokerPseudonym;
    }

    /**
     * Pseudonym for Broker.  Present when entered BKR
     * 
     */
    @JsonProperty("brokerPseudonym")
    public void setBrokerPseudonym(String brokerPseudonym) {
        this.brokerPseudonym = brokerPseudonym;
    }

    /**
     * Telephone Number for Broker BKR
     * 
     */
    @JsonProperty("brokerTelephoneNumber")
    public String getBrokerTelephoneNumber() {
        return brokerTelephoneNumber;
    }

    /**
     * Telephone Number for Broker BKR
     * 
     */
    @JsonProperty("brokerTelephoneNumber")
    public void setBrokerTelephoneNumber(String brokerTelephoneNumber) {
        this.brokerTelephoneNumber = brokerTelephoneNumber;
    }

    /**
     * Contact Name for Broker. Present when entere BKR.
     * 
     */
    @JsonProperty("brokerContactName")
    public String getBrokerContactName() {
        return brokerContactName;
    }

    /**
     * Contact Name for Broker. Present when entere BKR.
     * 
     */
    @JsonProperty("brokerContactName")
    public void setBrokerContactName(String brokerContactName) {
        this.brokerContactName = brokerContactName;
    }

    /**
     * The name of the external claims adjuster appointed by the insurers to report upon the claim EAD
     * 
     */
    @JsonProperty("externalAdjuster")
    public String getExternalAdjuster() {
        return externalAdjuster;
    }

    /**
     * The name of the external claims adjuster appointed by the insurers to report upon the claim EAD
     * 
     */
    @JsonProperty("externalAdjuster")
    public void setExternalAdjuster(String externalAdjuster) {
        this.externalAdjuster = externalAdjuster;
    }

    /**
     * The name of the lawyer appointed to advise insurers on a claim LAW
     * 
     */
    @JsonProperty("lawyer")
    public String getLawyer() {
        return lawyer;
    }

    /**
     * The name of the lawyer appointed to advise insurers on a claim LAW
     * 
     */
    @JsonProperty("lawyer")
    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NADDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lloydsLeaderIdentification");
        sb.append('=');
        sb.append(((this.lloydsLeaderIdentification == null)?"<null>":this.lloydsLeaderIdentification));
        sb.append(',');
        sb.append("brokerNumber");
        sb.append('=');
        sb.append(((this.brokerNumber == null)?"<null>":this.brokerNumber));
        sb.append(',');
        sb.append("brokerPseudonym");
        sb.append('=');
        sb.append(((this.brokerPseudonym == null)?"<null>":this.brokerPseudonym));
        sb.append(',');
        sb.append("brokerTelephoneNumber");
        sb.append('=');
        sb.append(((this.brokerTelephoneNumber == null)?"<null>":this.brokerTelephoneNumber));
        sb.append(',');
        sb.append("brokerContactName");
        sb.append('=');
        sb.append(((this.brokerContactName == null)?"<null>":this.brokerContactName));
        sb.append(',');
        sb.append("externalAdjuster");
        sb.append('=');
        sb.append(((this.externalAdjuster == null)?"<null>":this.externalAdjuster));
        sb.append(',');
        sb.append("lawyer");
        sb.append('=');
        sb.append(((this.lawyer == null)?"<null>":this.lawyer));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.brokerNumber == null)? 0 :this.brokerNumber.hashCode()));
        result = ((result* 31)+((this.brokerContactName == null)? 0 :this.brokerContactName.hashCode()));
        result = ((result* 31)+((this.brokerPseudonym == null)? 0 :this.brokerPseudonym.hashCode()));
        result = ((result* 31)+((this.brokerTelephoneNumber == null)? 0 :this.brokerTelephoneNumber.hashCode()));
        result = ((result* 31)+((this.externalAdjuster == null)? 0 :this.externalAdjuster.hashCode()));
        result = ((result* 31)+((this.lloydsLeaderIdentification == null)? 0 :this.lloydsLeaderIdentification.hashCode()));
        result = ((result* 31)+((this.lawyer == null)? 0 :this.lawyer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NADDetail) == false) {
            return false;
        }
        NADDetail rhs = ((NADDetail) other);
        return ((((((((this.brokerNumber == rhs.brokerNumber)||((this.brokerNumber!= null)&&this.brokerNumber.equals(rhs.brokerNumber)))&&((this.brokerContactName == rhs.brokerContactName)||((this.brokerContactName!= null)&&this.brokerContactName.equals(rhs.brokerContactName))))&&((this.brokerPseudonym == rhs.brokerPseudonym)||((this.brokerPseudonym!= null)&&this.brokerPseudonym.equals(rhs.brokerPseudonym))))&&((this.brokerTelephoneNumber == rhs.brokerTelephoneNumber)||((this.brokerTelephoneNumber!= null)&&this.brokerTelephoneNumber.equals(rhs.brokerTelephoneNumber))))&&((this.externalAdjuster == rhs.externalAdjuster)||((this.externalAdjuster!= null)&&this.externalAdjuster.equals(rhs.externalAdjuster))))&&((this.lloydsLeaderIdentification == rhs.lloydsLeaderIdentification)||((this.lloydsLeaderIdentification!= null)&&this.lloydsLeaderIdentification.equals(rhs.lloydsLeaderIdentification))))&&((this.lawyer == rhs.lawyer)||((this.lawyer!= null)&&this.lawyer.equals(rhs.lawyer))));
    }

}
