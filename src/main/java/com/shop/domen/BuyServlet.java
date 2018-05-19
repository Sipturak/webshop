package com.shop.domen;

import java.io.IOException;
import java.sql.SQLException;

import javax.print.attribute.standard.PDLOverrideSupported;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.helper.HelperClass;
import com.shop.model.User;
import com.shop.service.ProductServiceInterface;
import com.shop.service.UserServiceInterface;

/**
 * Servlet implementation class BuyServlet
 */
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserServiceInterface service;
	private ProductServiceInterface productService;
	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	service = HelperClass.helper.userService();
    	productService = HelperClass.helper.service();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = (String) request.getSession().getAttribute("email");
		
		String sql = "select email from users where email = ?";
		String sql1 = "select number_of_card from users where email = ?";
		String updatesql = "update cards set total = ? where id = ? ";
		String updateSqlForProducts = "update products set numberOfProduct = ? where id = ?";

		try {
			if(service.isLogin(sql, email)) {
				User u = service.getUser(sql1, email);
				int numberOfProducts = Integer.parseInt(request.getParameter("product_number"));
				if(u.buy(Double.parseDouble(request.getParameter("price_item"))) && numberOfProducts != 0) {
					numberOfProducts--;
					productService.update(updateSqlForProducts, request.getParameter("product_id"), numberOfProducts);
					service.updateUser(updatesql, u.getCard().getMoney().getTotal(), u.getCard().getNumberOfCard());
					request.getRequestDispatcher("/home").forward(request, response);
				}
					 
				else {
					//to stay on the same page
				}
					
			}
			else {
				request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
