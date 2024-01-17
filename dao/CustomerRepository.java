package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neosoft.digiadmin.entity.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Long>{

	//JPQL
	@Query ("select c from CustomerDetails c where mobileNo=:mobNO and email=:email")
	public CustomerDetails getCustomerByMobileAndEmail (@Param("mobNO") long mobNo ,@Param("email") String email);
	
	
	
	
	
	
//	public Optional<List<CustomerDetails>> getCustDataById ( Long id);
}

