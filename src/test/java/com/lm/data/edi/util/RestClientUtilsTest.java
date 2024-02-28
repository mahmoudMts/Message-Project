package com.lm.data.edi.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.HashMap;
import java.util.Map;

import org.apache.hc.core5.http.ClassicHttpRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.PremiumSubmission;
import com.lm.data.edi.model.ipos.SubmissionRecord;

@ExtendWith(MockitoExtension.class)
public class RestClientUtilsTest {

	private static final String URI_CONTEXT_PATH = "http://www.lm-dev101.com/premiums/prtspo/api/v1";
	
	@Test
	public void testExecuteGetWithoutQueryParams() {
		RestClientUtils<PremiumSubmission> mocked = setupMockResponse(PremiumSubmission.class, "/premiumSubmission.json");
		mocked.executeGet(URI_CONTEXT_PATH);
	}
	
	@Test
	public void testExecuteGetWithoutQueryParamsAndFetchSelectedFields() {
		SubmissionRecord submissionRecord = RestClientUtils.getInstance(SubmissionRecord.class, "submission")
			.transform(TestDataUtils.readString("/premiumSubmission.json"));
		
		assertThat(submissionRecord, is(notNullValue()));
		
		String sectionId = RestClientUtils.getInstance(String.class, "sectionId")
				.transform(TestDataUtils.readString("/premiumDetails.json"));
			
		assertThat(sectionId, is(notNullValue()));
	}

	@Test
	public void testExecuteGetWithQueryParams() {
		RestClientUtils<PremiumSubmission> mocked = setupMockResponse(PremiumSubmission.class, "/premiumSubmission.json");
		mocked.executeGet(URI_CONTEXT_PATH, getQueryParams());
	}

	private Map<String, String> getQueryParams() {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("test", "test");
		return queryParams;
	}

	@Test
	public void testExecutePostWithoutQueryParams() {
		RestClientUtils<PremiumGetRec> mocked = setupMockResponse(PremiumGetRec.class, "/premiumDetails.json");
		mocked.executePost(URI_CONTEXT_PATH);
	}

	@Test
	public void testExecutePostWithQueryParams() {
		RestClientUtils<PremiumGetRec> mocked = setupMockResponse(PremiumGetRec.class, "/premiumDetails.json");
		mocked.executePost(URI_CONTEXT_PATH, getQueryParams());
	}
	
	private <T> RestClientUtils<T> setupMockResponse(Class<T> targetClass, String jsonFilePath) {
		RestClientUtils<T> restClientUtils = RestClientUtils.getInstance(targetClass);
		RestClientUtils<T> mocked = spy(restClientUtils);
		doReturn(TestDataUtils.readString(jsonFilePath)).when(mocked).executeRequest(any(ClassicHttpRequest.class));
		
		return mocked;
	}
}
