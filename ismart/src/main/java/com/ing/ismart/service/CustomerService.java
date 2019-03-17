package com.ing.ismart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.ismart.domain.CustomerDetails;
import com.ing.ismart.domain.SpendCategory;
import com.ing.ismart.repository.CutomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CutomerRepository cutomerRepository;

	public void Createcustomer(String name,double amount) {
		CustomerDetails entity  = new CustomerDetails();
		entity.setCustomerName(name);
		entity.setBalanceAmount(amount);
		cutomerRepository.save(entity);
		
	}

	public List<CustomerDetails> getcustomers() {
		 List<CustomerDetails> data = new ArrayList<>();
		Iterable<CustomerDetails> list = cutomerRepository.findAll();
		System.out.println(list+"--------------");
		for(CustomerDetails spendCategory:list) {
			data.add(spendCategory);
		}
		return data;
	}

}
