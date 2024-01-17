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

import com.neosoft.digiadmin.entity.MenuDetails;
import com.neosoft.digiadmin.serviceimpl.MenuServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuDetailsController {
	
//	@Autowired
//	MenuServiceImpl menuServiceImpl;
//
//	@PostMapping("/save-menu")
//	public String saveMenuDetails( @RequestBody MenuDetails menu) {
//		menuServiceImpl.saveMenuDetails(menu);
//		return "Menu Saved Successfully";
//	}
	
	@Autowired
	MenuServiceImpl menuServiceImpls;
	
	@PostMapping("/save-menudata")
	public ResponseEntity<Map<String, String>> saveMenuDetail(@RequestBody  MenuDetails menuData){
		Map<String, String> responseMsg = new HashMap<>();
		menuServiceImpls.saveMenuData(menuData);
		responseMsg.put("message", "Menu Details Saved Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	
	@PutMapping("/update-menu")
	public ResponseEntity<Map<String, String>> updateMenuDetail(@RequestBody  MenuDetails menuData){
		Map<String, String> responseMsg = new HashMap<>();
		menuServiceImpls.updateMenuData(menuData);
		responseMsg.put("message", "Menu Details Update Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	
	@GetMapping("/menu-details")
	public ResponseEntity<List<MenuDetails>> getAllMenuDetails(){
		List<MenuDetails> menuList = menuServiceImpls.getAllMenuDetails();    // it will give list of the all data
		return new ResponseEntity<>(menuList,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/menu-details/{id}")
	public ResponseEntity<MenuDetails> getMenuDetailsById( @PathVariable Long id){
		MenuDetails menuData = menuServiceImpls.getMenuDataById(id);
		return new ResponseEntity<>(menuData,HttpStatus.OK);	
	}
	
	@GetMapping("/menu-by-status")
	public ResponseEntity<List<MenuDetails>> getActiveMenuDetails (@RequestParam int status){
		List<MenuDetails> menuList  = menuServiceImpls.getActiveMenuDataDetails(status);
		return new ResponseEntity<>(menuList,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete-menu/{id}")
	public String deletemenu (@PathVariable long id) {
		menuServiceImpls.deleteMuneData(id);
		return "Menu Delete Successfully";
	}
	
	
	
}
