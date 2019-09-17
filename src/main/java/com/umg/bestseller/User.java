package com.umg.bestseller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASS")
	private String pass;
	@Column(name="ROLE")
	private String role;
	@Column(name="STATUS")
	private String status;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LAST_NAME")
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BIRTHDAY")
	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEL_NUM")
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DELIVERY_ADDR")
	public String getDelAddress() {
		return delAddress;
	}
	public void setDelAddress(String delAddress) {
		this.delAddress = delAddress;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USERNAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PASS")
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
