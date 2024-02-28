package com.lm.data.edi.mapper;

import com.lm.data.edi.model.header.InterchangeHeaderUNB;
import com.lm.data.edi.model.mcm.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EdiMCMMapper {
    public MCMNotificationsMessage mapMcmData(List<MCMSettlementRow> listMCMSettlementRow) {

        //payload
        List<Payload> payloads = new ArrayList<>();
        for (MCMSettlementRow mCMSettlementRow : listMCMSettlementRow) {
            String segmentTag = mCMSettlementRow.getSegmentTag();
            BgmDetails bgmDetails = getBgmDetails(segmentTag,mCMSettlementRow.getMessageName(), mCMSettlementRow.getUserNumber());
            DateTimeDetails dateTimeDetails = getDateTimeDetails(segmentTag, mCMSettlementRow.getDateTimeQualifier(), mCMSettlementRow.getControlMessagePeriod(), mCMSettlementRow.getYearOfAccount());
            NameandAddressDetails nameandAddressDetails = getNameandAddressDetails(segmentTag, mCMSettlementRow.getNameAndAddressQualifier(), mCMSettlementRow.getPartyIdentificationCoded());
            CntDetails cntDetail = getCntDetails(segmentTag, mCMSettlementRow.getControlQualifier(), mCMSettlementRow.getTransactionCount());
            GisDetails gisDetails = getGisDetails(segmentTag, mCMSettlementRow.getProcessingIndicatorAuditOrRiskCode(), mCMSettlementRow.getProcessingIndicatorBusinessCategoryCode(), mCMSettlementRow.getGisQualifier());
            ArrayList<MoaDetails> moaDetails = getMoaDetails(segmentTag, mCMSettlementRow.getMonetoryAmountQualifier(),mCMSettlementRow.getAmount(),mCMSettlementRow.getCurrency());

            List<Group4Container> group4Containers = new ArrayList<>();
            Group4Container group4Container = new Group4Container();
            group4Container.setGisDetails(gisDetails);
            group4Container.setMoaDetailsArray(moaDetails);
            group4Container.setCntDetails(cntDetail);
            group4Containers.add(group4Container);

            ArrayList<Group3Container> group3Containers = new ArrayList<>();
            Group3Container group3Container =new Group3Container();
            group3Container.setGisDetails(gisDetails);
            group3Container.setSeparatorDetails(getSeparatorDetails(segmentTag, mCMSettlementRow.getSeparatorId()));
            group3Container.setGroup4Containers(group4Containers);
            group3Container.setMoaDetails(moaDetails);
            group3Container.setCntDetails(cntDetail);
            group3Containers.add(group3Container);

            List<Group2Container> group2Containers = new ArrayList<>();
            Group2Container group2Container = new Group2Container();
            group2Container.setDateTimeDetail(dateTimeDetails);
            group2Container.setGroup3Container(group3Containers);
            group2Container.setMoaDetails(moaDetails);
            group2Container.setCntDetails(cntDetail);
            group2Containers.add(group2Container);

            List<Group1Container> group1Containers = new ArrayList<>();
            Group1Container group1Container = new Group1Container();
            group1Container.setNameandAddressDetails(nameandAddressDetails);
            group1Container.setGroup2Container(group2Containers);
            group1Container.setMoaDetails(moaDetails);
            group1Container.setCntDetails(cntDetail);
            group1Containers.add(group1Container);

            Payload payload = new Payload();
            payload.setId(UUID.randomUUID());
            payload.setBgmDetails(bgmDetails);
            payload.setDateTimeDetails(dateTimeDetails);
            payload.setGroup1Containers(group1Containers);
            payload.setAudit(new AuditBlock());
            payloads.add(payload);
        }
        return new MCMNotificationsMessage(new InterchangeHeaderUNB(),payloads);
    }

    private static ArrayList<MoaDetails> getMoaDetails(String segmentTag, String monetoryAmountQualifier, String amount, String currency) {
        ArrayList<MoaDetails> moaDetails = new ArrayList<>();
        MoaDetails moaDetail = new MoaDetails();
        moaDetail.setSegmentTag(segmentTag);
        moaDetail.setMonetoryAmountQualifier(MoaDetails.MonetoryAmountQualifier.fromValue(monetoryAmountQualifier));
        moaDetail.setAmount(amount);
        moaDetail.setCurrency(currency);
        moaDetails.add(moaDetail);
        return moaDetails;
    }

    private static SeparatorDetails getSeparatorDetails(String segmentTag, String separatorId) {
        SeparatorDetails separatorDetails = new SeparatorDetails();
        separatorDetails.setSegmentTag(segmentTag);
        separatorDetails.setSeparatorId(separatorId);
        return separatorDetails;
    }

    private static GisDetails getGisDetails(String segmentTag,String processingIndicatorAuditOrRiskCode, String processingIndicatorBusinessCategoryCode, String gisQualifier) {
        GisDetails gisDetails = new GisDetails();
        gisDetails.setSegmentTag(segmentTag);
        gisDetails.setProcessingIndicatorAuditOrRiskCode(processingIndicatorAuditOrRiskCode);
        gisDetails.setProcessingIndicatorBusinessCategoryCode(GisDetails.ProcessingIndicatorBusinessCategoryCode.fromValue(processingIndicatorBusinessCategoryCode));
        gisDetails.setGisQualifier(GisDetails.GisQualifier.fromValue(gisQualifier));
        return gisDetails;
    }

    private static CntDetails getCntDetails(String segmentTag, String controlQualifier, String transactionCount) {
        CntDetails cntDetail = new CntDetails();
        cntDetail.setSegmentTag(segmentTag);
        cntDetail.setControlQualifier(controlQualifier);
        cntDetail.setTransactionCount(transactionCount);
        return cntDetail;
    }

    private static BgmDetails getBgmDetails(String segmentTag, String messageName, String userNumber) {
        BgmDetails bgmDetails = new BgmDetails();
        bgmDetails.setSegmentTag(segmentTag);
        bgmDetails.setMessageName(messageName);
        bgmDetails.setUserNumber(userNumber);
        return bgmDetails;
    }

    private static DateTimeDetails getDateTimeDetails(String segmentTag, String dateTimeQualifier, String controlMessagePeriod, String yearOfAccount) {
        DateTimeDetails dateTimeDetails = new DateTimeDetails();
        dateTimeDetails.setSegmentTag(segmentTag);
        dateTimeDetails.setDateTimeQualifier(DateTimeDetails.DateTimeQualifier.fromValue(dateTimeQualifier));
        dateTimeDetails.setControlMessagePeriod(controlMessagePeriod);
        dateTimeDetails.setYearOfAccount(yearOfAccount);
        return dateTimeDetails;
    }

    private static NameandAddressDetails getNameandAddressDetails(String segmentTag, String nameAndAddressQualifier, String partyIdentificationCoded) {
        NameandAddressDetails nameandAddressDetails = new NameandAddressDetails();
        nameandAddressDetails.setSegmentTag(segmentTag);
        nameandAddressDetails.setNameAndAddressQualifier(nameAndAddressQualifier);
        nameandAddressDetails.setPartyIdentificationCoded(partyIdentificationCoded);
        return nameandAddressDetails;
    }
}
