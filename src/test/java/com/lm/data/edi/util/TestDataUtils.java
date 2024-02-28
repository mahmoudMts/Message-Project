package com.lm.data.edi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecords;
import com.lm.data.edi.model.ipos.PremiumSubmission;

public class TestDataUtils {

	public static String readString(String jsonFileName) {
		try {
			try (InputStream is = TestDataUtils.class.getResourceAsStream(jsonFileName)) {
				if (is == null)
					return null;
				try (InputStreamReader isr = new InputStreamReader(is);
						BufferedReader reader = new BufferedReader(isr)) {
					return reader.lines().collect(Collectors.joining(System.lineSeparator()));
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static PremiumEnquiryRecords getPremiumEnquiryRecords() {
		return getData("premiumEnquiryRecords.json", PremiumEnquiryRecords.class);
	}
	
	public static PremiumSubmission getPremiumSubmission() {
		return getData("premiumSubmission.json", PremiumSubmission.class);
	}

	private static <T> T getData(String jsonFile, Class<T> targetClass) {
		try {
			return new ObjectMapper().readValue(TestDataUtils.class.getResourceAsStream(jsonFile), targetClass);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
