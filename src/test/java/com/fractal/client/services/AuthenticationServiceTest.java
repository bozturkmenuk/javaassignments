package com.fractal.client.services;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fractal.client.FractalSandboxApi;
import com.fractal.client.model.JWT;
import com.fractal.client.service.impl.AuthenticationServiceImplApiKey;
public class AuthenticationServiceTest {
	@Autowired
	private AuthenticationService authenticationService ;
	
	
	
	@Test
	void generateBearerToken() {
		assertDoesNotThrow(() -> authenticationService.validateAuth("SGP2ktEFEs45LY9x5T1WU8hgPOxYQfqy1fgcptfE", "5111acc7-c9b3-4d2a-9418-16e97b74b1e6"));
	}
	
	@Test 
	void generateBearerTokenFromSingleton() {
		
	}

}
