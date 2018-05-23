package com.shop.helper;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.shop.model.Product;

public class ItemClass extends ProductBaseClass {

	public ItemClass(List<Product> list, int value, String name) {
		super(list, value, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeSet(HttpServletRequest reqeust) {
		reqeust.setAttribute(getName(), getItem(getList(), getValue()));
	}

}
