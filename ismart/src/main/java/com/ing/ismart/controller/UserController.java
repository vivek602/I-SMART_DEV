package com.ing.ismart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.ismart.domain.CustomerDetails;
import com.ing.ismart.model.response.ResponseModel;
import com.ing.ismart.service.CustomerService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
@CrossOrigin
public class UserController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("customer")
	public ResponseModel Createcustomer(@RequestParam String name,@RequestParam Double amount) {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
		customerService.Createcustomer(name,amount);
		
		return responseModel;
	} 
	
	@GetMapping("customers")
	public ResponseModel getcustomers() {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
	List<CustomerDetails>	 list = customerService.getcustomers();
	System.out.println(list);
	responseModel.setData(list);
		return responseModel;
	} 


}
