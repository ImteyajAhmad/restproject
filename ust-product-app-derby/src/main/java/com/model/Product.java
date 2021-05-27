package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private int productOnHand;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productOnHand = productOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductOnHand() {
		return productOnHand;
	}

	public void setProductOnHand(int productOnHand) {
		this.productOnHand = productOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productOnHand=" + productOnHand
				+ ", price=" + price + "]";
	}

}
