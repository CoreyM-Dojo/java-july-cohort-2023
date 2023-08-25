package com.example.springsecurity.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Config {
	
	@Value("${api.key}")
	String apiKey;
	@Value("${api.id}")
	String apiId;
	
	@Value("${spring.security.oauth2.client.registration.google.client-id}")
	String googleClientId;
	
	@Value("${spring.security.oauth2.client.registration.google.client-secret}")
	String googleClientSecret;
	
	@Value("${spring.security.oauth2.client.registration.github.client-id}")
	String githubClientId;
	@Value("${spring.security.oauth2.client.registration.google.client-secret}")
	String githubClientSecret;
	
	

	public String getApiKey() {
		return apiKey;
	}
	
	
	
	

	public String getApiId() {
		return apiId;
	}





	public String getGoogleClientId() {
		return googleClientId;
	}






	public String getGoogleClientSecret() {
		return googleClientSecret;
	}
	
	public String getGithubClientId() {
		return githubClientId;
	}
	
	
	
	public String getGithubClientSecret() {
		return githubClientSecret;
	}
	
	

//	@Value("${spring.security.oauth2.client.registration.google.client-id}")
//	String googleClientId;
//	@Value("${spring.security.oauth2.client.registration.google.client-secret}")
//	String googleClientSecret;
//	@Value("${spring.security.oauth2.client.registration.github.client-id}")
//	String githubClientId;
//	@Value("${spring.security.oauth2.client.registration.github.client-secret}")
//	String githubClientSecret;
//
//	public String getGoogleClientId() {
//		return googleClientId;
//	}
//
//	public void setGoogleClientId(String googleClientId) {
//		this.googleClientId = googleClientId;
//	}
//
//	public String getGoogleClientSecret() {
//		return googleClientSecret;
//	}
//
//	public void setGoogleClientSecret(String googleClientSecret) {
//		this.googleClientSecret = googleClientSecret;
//	}
//
//	public String getGithubClientId() {
//		return githubClientId;
//	}
//
//	public void setGithubClientId(String githubClientId) {
//		this.githubClientId = githubClientId;
//	}
//
//	public String getGithubClientSecret() {
//		return githubClientSecret;
//	}
//
//	public void setGithubClientSecret(String githubClientSecret) {
//		this.githubClientSecret = githubClientSecret;
	
}
