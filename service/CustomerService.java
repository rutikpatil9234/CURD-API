package com.neosoft.digiadmin.service;

import java.util.List;

import com.neosoft.digiadmin.entity.CustomerDetails;

public interface CustomerService {

//	public void saveCustomerDetails(CustomerDetails cust);
	
	public void saveCustData (CustomerDetails custData);
	
	public void updateCustData(CustomerDetails custData);
	
	
	public List<CustomerDetails> getAllCustDetails();
	
	public CustomerDetails getCustDataById(Long id);
	
//	List<CustomerDetails> getActiveCustDataDetails (String custname);
	
	
	
	public void deleteCustomerData (Long id);
	
//	public CustomerDetails getCustDeleteDataById (Long id );
	
	
	public CustomerDetails getCustomerDataByMobNoAndEmail (long mobNo , String email);

	
	
}
