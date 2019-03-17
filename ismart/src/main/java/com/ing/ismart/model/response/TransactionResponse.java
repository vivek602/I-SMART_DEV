package com.ing.ismart.model.response;

import java.util.Date;

public class TransactionResponse {
	Long transactionId;
	String transactionDescription;
	double amount;
	Date date;
	String paymentType;
	String spendCategoryName;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
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
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getSpendCategoryName() {
		return spendCategoryName;
	}
	public void setSpendCategoryName(String spendCategoryName) {
		this.spendCategoryName = spendCategoryName;
	}

	


}
