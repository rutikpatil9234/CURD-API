package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.CustomerDetails;
import com.neosoft.digiadmin.entity.MenuDetails;
import com.neosoft.digiadmin.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
//	@PostMapping("/save-customer")
//	public String saveCustomerDetails( @RequestBody CustomerDetails cust) {
//		customerServiceImpl.saveCustomerDetails(cust);
//		return "Customer Saved Successfully";
//	}
	
	
	@PostMapping("/save-custdata")
	public ResponseEntity<Map<String, String>> saveCustomerDetail(@RequestBody  CustomerDetails custData){
		Map<String, String> responseMsg = new HashMap<>();
		customerServiceImpl.saveCustData(custData);
		responseMsg.put("message", "Customer Details Update Successfully");
		return ResponseEntity.ok(responseMsg);	
	}
	
	@PutMapping("/update-custdata")
	public ResponseEntity<Map<String, String>> updateCustDetail(@RequestBody  CustomerDetails custData){
		Map<String, String> responseMsg = new HashMap<>();
		customerServiceImpl.updateCustData(custData);
		responseMsg.put("message", "Customer Details Update Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	
	@GetMapping("/customer-details")
	public ResponseEntity<List<CustomerDetails>> getAllCustDetails(){
		List<CustomerDetails> custList = customerServiceImpl.getAllCustDetails();    // it will give list of the all data
		return new ResponseEntity<>(custList,HttpStatus.OK);
	}
	
	@GetMapping("/customer-details/{id}")
	public ResponseEntity <CustomerDetails> getCustDetailsById( @PathVariable Long id){
		  CustomerDetails custData =  customerServiceImpl.getCustDataById(id);
		  return new ResponseEntity<>(custData,HttpStatus.OK);
	}
	
	
//	@GetMapping("/customer-by-custname")
//	public ResponseEntity<List<CustomerDetails>> getActiveCustDetails (@RequestParam String custname){
//		List<CustomerDetails> custData  = customerServiceImpl.getActiveCustDataDetails(custname);
//		return new ResponseEntity<>(custData,HttpStatus.OK);
//		
//	}
	
	
	
	@DeleteMapping("/delete-customer/{id}")
	public String deleteCustomer (@PathVariable long id) {
		customerServiceImpl.deleteCustomerData(id);
		return "Customer Delete Successfully";
	}
	
	
	
//	@DeleteMapping("/delete-custdata/{id}")
//	public ResponseEntity<CustomerDetails> deleteCustomerDetail(@PathVariable Long id ){
//		CustomerDetails custData = customerServiceImpl.getCustDeleteDataById(id);
//		return new ResponseEntity<>(custData,HttpStatus.OK);	
//	}
	
	
	
	@GetMapping ("/customer-details/{mobNo}/{email}")
	public ResponseEntity<CustomerDetails> getCustomerByMobNoAndEmail(@PathVariable long mobNo , @PathVariable String email){
	 CustomerDetails custData =	customerServiceImpl.getCustomerDataByMobNoAndEmail(mobNo, email);
	 return new ResponseEntity<>(custData, HttpStatus.OK);
	}
	
	
} 
