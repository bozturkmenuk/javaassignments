package com.fractal.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fractal.api.v1.domain.TransactionDTO;
import com.fractal.model.Transaction;

@Mapper
public interface TransactionMapper {

	TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);
	
	TransactionDTO transactionToTransactionDTO(Transaction transaction);
	
}
