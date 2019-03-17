package com.ing.ismart.model.request;

import java.util.Date;

public class TransactionModel {
	
	String transactionDescription;
	double amount;
	Date date;
	String paymentTypa;
	Long spendCategoryId;

	Long customerId;

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPaymentTypa() {
		return paymentTypa;
	}

	public void setPaymentTypa(String paymentTypa) {
		this.paymentTypa = paymentTypa;
	}

	public Long getSpendCategoryId() {
		return spendCategoryId;
	}

	public void setSpendCategoryId(Long spendCategoryId) {
		this.spendCategoryId = spendCategoryId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	

}
