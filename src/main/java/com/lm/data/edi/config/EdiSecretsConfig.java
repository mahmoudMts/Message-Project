package com.lm.data.edi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClient;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

public class EdiSecretsConfig {
	public static final EdiSecretsConfig INSTANCE;
    private final Logger log = LoggerFactory.getLogger(EdiSecretsConfig.class);
    private final String SECRET_NAME = "/eks/dev101/em/edim/";
    private final String REGION = "eu-west-2";
    private final String HOST_KEY = "RedShiftEndpoint";
    private final String DATABASE_KEY = "RedShiftDatabaseName";
    private final String USERNAME_KEY = "RedShiftUsername";
    private final String PASSWORD_KEY = "RedShiftPassword";
    private final String PORT_KEY = "RedShiftPort";
    private final String PREMIUMS_PORTAL_REST_BASE_URI = "PremiumsPortalBaseUri";
    private final String PREMIUMS_API_REST_BASE_URI = "PremiumsApiBaseUri";
    private final String KEYCLOAK_TOKEN_URI = "KeycloakTokenUri";
    private final String EDI_IPOS_CLIENTID = "EdiIposClientId";
    private final String EDI_IPOS_CLIENT_SECRET = "EdiIposClientSecret";
    private final String EDI_IPOS_USERNAME = "EdiIposUserName";
    private final String EDI_IPOS_PASSWORD = "EdiIposPassword";
    @Getter
    private String host;
    @Getter
    private String database;
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private String port;
    
    @Getter
    private String premiumsPortalServiceBaseUri;
    
    @Getter
    private String premiumsApiServiceBaseUri;
    
    @Getter
    private String keycloakTokenUri;
    @Getter
    private String ediIposClientId;
    @Getter
    private String ediIposClientSecret;
    @Getter
    private String ediIposUserName;
    @Getter
    private String ediIposPassword;
    
    static {
    	INSTANCE = new EdiSecretsConfig();
    	INSTANCE.loadSecretDetails();
    }

    public void loadSecretDetails() {

        try {

            log.info("Reading secret details ");
            AWSSecretsManager client = AWSSecretsManagerClient.builder().withRegion(REGION).build();
            GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest().withSecretId(SECRET_NAME);
            GetSecretValueResult getSecretValueResult = client.getSecretValue(getSecretValueRequest);

            ObjectMapper mapper = new ObjectMapper();
            String secret = getSecretValueResult.getSecretString();
            JsonNode secretJson = mapper.readTree(secret);

            host = secretJson.get(HOST_KEY).textValue();
            database = secretJson.get(DATABASE_KEY).textValue();
            username = secretJson.get(USERNAME_KEY).textValue();
            password = secretJson.get(PASSWORD_KEY).textValue();
            port = secretJson.get(PORT_KEY).textValue();
            
            premiumsPortalServiceBaseUri = secretJson.get(PREMIUMS_PORTAL_REST_BASE_URI).textValue();
            premiumsApiServiceBaseUri = secretJson.get(PREMIUMS_API_REST_BASE_URI).textValue();
            keycloakTokenUri = secretJson.get(KEYCLOAK_TOKEN_URI).textValue();
            ediIposClientId = secretJson.get(EDI_IPOS_CLIENTID).textValue();
            ediIposClientSecret = secretJson.get(EDI_IPOS_CLIENT_SECRET).textValue();
            ediIposUserName = secretJson.get(EDI_IPOS_USERNAME).textValue();
            ediIposPassword = secretJson.get(EDI_IPOS_PASSWORD).textValue();
            

        } catch (Exception ex) {
            log.error("Error reading the secret details ", ex);
        }
    }

}
