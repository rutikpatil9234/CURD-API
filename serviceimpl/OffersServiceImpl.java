package com.neosoft.digiadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.OffersRepository;
import com.neosoft.digiadmin.entity.OffersDetails;
import com.neosoft.digiadmin.service.OffersService;

@Service
public class OffersServiceImpl implements OffersService{

	@Autowired
	OffersRepository offerRepo;
	@Override
	public void saveOffersDetailsData(OffersDetails offerData) {
		offerRepo.save(offerData);
		
	}

}
