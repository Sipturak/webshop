package com.shop.helper;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.shop.model.Product;

public abstract class ProductBaseClass {

	private String name;
	private int value;
	private List<Product> list;

	public ProductBaseClass(List<Product> list, int value, String name) {
		this.value = value;
		this.list = list;
		this.name = name;
	}

	public abstract void executeSet(HttpServletRequest reqeust);

	public Product getItem(List<Product> list, int index) {
		return list.get(index);
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public List<Product> getList() {
		return list;
	}
}
