package com.lm.data.edi.validations;


public class EdiValidator {

    public static boolean validateIlucsbInputParameter(String marketID, String settlementDate) {
        return marketID != null && validateDateParameter(settlementDate);
    }

    public static boolean validateDateParameter(Object inputDate) {
        return inputDate != null;
    }

    public static boolean validateIlucsbParameters(String marketGroupReference, String partyId,
                                            String settlementDate, String fromDate, String toDate) {
                                         
        return marketGroupReference != null && partyId != null
        && ( validateDateParameter(settlementDate) || (validateDateParameter(fromDate) || validateDateParameter(toDate)));
    }

    public static boolean validateWSETTInputParameter(String marketID, String settlementDate, String fromDate, String toDate) {
        return marketID != null || settlementDate != null || fromDate != null || toDate != null;
    }

    public static boolean validateMCMInputParameter(String marketGroupReference,String partyId, String signingDate, String fromDate, String toDate) {
        return marketGroupReference != null || partyId != null || signingDate != null || fromDate != null || toDate != null;
    }

}
