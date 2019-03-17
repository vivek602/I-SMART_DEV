package com.ing.ismart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.ismart.model.request.TransactionModel;
import com.ing.ismart.model.response.ResponseModel;
import com.ing.ismart.model.response.TransactionResponse;
import com.ing.ismart.service.TransactionService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	

	@PostMapping("transaction")
	public ResponseModel createTransaction(@RequestBody TransactionModel transactionModel) {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
		transactionService.createTransaction(transactionModel);
		
		return responseModel;
	} 
	
	@GetMapping("transaction")
	public ResponseModel getTransactions() {
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(true);
		responseModel.setMessage("sucess");
	List<TransactionResponse>	 list = transactionService.getTransactions();
	System.out.println(list);
	responseModel.setData(list);
		return responseModel;
	} 


}
