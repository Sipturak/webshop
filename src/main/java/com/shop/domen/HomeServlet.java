package com.shop.domen;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.helper.HelperClass;
import com.shop.model.Product;
import com.shop.service.ProductService;
import com.shop.service.ProductServiceInterface;

public class HomeServlet extends HttpServlet {
	
	private ProductServiceInterface service;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		service = HelperClass.helper.service();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sql = "select * from products";
		
		try {
			List<Product> list = service.getAllProducts(sql);
			req.setAttribute("products", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("WEB-INF/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
}
