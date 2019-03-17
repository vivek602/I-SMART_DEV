package com.ing.ismart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.ismart.domain.SpendCategory;
import com.ing.ismart.model.response.ResponseModel;
import com.ing.ismart.service.SpendingCategoryService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class SpendingCategoryController {
	
	@Autowired
	SpendingCategoryService SpendingCategoryService;
	
	@PostMapping("spendingCategory")
	public ResponseModel CreateSpendingCategory(@RequestParam String name) {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
		SpendingCategoryService.CreateSpendingCategory(name);
		
		return responseModel;
	} 
	
	@GetMapping("spendingCategory")
	public ResponseModel getSpendingCategory() {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
	List<SpendCategory>	 list = SpendingCategoryService.getSpendingCategory();
	responseModel.setData(list);
		return responseModel;
	} 

}
