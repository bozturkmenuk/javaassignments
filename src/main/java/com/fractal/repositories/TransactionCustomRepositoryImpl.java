package com.fractal.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

import com.fractal.model.Transaction;
@Service
public class TransactionCustomRepositoryImpl implements TransactionCustomRepository {
	private EntityManager entitymanager;

	public TransactionCustomRepositoryImpl(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Transaction> getTransactionsByCategoryId(Long categoryId) {

		CriteriaBuilder cb = entitymanager.getCriteriaBuilder();
		CriteriaQuery<Transaction> c = cb.createQuery(Transaction.class);
		Root<Transaction> root = c.from(Transaction.class);

		c.where(cb.equal(root.get("category"), categoryId));

		List<Transaction> transactions = entitymanager.createQuery(c).getResultList();

		return transactions;
	}

}
