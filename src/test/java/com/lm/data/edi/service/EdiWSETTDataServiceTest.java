package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.constants.EdiSql;
import com.lm.data.edi.model.wsett.WSETTSettlementRow;
import com.lm.data.edi.repository.RedshiftConnectionUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class EdiWSETTDataServiceTest {

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    @Mock
    private Context mockContext;

    @Mock
    private LambdaLogger mockLogger;

    @Mock
    private RedshiftConnectionUtil redshiftConnectionUtil;
    @InjectMocks
    private EdiWSETTDataService ediWSETTDataService;


    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException, IllegalAccessException {
        MockitoAnnotations.openMocks(this);
        ediWSETTDataService = new EdiWSETTDataService();

        //when(redshiftConnectionUtil.getDBconnection()).thenReturn((Connection) mockConnection);
        //when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockPreparedStatement);
        //when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockContext.getLogger()).thenReturn(mockLogger);

        // Assuming you have some data to be returned
        //when(mockResultSet.next()).thenReturn(true);
        //when(mockResultSet.getString("marketId")).thenReturn("ABC123");
        //when(mockResultSet.getDate("settlementDate")).thenReturn(Date.valueOf("2022-01-01"));

    }

    @Test
    void testGetIlucsbDataFromDb() {
        // Act
        String marketID = "ABC123";
        String settlementDate = "2022-01-01";
        //List<String> paramList = List.of(marketID, settlementDate);
        List<String> paramList = new ArrayList<>();
        paramList.add(marketID);
        paramList.add(settlementDate);
        LambdaLogger logger = mockContext.getLogger();
        List<WSETTSettlementRow> result = ediWSETTDataService.getWSETTDataFromDb(EdiSql.WSETT_SQL_QUERY, paramList, logger);


        // Assert
        //assertEquals(1, result.size());
        //SettlementPaymentRow settlementPaymentRow = result.get(0);
        //assertEquals("ABC123", settlementPaymentRow.getMarketId());
        //assertEquals(Date.valueOf("2022-01-01"), settlementPaymentRow.getSettlementDate());

    }

}