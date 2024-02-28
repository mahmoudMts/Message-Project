package com.lm.data.edi.constants;

import java.util.HashMap;
import java.util.Map;

public class EdiUNBSenderMap {

    public static String getSenderIdentification(String key)   {
        return unbSenderIdentificationMap.get(key);
    }

    public static String getReverseRoutingAddress(String key)   {
        return unbReverseRoutingAddressMap.get(key);
    }

    private static final Map<String, String> unbSenderIdentificationMap = new HashMap<>();
    private static final Map<String, String> unbReverseRoutingAddressMap = new HashMap<>();
    static {
        unbSenderIdentificationMap.put("ILUCSB","GBLUW.LPC001");
        unbSenderIdentificationMap.put("ILUCSM","GBLUW.LPC001");
        unbSenderIdentificationMap.put("CLMILC","GBLUW.LPC001");
        unbSenderIdentificationMap.put("CLMLRC","GBPAC.PAC012");
        unbSenderIdentificationMap.put("CLMILB","GBLUW.LUW001");
        unbSenderIdentificationMap.put("CLMLRB","GBPAC.PAC011");
        unbSenderIdentificationMap.put("CLMLLB","GBLPC.LPC026");
        unbSenderIdentificationMap.put("IPCCSM","GBLUW.LPC001");
        unbSenderIdentificationMap.put("SCM","LLOYD?'S OF LONDON");
        unbSenderIdentificationMap.put("USM","GBLLD.LLD010");
        unbSenderIdentificationMap.put("MCM","GBLLD.LLD010");

        unbReverseRoutingAddressMap.put("ILUCSB","LPC004");
        unbReverseRoutingAddressMap.put("ILUCSM","LPC001");
        unbReverseRoutingAddressMap.put("CLMILC","LPC001");
        unbReverseRoutingAddressMap.put("CLMLRC","PAC012");
        unbReverseRoutingAddressMap.put("CLMILB","LUW001");
        unbReverseRoutingAddressMap.put("CLMLRB","PAC011");
        unbReverseRoutingAddressMap.put("CLMLLB","LPC025");
        unbReverseRoutingAddressMap.put("IPCCSM","LPC001");
            //SIGNIN (CompanyBSM)	GBLUW.LPC003
            //IPCBSM(CompanyIPCBSM)	GBLUW.LPC003
            //SIGNIN (Llyods BSM)	LLOYDS OF LONDON
            //SIGNIN (Llyods IPCBSM)	LLOYDS OF LONDON
    }
}
