package com.shop.domen;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.helper.HelperClass;
import com.shop.model.Product;
import com.shop.model.Watch;
import com.shop.service.ProductServiceInterface;
import com.shop.service.UserService;

/**
 * Servlet implementation class PageServlet
 */
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ProductServiceInterface service;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		service = HelperClass.helper.service();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String click = request.getParameter("f12");
		
		String sql = "select * from products";
		
		try {
			List<Product> list = service.getAllProducts(sql);
				if(click.equals("0")) {
					request.setAttribute("product_item", list.get(0));
				}
				else if(click.equals("1")) {
					request.setAttribute("product_item", list.get(1));
				}
				else if(click.equals("2")) {
					request.setAttribute("product_item", list.get(2));
				}
				else if(click.equals("3")) {
					request.setAttribute("product_item", list.get(3));
				}
				else if(click.equals("4")) {
					request.setAttribute("product_item", list.get(4));
				}
				else {
					request.setAttribute("product_item", list.get(5));
				}
				
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
				
		request.getRequestDispatcher("WEB-INF/page.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
