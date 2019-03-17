package com.ing.ismart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.ismart.domain.SpendCategory;
import com.ing.ismart.repository.SpendingCategoryRepository;

@Service
public class SpendingCategoryService {
	
	@Autowired
	SpendingCategoryRepository categoryRepository;

	public void CreateSpendingCategory(String name) {
		SpendCategory entity  = new SpendCategory();
		entity.setSpendCategoryName(name);
		categoryRepository.save(entity);
		
	}

	public List<SpendCategory> getSpendingCategory() {
		 List<SpendCategory> data = new ArrayList<>();
		Iterable<SpendCategory> list = categoryRepository.findAll();
		for(SpendCategory spendCategory:list) {
			data.add(spendCategory);
		}
		return data;
	}

}
