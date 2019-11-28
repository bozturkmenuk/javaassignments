package com.fractal.client.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fractal.client.FractalSandboxApi;
import com.fractal.client.ApiClient;
import com.fractal.client.model.Company;
import com.fractal.client.services.AuthenticationService;
import com.fractal.client.services.CompanyService;

@Component
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private AuthenticationService authenticationService;
	@Autowired
	private FractalSandboxApi fractalapi;


	@Override
	public void createCompany(Company company) {
		

	}

	@Override
	public List<Company> getAllCompanies(Optional<Integer> pg) {
		List<Company> companies =  fractalapi.getCompanies(pg);
		return companies;
	}

	@Override
	public Company getCompanyById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
