package com.neosoft.digiadmin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.CustomerRepository;
import com.neosoft.digiadmin.entity.CustomerDetails;
import com.neosoft.digiadmin.service.CustomerService;

import jakarta.persistence.NoResultException;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRepo;
	
//	@Override
//	public void saveCustomerDetails(CustomerDetails cust) {
//		custRepo.save(cust);
//		
//	}

	
	
	@Override
	public void saveCustData(CustomerDetails custData) {
		custRepo.save(custData);
		
	}

	
	
	@Override
	public void updateCustData(CustomerDetails custData) {
//		if(!custData.getCustName().isEmpty() && custData.getCustName() != null) {
			custRepo.save(custData);
//		}else {
//			throw new NullPointerException("Customer Details are null");
//		}
			
	}



	@Override
	public List<CustomerDetails> getAllCustDetails() {
		List<CustomerDetails> customerDetailsList = custRepo.findAll();
		if( customerDetailsList !=null && !customerDetailsList.isEmpty()) {
			return customerDetailsList;
		}else {
			throw new NoResultException("No Records Present in Customer");
		}
	}



	@Override
	public CustomerDetails getCustDataById(Long id) {
		Optional<CustomerDetails> custData = custRepo.findById(id);
		if(custData.isPresent()) {
			return custData.get();
		}else {
			throw new NullPointerException("No Records Founds");
			}
	}



//	@Override
//	public List<CustomerDetails> getActiveCustDataDetails(String custname) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

	@Override
	public void deleteCustomerData(Long id) {
		custRepo.deleteById(id);
		
	}



	
//	@Override
//	public CustomerDetails getCustDeleteDataById(Long id) {
//		custRepo.deleteById(id);
//		return null;
//	}
	

	@Override
	public CustomerDetails getCustomerDataByMobNoAndEmail(long mobNo, String email) {
		return custRepo.getCustomerByMobileAndEmail(mobNo, email);
	}
	



	



	



	



	



	
		
	

}
