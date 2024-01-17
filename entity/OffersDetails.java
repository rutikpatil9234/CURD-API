package com.neosoft.digiadmin.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="offers")
public class OffersDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="offersname")
	private String offersName;
	
	@Column(name="status")
	private int status;
	
	@ManyToMany(mappedBy = "offers")
	private Set<CustomerDetails> custSet = new HashSet<>();

	public OffersDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OffersDetails(long id, String offersName, int status, Set<CustomerDetails> custSet) {
		super();
		this.id = id;
		this.offersName = offersName;
		this.status = status;
		this.custSet = custSet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOffersName() {
		return offersName;
	}

	public void setOffersName(String offersName) {
		this.offersName = offersName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<CustomerDetails> getCustSet() {
		return custSet;
	}

	public void setCustSet(Set<CustomerDetails> custSet) {
		this.custSet = custSet;
	}

	
}
