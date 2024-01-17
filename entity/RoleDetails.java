package com.neosoft.digiadmin.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class RoleDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long Id ;
	
	@Column (name = "rollname" , length = 100 , nullable  = false)
	private String rollName;

	public RoleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleDetails(long id, String rollName) {
		super();
		Id = id;
		this.rollName = rollName;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}
	
	

}
