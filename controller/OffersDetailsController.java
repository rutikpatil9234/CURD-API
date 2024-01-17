package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.OffersDetails;
import com.neosoft.digiadmin.serviceimpl.OffersServiceImpl;

@RestController
@RequestMapping("/offers")
public class OffersDetailsController {
	
	@Autowired
	OffersServiceImpl offersServiceImpl;
	
	@PostMapping("/save-offers")
	public ResponseEntity<Map<String,String >> saveOffersDeatails (@RequestBody OffersDetails offerData){
		Map<String, String> responseMsg = new HashMap<>();
		offersServiceImpl.saveOffersDetailsData(offerData);
		responseMsg.put("message", "Offers Details Save Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	

}
