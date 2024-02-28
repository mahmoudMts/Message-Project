package com.lm.data.edi.util;

import static org.apache.hc.core5.http.ContentType.APPLICATION_FORM_URLENCODED;
import static org.apache.hc.core5.http.ContentType.APPLICATION_JSON;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.lm.data.edi.rest.AccessTokenRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestClientUtils<T> {
	
	private Class<T> targetClass;
	
	private ObjectMapper mapper;
	
	private String accessToken;
	
	private String fieldToFetch;
	
	private RestClientUtils() {
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> RestClientUtils<T> getInstance(Class<T> targetClass) {
		RestClientUtils restClientUtils = new RestClientUtils();
		restClientUtils.targetClass = targetClass;
		restClientUtils.mapper = JsonMapper.builder()
				.findAndAddModules()
				.serializationInclusion(JsonInclude.Include.NON_NULL)
				.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
				.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
				.build();
		
		return restClientUtils;
	}
	
	public static <T> RestClientUtils<T> getInstance(Class<T> targetClass, String fieldToFetch) {
		RestClientUtils<T> instance = getInstance(targetClass);
		instance.fieldToFetch = fieldToFetch;
		
		return instance;
	}
	
	public RestClientUtils<T> withAccessToken(AccessTokenRequest accessTokenRequest) {
		String accessToken = getAccessToken(accessTokenRequest);
		this.accessToken = "Bearer " + accessToken;
		
		return this;
	}
	
	public T executeGet(String url) {
        return executeGet(url, null);
	}
	
	public T executeGet(String url, Map<String, String> queryParams) {
        HttpGet httpGet = new HttpGet(url);
		if (null != queryParams) {
			prepareRequestParams(httpGet, queryParams);
		}
		String resultContent = executeRequest(httpGet);
        
        return transform(resultContent);
	}
	
	public T executePost(String url) {
		return executePost(url, null);
	}

	public T executePost(String url, Map<String, String> queryParams) {
		HttpPost httpPost = new HttpPost(url);
		if (null != queryParams) {
			prepareRequestParams(httpPost, queryParams);
		}
		String resultContent = executeRequest(httpPost);
        
        return transform(resultContent);
	}

	public String executeRequest(ClassicHttpRequest httpRequest) {
		httpRequest.setHeader("Authorization", accessToken);
		String resultContent = null;
		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            try (CloseableHttpResponse response = httpclient.execute(httpRequest)) {
                // Get status code
                log.info("Version: {}", response.getVersion()); // HTTP/1.1
                log.info("Code: {}", response.getCode()); // 200
                log.info("Reason Phrase: {}", response.getReasonPhrase()); // OK
                HttpEntity entity = response.getEntity();
                // Get response information
                resultContent = EntityUtils.toString(entity);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return resultContent;
	}
	
	public String getAccessToken(AccessTokenRequest accessTokenRequest) {
		try (CloseableHttpClient client = HttpClients.custom().addRequestInterceptorFirst((request, details, ctx) -> {
			log.info("Executing request: " + request + " with headers: " + Arrays.asList(request.getHeaders()));
		}).build()) {

			List<NameValuePair> params = new ArrayList<>();
			params.add(new BasicNameValuePair("client_id", accessTokenRequest.getClientId()));
			params.add(new BasicNameValuePair("client_secret", accessTokenRequest.getClientSecret()));
			params.add(new BasicNameValuePair("username", accessTokenRequest.getUserName()));
			params.add(new BasicNameValuePair("password", accessTokenRequest.getPassword()));
			params.add(new BasicNameValuePair("grant_type", "password"));
			  
			ClassicHttpRequest request = ClassicRequestBuilder.post()
					.setUri(accessTokenRequest.getTokenUri())
					.addHeader(HttpHeaders.ACCEPT, APPLICATION_JSON.getMimeType())
					.addHeader(HttpHeaders.CONTENT_TYPE, APPLICATION_FORM_URLENCODED.getMimeType())
					.setEntity(new UrlEncodedFormEntity(params))
					.build();

			try (CloseableHttpResponse response = client.execute(request)) {
				if (response.getCode() != HttpStatus.SC_OK) {
					throw new IllegalStateException("Failed to get access token!");
				}
				HttpEntity entity = response.getEntity();
				// Get response information
				String resultContent = EntityUtils.toString(entity);
				//read JSON like DOM Parser
				JsonNode rootNode = mapper.readTree(resultContent);
				JsonNode accessToken = rootNode.path("access_token");
				return accessToken.asText();
			} catch (ParseException e) {
				throw new RuntimeException("Failed to parse access token value.", e);
			} catch (IOException e) {
				throw new RuntimeException("Failed to read access token value.", e);
			}
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}
	}

	private static void prepareRequestParams(ClassicHttpRequest request, Map<String, String> queryParams) {
	    List<NameValuePair> nvps = new ArrayList<>();
	    // GET Query Parameters
	    queryParams.forEach((param, value) -> {
	        nvps.add(new BasicNameValuePair(param, value));
	    });
	    // Add to the request URL
	    try {
	        URI uri = new URIBuilder(request.getUri())
	            .addParameters(nvps)
	            .build();
	        request.setUri(uri);
	    } catch (URISyntaxException e) {
	        throw new RuntimeException(e);
	    }
	    
	}

	public T transform(String resultContent) {
		String finalResultContent = resultContent;
		T result = null;
		try {
			if (null != fieldToFetch) {
				log.debug("Finding field value: {}", fieldToFetch);
				JsonNode rootNode = mapper.readTree(resultContent);
				JsonNode fieldValueNode = rootNode.path(fieldToFetch);
				
				finalResultContent = fieldValueNode.toString();
			}
			log.debug("Transforming result content: {}", resultContent);
			result = mapper.readValue(finalResultContent, targetClass);
		} catch (JsonProcessingException e) {
			log.error("Failed to transform the result content.", e);
		}
		return result;
	}
}
