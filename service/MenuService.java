package com.neosoft.digiadmin.service;

import java.util.List;

import com.neosoft.digiadmin.entity.MenuDetails;

public interface MenuService {

//	public void saveMenuDetails(MenuDetails menu);
	
	public void saveMenuData (MenuDetails menuData);
	
	public void updateMenuData (MenuDetails menuData);
	
	public List<MenuDetails> getAllMenuDetails();
	
	public MenuDetails getMenuDataById(Long id);
	
	List<MenuDetails> getActiveMenuDataDetails (int status);
	
	
	public void deleteMuneData (Long id);
}
