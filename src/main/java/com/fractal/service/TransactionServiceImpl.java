package com.fractal.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.fractal.api.v1.domain.TransactionDTO;
import com.fractal.api.v1.mapper.TransactionMapper;
import com.fractal.repositories.TransactionRepository;
@Service
@Primary
public class TransactionServiceImpl implements TransactionService {

	private TransactionRepository transactionRepository;
	private TransactionMapper transactionMapper;
	
	public TransactionServiceImpl(TransactionMapper transactionMapper,TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
		this.transactionMapper = transactionMapper;
	}

	@Override
	public List<TransactionDTO> getTransactionsByCategoryId(Integer categoryId) {
		return transactionRepository.getTransactionsByCategoryId(categoryId.longValue())
				.stream()
				.map(transactionMapper::transactionToTransactionDTO)
				.collect(Collectors.toList());
	}
	
	

}
