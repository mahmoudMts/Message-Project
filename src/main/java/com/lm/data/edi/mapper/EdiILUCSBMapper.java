package com.lm.data.edi.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lm.data.edi.model.header.InterchangeHeaderUNB;
import com.lm.data.edi.model.ilucsb.ILUCSBBrokerBusinessBalanceArray;
import com.lm.data.edi.model.ilucsb.ILUCSBContainerArray;
import com.lm.data.edi.model.ilucsb.ILUCSBCurrencySettlementTotalArray;
import com.lm.data.edi.model.ilucsb.ILUCSBInstalmentDetailsArray;
import com.lm.data.edi.model.ilucsb.ILUCSBNotificationPayload;
import com.lm.data.edi.model.ilucsb.Settlement;
import com.lm.data.edi.model.ilucsb.SettlementPaymentRow;

public class EdiILUCSBMapper {

	public ILUCSBNotificationPayload mapIlucsbData(List<SettlementPaymentRow> listSettlementPaymentRow) {

		/*
		 * Sorting the list SettlementPaymentRow by CompanyAccountingCode,
		 * SettlementCurrencyCode, BrokerCode, BusinessCategory in ascending order and
		 * NetPremiumClaim in descending order
		 */
		List<SettlementPaymentRow> sortedList = listSettlementPaymentRow.stream()
				.sorted(Comparator.comparing(SettlementPaymentRow::getCompanyAccountingCode)
						.thenComparing(SettlementPaymentRow::getSettlementCurrencyCode)
						.thenComparing(SettlementPaymentRow::getBrokerCode)
						.thenComparing(SettlementPaymentRow::getBusinessCategory)
						.thenComparing(SettlementPaymentRow::getNetPremiumClaim).reversed())
				.collect(Collectors.toList());

		// Step 2: Group by CompanyAccountingCode
		Map<String, List<SettlementPaymentRow>> byCompanyAccountingCode = sortedList.stream()
				.collect(Collectors.groupingBy(SettlementPaymentRow::getCompanyAccountingCode));

		List<Settlement> settlement = new ArrayList<>();

		// Step 3: Group by SettlementCurrencyCode
		for (Map.Entry<String, List<SettlementPaymentRow>> entry : byCompanyAccountingCode.entrySet()) {
			String companyAccountingCode = entry.getKey();

			Map<String, List<SettlementPaymentRow>> bySettlementCurrencyCode = entry.getValue().stream()
					.collect(Collectors.groupingBy(SettlementPaymentRow::getSettlementCurrencyCode));

			// Step 4: Group by BrokerCode and BusinessCategory
			List<ILUCSBCurrencySettlementTotalArray> currencySettlementTotalArrays = new ArrayList<>();
			for (Map.Entry<String, List<SettlementPaymentRow>> entryCurrency : bySettlementCurrencyCode.entrySet()) {
				String settlementCurrencyCode = entryCurrency.getKey();
				Map<String, Map<String, List<SettlementPaymentRow>>> byBrokerAndCategory = entryCurrency.getValue()
						.stream().collect(Collectors.groupingBy(SettlementPaymentRow::getBrokerCode,
								Collectors.groupingBy(SettlementPaymentRow::getBusinessCategory)));

				/*
				 * Step 5 & 6: Calculate brokerBusinessBalanceAmount(Sum of NetPremiumClaim) and
				 * currencyTotalForSettlement(Sum of brokerBusinessBalanceAmount)
				 */
				BigDecimal currencyTotalForSettlement = BigDecimal.ZERO;
				List<ILUCSBBrokerBusinessBalanceArray> brokerBusinessBalanceArrays = new ArrayList<>();
				for (Map.Entry<String, Map<String, List<SettlementPaymentRow>>> entryBroker : byBrokerAndCategory
						.entrySet()) {
					String brokerCode = entryBroker.getKey();
					Map<String, List<SettlementPaymentRow>> byBusinessCategory = entryBroker.getValue();
					for (Map.Entry<String, List<SettlementPaymentRow>> entryCategory : byBusinessCategory.entrySet()) {
						String businessCategory = entryCategory.getKey();
						List<SettlementPaymentRow> settlementPaymentRows = entryCategory.getValue();
						BigDecimal brokerBusinessBalanceAmount = settlementPaymentRows.stream()
								.map(SettlementPaymentRow::getNetPremiumClaim).reduce(BigDecimal.ZERO, BigDecimal::add);
						currencyTotalForSettlement = currencyTotalForSettlement.add(brokerBusinessBalanceAmount);

						ILUCSBBrokerBusinessBalanceArray brokerBusinessBalanceArray = new ILUCSBBrokerBusinessBalanceArray(
								brokerCode, businessCategory.toString(), brokerBusinessBalanceAmount.toString(), null);

						// Step 7: Create ILUCSBInstalmentDetailsArray
						List<ILUCSBInstalmentDetailsArray> instalmentDetailsArrays = settlementPaymentRows.stream()
								.map(row -> new ILUCSBInstalmentDetailsArray(row.getIluReference(),
										row.getCompanyCode(), "AAA", ILUCSBInstalmentDetailsArray.InstalmentCode.C, "1",
										row.getNetPremiumClaim().toString(), "2022-04-05"))
								.collect(Collectors.toList());

						brokerBusinessBalanceArray.setILUCSBInstalmentDetailsArray(instalmentDetailsArrays);
						brokerBusinessBalanceArrays.add(brokerBusinessBalanceArray);
					}
				}

				// Create ILUCSBCurrencySettlementTotalArray
				ILUCSBCurrencySettlementTotalArray currencySettlementTotalArray = new ILUCSBCurrencySettlementTotalArray(
						ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode.fromValue(settlementCurrencyCode),
						currencyTotalForSettlement.toString(), brokerBusinessBalanceArrays);
				currencySettlementTotalArrays.add(currencySettlementTotalArray);

			}
			/*
			 * Retrieve settlementRunNumber and actualPaymentDate from the first
			 * SettlementPaymentRow in the list
			 */
			String settlementRunNumber = entry.getValue().get(0).getSettlementRunNumber();
			String actualPaymentDate = entry.getValue().get(0).getActualPaymentDate();

			// Create ILUCSBContainerArray
			List<ILUCSBContainerArray> iLUCSBContainerArray = new ArrayList<>();
			iLUCSBContainerArray.add(new ILUCSBContainerArray(companyAccountingCode, settlementRunNumber,
					actualPaymentDate, currencySettlementTotalArrays));
			settlement.add(new Settlement("IAJ Container Array", iLUCSBContainerArray));

		}
		return new ILUCSBNotificationPayload(new InterchangeHeaderUNB(), settlement);
	}
}
