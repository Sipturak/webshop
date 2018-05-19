package com.shop.model;

public abstract class Product {

	private String name;
	private String description;
	private String img_url;
	private double price;
	private int numberOfProduct;
	private int id;

	public Product(String name, String description, String img_url, double price, int numberOfProduct,int id) {
		super();
		this.name = name;
		this.description = description;
		this.img_url = img_url;
		this.price = price;
		this.numberOfProduct = numberOfProduct;
		this.id = id;
	}

	public Product(String name, String description, String img_url) {
		super();
		this.name = name;
		this.description = description;
		this.img_url = img_url;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImg_url() {
		return img_url;
	}

	public double getPrice() {
		return price;
	}

	public int getNumberOfProduct() {
		return numberOfProduct;
	}

	public int getId() {
		return id;
	} 
	
	

}
