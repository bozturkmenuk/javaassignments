package com.fractal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.fractal.model.Transaction;
@Service
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
