package com.fractal.client.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;

import com.fractal.client.model.Company;
@SpringBootTest
public class CompanyServiceTest {
	
	@Mock
	AuthenticationService authenticationService;
	@Autowired
	CompanyService companyService;
	
	


	
	



	@Test
	public void getAllCompanies() {
		when(authenticationService.getApiKey()).thenReturn("SGP2ktEFEs45LY9x5T1WU8hgPOxYQfqy1fgcptfE");
		when(authenticationService.getPartnerId()).thenReturn("5111acc7-c9b3-4d2a-9418-16e97b74b1e6");
	
		List<Company> companies =new  ArrayList<Company>();
		try {
			companies =  companyService.getAllCompanies(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(companies.size()>0);
	}

}
