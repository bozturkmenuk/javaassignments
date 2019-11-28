package com.fractal.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fractal.client.model.Company;
@Service
public interface CompanyService {

	public void createCompany(Company company);
	public Company getCompanyById(Long Id);
	public List<Company>  getAllCompanies(Optional<Integer> pg);
}
