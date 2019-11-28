package com.fractal.client;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.fractal.client.services.AuthenticationService;

@Configuration
public class FractalIntegrationConfig {
	@Value("${com.fractal.client.apikey}")
	private String apiKey;
	
	@Value("${com.fractal.client.partnerId}")
	private String partnerId;
	
	@Value("${spring.h2.console.enabled}")
	private String h2;
	
	private AuthenticationService authenticationService;

	public FractalIntegrationConfig(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	@PostConstruct
	public void getkeysFromFile() {
		authenticationService.validateAuth(apiKey, partnerId);
	}
	
}
