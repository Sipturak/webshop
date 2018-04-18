package com.shop.domen;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.helper.HelperClass;
import com.shop.model.Card;
import com.shop.model.User;
import com.shop.service.UserServiceInterface;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInterface service;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service = HelperClass.helper.userService();
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
		//register page
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sql = "insert into users (email, password, name, lastname, address,money, number_of_card) values (?,?,?,?,?,?,?)";
		
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String number_of_card = request.getParameter("number_of_card");
		String [] nStrings = number_of_card.split("[-]");
		
		StringBuilder bl = new StringBuilder();
		
		for(int i = 0; i < nStrings.length; i++) {
				bl.append(nStrings[i]);
		}
		
		User user = new User(name, lastname, email, password, address);
		Card card = new Card();
		card.setNumberOfCard(bl.toString());
		user.setCard(card);
		try {
			service.registerUser(sql, user);
			request.getRequestDispatcher("/home").forward(request, response);
		} catch (SQLException | NullPointerException e) {
			//get paticirual class of exception
			//set attribute for exception
			request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
			
		}
		
	}

}
