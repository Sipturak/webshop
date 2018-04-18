package com.shop.domen;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.helper.HelperClass;
import com.shop.service.UserServiceInterface;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInterface service;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//connect to db
		service = HelperClass.helper.userService();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sql = "select email,password from users where email = ? and password = ?";
		
		try {
			if(service.hasUser(sql, request.getParameter("email"), request.getParameter("password"))) {
				request.getSession().setAttribute("email", request.getParameter("email"));
				request.getRequestDispatcher("/home").forward(request, response);
			}
			else {
				//setAttribute error
				request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
