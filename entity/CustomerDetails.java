package com.neosoft.digiadmin.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (name="custname")
	private String custName;
	
	@Column(name = "mobileno")
	private long mobileNo;
	
	@Column (name="dob")
	private Date dob;
	
	@Column(name="pancard")
	private String panCard;
	
	@Column(name="email")
	private String email;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="customer_offers", joinColumns = {@JoinColumn(name="custid")} , inverseJoinColumns = {@JoinColumn(name="offerid")})
	private Set<OffersDetails> offers = new HashSet<>();

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(long id, String custName, long mobileNo, Date dob, String panCard, String email,
			Set<OffersDetails> offers) {
		super();
		this.id = id;
		this.custName = custName;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.panCard = panCard;
		this.email = email;
		this.offers = offers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<OffersDetails> getOffers() {
		return offers;
	}

	public void setOffers(Set<OffersDetails> offers) {
		this.offers = offers;
	}

	
	
	

}
