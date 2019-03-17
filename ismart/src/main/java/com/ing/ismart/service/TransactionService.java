package com.ing.ismart.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.ismart.domain.CustomerDetails;
import com.ing.ismart.domain.SpendCategory;
import com.ing.ismart.domain.Transaction;
import com.ing.ismart.model.request.TransactionModel;
import com.ing.ismart.model.response.TransactionResponse;
import com.ing.ismart.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {
	@Autowired
	TransactionRepository transactionRepository;

	public void createTransaction(TransactionModel transactionModel) {
		Transaction transaction = new Transaction();
		transaction.setAmount(transactionModel.getAmount());
		transaction.setCustomerDetails(new CustomerDetails(transactionModel.getCustomerId()));
		transaction.setDate(transactionModel.getDate());
		transaction.setPaymentTypa(transactionModel.getPaymentTypa());
		transaction.setSpendCategory(new SpendCategory(transactionModel.getSpendCategoryId()));
		transaction.setTransactionDescription(transactionModel.getTransactionDescription());
		transactionRepository.save(transaction);
	}

	public List<TransactionResponse> getTransactions() {
		List<TransactionResponse> data = new ArrayList<>();
		Iterable<Transaction> taList = transactionRepository.findAll();
		for(Transaction t :taList) {
			TransactionResponse transactionResponse = new TransactionResponse();
			transactionResponse.setAmount(t.getAmount());
			transactionResponse.setDate(t.getDate());
			transactionResponse.setPaymentType(t.getPaymentTypa());
			transactionResponse.setSpendCategoryName(t.getSpendCategory().getSpendCategoryName());
			transactionResponse.setTransactionDescription(t.getTransactionDescription());
			transactionResponse.setTransactionId(t.getTransactionId());
			data.add(transactionResponse);
		}
		return data;
	}

}
