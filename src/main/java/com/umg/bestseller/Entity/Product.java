package com.umg.bestseller.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name = "product_id")
	private int id;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_DESC")
	private String productDesc;
	@Column(name = "BRAND_ID")
	private int brandId;
	@Column(name = "PRODUCT_PRICE")
	private float productPrice;
	@Column(name = "PRODUCT_IMG")
	private String productIMG;
	
	public int getId() {
		return id;
	}
	public void setId(int productID) {
		this.id = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductIMG() {
		return productIMG;
	}
	public void setProductIMG(String productIMG) {
		this.productIMG = productIMG;
	}
	
	
}
