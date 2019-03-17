package com.ing.ismart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ing.ismart.domain.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
