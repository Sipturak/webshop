package com.shop.model;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Product {

	private String name;
	private String description;
	private String img_url;
	private double price;

	public Product(String name, String description, String img_url, double price) {
		super();
		this.name = name;
		this.description = description;
		this.img_url = img_url;
		this.price = price;
	}
	public Product(String name, String description, String img_url) {
		super();
		this.name = name;
		this.description = description;
		this.img_url = img_url;
	}
	
	public Product() {}

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
}
