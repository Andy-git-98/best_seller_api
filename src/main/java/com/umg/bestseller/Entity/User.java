package com.umg.bestseller.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="ID_USER")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LAST_NAME")
	private String lName;
	@Column(name="BIRTHDAY")
	private String bDay;
	@Column(name="TEL_NUM")
	private String telNum;
	@Column(name="DELIVERY_ADDR")
	private String delAddress;
	@Column(name="EMAIL")
	private String email;
	@Column(name="USERNAME",unique=true)
	private String userName;
	@Column(name="PASS")
	private String pass;
	@Column(name="ROLE")
	private String role;
	@Column(name="STATUS")
	private String status;
	@Column(name="IMAGE")
	private String image;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getDelAddress() {
		return delAddress;
	}
	public void setDelAddress(String delAddress) {
		this.delAddress = delAddress;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
