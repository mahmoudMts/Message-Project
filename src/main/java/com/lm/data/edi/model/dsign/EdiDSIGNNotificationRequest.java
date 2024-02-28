package com.lm.data.edi.model.dsign;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EdiDSIGNNotificationRequest {

    private String marketID;
    private String settlementDate;
}
