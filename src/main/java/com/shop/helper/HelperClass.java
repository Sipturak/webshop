package com.shop.helper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.service.ProductService;
import com.shop.service.ProductServiceInterface;
import com.shop.service.UserService;
import com.shop.service.UserServiceInterface;

public class HelperClass {
	
	public static HelperClass helper = new HelperClass();
	
	private ApplicationContext context;
	
	public HelperClass() {
		context = new ClassPathXmlApplicationContext("appContext.xml");
	}
	
	public ProductServiceInterface service () {
		return context.getBean("productService", ProductService.class);
	}
	
	public UserServiceInterface userService() {
		return context.getBean("userService", UserService.class);
	}
	
}
