package com.productlog.products.modal;

import java.math.BigDecimal;

public class Product {
	private String productId;
	private String productName;
	private String category;
	private BigDecimal cost;
	private String companyName;
	
	public Product(String productId, String productName, String category, BigDecimal cost, String companyName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.cost = cost;
		this.companyName = companyName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
