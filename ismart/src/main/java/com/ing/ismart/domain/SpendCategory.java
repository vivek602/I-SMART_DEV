package com.ing.ismart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpendCategory {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long spendCategoryId;
	String spendCategoryName;
	public Long getSpendCategoryId() {
		return spendCategoryId;
	}
	public void setSpendCategoryId(Long spendCategoryId) {
		this.spendCategoryId = spendCategoryId;
	}
	public String getSpendCategoryName() {
		return spendCategoryName;
	}
	public void setSpendCategoryName(String spendCategoryName) {
		this.spendCategoryName = spendCategoryName;
	}
	public SpendCategory(Long spendCategoryId) {
		super();
		this.spendCategoryId = spendCategoryId;
	}
	public SpendCategory() {
		super();
	}
	
	
	
}
