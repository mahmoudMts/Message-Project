package com.lm.data.edi.rest;

import com.lm.data.edi.config.EdiSecretsConfig;

import lombok.Data;

@Data
public class AccessTokenRequest {
	
	private String tokenUri = EdiSecretsConfig.INSTANCE.getKeycloakTokenUri();

	private String clientId = EdiSecretsConfig.INSTANCE.getEdiIposClientId();
	
	private String clientSecret = EdiSecretsConfig.INSTANCE.getEdiIposClientSecret();
	
	private String userName = EdiSecretsConfig.INSTANCE.getEdiIposUserName();
	
	private String password = EdiSecretsConfig.INSTANCE.getEdiIposPassword();
	
	public static AccessTokenRequest defaultInstance() {
		return new AccessTokenRequest();
	}
	
}
