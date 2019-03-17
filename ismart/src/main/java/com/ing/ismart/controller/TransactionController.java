package com.ing.ismart.controller;

import java.util.Iterator;
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
	
	@GetMapping("transaction")
	public ResponseModel getAverageMonthlyBalance() {
		ResponseModel responseModel = new ResponseModel();
		TransactionResponse res = null;
		List<TransactionResponse> list = transactionService.getTransactions();
		
		double average = 0,averageoutflow=0, amountsum=0, outflowsum=0 ;
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			res = (TransactionResponse) itr.next();
			
			if(res.getPaymentType() == "Dr") {
				outflowsum=outflowsum + res.getAmount();
				
			}
			if(res.getPaymentType() == "Cr") {
				amountsum = amountsum + res.getAmount();
			}
		}
		
		try {
			average = amountsum/30;
			averageoutflow = outflowsum/30;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(average);
		responseModel.setData(average);
		responseModel.setData(averageoutflow);
		
		return responseModel;
	}


}
