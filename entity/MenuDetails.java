package com.neosoft.digiadmin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.*;
@Entity
@Table(name = "menu")
public class MenuDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "menuname")
	private String muneName;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "menu")  // mapped - use for menus name ,  map use id in menu
	private List<SubMuneDetails> submenu; // one menu have mutiple submenu that reon we put listofsubmenu //not a colunm add only relation stablish

	public MenuDetails() {
		super();
	}

	public MenuDetails(long id, String muneName, int status, List<SubMuneDetails> submenu) {
		super();
		this.id = id;
		this.muneName = muneName;
		this.status = status;
		this.submenu = submenu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMuneName() {
		return muneName;
	}

	public void setMuneName(String muneName) {
		this.muneName = muneName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<SubMuneDetails> getSubmenu() {
		return submenu;
	}

	public void setSubmenu(List<SubMuneDetails> submenu) {
		this.submenu = submenu;
	}
	

}
