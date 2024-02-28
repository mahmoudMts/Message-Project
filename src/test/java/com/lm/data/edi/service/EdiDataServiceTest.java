package com.lm.data.edi.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.constants.EdiSql;
import com.lm.data.edi.model.ilucsb.SettlementPaymentRow;
import com.lm.data.edi.repository.RedshiftConnectionUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class EdiDataServiceTest {


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
    private EdiDataService ediDataService;


    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException, IllegalAccessException {
        MockitoAnnotations.openMocks(this);
        ediDataService = new EdiDataService();

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
        String partyId = "535c24b7-ab81-4e4b-8671-fb5ffe0d1876";
        String settlementDate = "2022-01-01";
        String fromDate = "2023-08-01";
        String toDate = "2023-08-31";
        //List<String> paramList = List.of(marketID, settlementDate);
        List<String> paramList = new ArrayList<>();
        paramList.add(partyId);
        paramList.add(settlementDate);
        paramList.add(fromDate);
        paramList.add(toDate);
        String sqlQuery = EdiSql.ILUCSB_SQL_QUERY_1 + EdiSql.ILUCSB_SQL_QUERY_2 + EdiSql.ILUCSB_SQL_QUERY_3;
        LambdaLogger logger = mockContext.getLogger();
        List<SettlementPaymentRow> result = ediDataService.getIlucsbDataFromDb(partyId, settlementDate, fromDate, toDate, logger);


        // Assert
        //assertEquals(1, result.size());
        //SettlementPaymentRow settlementPaymentRow = result.get(0);
        //assertEquals("ABC123", settlementPaymentRow.getMarketId());
        //assertEquals(Date.valueOf("2022-01-01"), settlementPaymentRow.getSettlementDate());

    }
}
