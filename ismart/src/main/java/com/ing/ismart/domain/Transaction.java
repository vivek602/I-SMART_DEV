package com.ing.ismart.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long transactionId;
	String transactionDescription;
	double amount;
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	String paymentTypa;
	@ManyToOne
	@JoinColumn(name="spendCategoryId")
	SpendCategory spendCategory;

	@ManyToOne
	@JoinColumn(name="customerId")
	CustomerDetails customerDetails;

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

	public String getPaymentTypa() {
		return paymentTypa;
	}

	public void setPaymentTypa(String paymentTypa) {
		this.paymentTypa = paymentTypa;
	}

	public SpendCategory getSpendCategory() {
		return spendCategory;
	}

	public void setSpendCategory(SpendCategory spendCategory) {
		this.spendCategory = spendCategory;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	

}
