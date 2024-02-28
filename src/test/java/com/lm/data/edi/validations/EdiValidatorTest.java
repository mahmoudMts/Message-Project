package com.lm.data.edi.validations;

import static org.junit.jupiter.api.Assertions.*;

import com.lm.data.edi.repository.RedshiftConnectionUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.sql.SQLException;

public class EdiValidatorTest {

    private  static  EdiValidator ediValidator;
    @BeforeAll
    static void setUp() throws SQLException, ClassNotFoundException {
       ediValidator = new EdiValidator();
    }

    //@Test
    @Disabled
    public void testValidateIlucsbInputParameter_ValidParameters_ReturnsTrue() {
        //assertTrue(ediValidator.validateIlucsbInputParameter("MKT123", "2024-01-16"));
    }

    ////@Test
    @Disabled
    public void testValidateIlucsbInputParameter_NullMarketID_ReturnsFalse() {
        //assertFalse(ediValidator.validateIlucsbInputParameter(null, "2024-01-16"));
    }

    //@Test
    @Disabled
    public void testValidateIlucsbInputParameter_NullSettlementDate_ReturnsFalse() {
        //assertFalse(ediValidator.validateIlucsbInputParameter("MKT123", null));
    }

    //@Test
    @Disabled
    public void testValidateDateParameter_ValidDate_ReturnsTrue() {
        //assertTrue( ediValidator.validateDateParameter("2024-01-16"));
    }

    //@Test
    @Disabled
    public void testValidateDateParameter_NullDate_ReturnsFalse() {
        //assertFalse( ediValidator.validateDateParameter(null));
    }

    //@Test
    @Disabled
    public void testValidateIlucsbParameters_ValidParameters_ReturnsTrue() {
        //assertTrue( ediValidator.validateIlucsbParameters("Group123", "Party456",
                //"2024-01-16", "2024-01-15", "2024-01-17"));
    }

   // @Test
    @Disabled
    public void testValidateIlucsbParameters_NullSettlementDate_ReturnsFalse() {
        //assertFalse( ediValidator.validateIlucsbParameters("Group123", "Party456",
                //null, "2024-01-15", "2024-01-17"));
    }


}
