package com.neosoft.digiadmin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "submenu")
public class SubMuneDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "submenuname")
	private String subMenuName;
	
	
	@Column(name ="status")
	private int status;
	
	@ManyToOne  // aslo use for ferian key key lagane ke kiye // because more than one record same one id thas why we use ManyToOne
	@JoinColumn(name ="menuid")
	private MenuDetails menu;   // because forien key in Menudetails pr lagana hai esliye menudetails liya

	
	//when requarment diff menu create that resero create two table 
	
	//oneTomany - map your id in another table as forien key 
	
	//why casched include then sppose to be i changes samething so what ever cahgne in reflate in submenu that why in include or jo bhi change hoga submenu me hoa 
	
	
	
	
	public SubMuneDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubMuneDetails(long id, String subMenuName, int status, MenuDetails menu) {
		super();
		this.id = id;
		this.subMenuName = subMenuName;
		this.status = status;
		this.menu = menu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubMenuName() {
		return subMenuName;
	}

	public void setSubMenuName(String subMenuName) {
		this.subMenuName = subMenuName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public MenuDetails getMenu() {
		return menu;
	}

	public void setMenu(MenuDetails menu) {
		this.menu = menu;
	}
	
	
	

}
