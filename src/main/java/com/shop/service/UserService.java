package com.shop.service;

import java.sql.SQLException;

import com.shop.model.User;
import com.shop.repository.UseerRepositoryInterface;

public class UserService implements UserServiceInterface {
	
	private UseerRepositoryInterface userService;

	public UseerRepositoryInterface getUserService() {
		return userService;
	}

	public void setUserService(UseerRepositoryInterface userService) {
		this.userService = userService;
	}
	
	/* (non-Javadoc)
	 * @see com.shop.service.UserServiceInterface#hasUser(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean hasUser(String sql, String usernameoremail, String password) throws SQLException {
		return userService.hasUser(sql, usernameoremail, password);
	}
	
	/* (non-Javadoc)
	 * @see com.shop.service.UserServiceInterface#registerUser(java.lang.String, com.shop.model.User)
	 */
	@Override
	public void registerUser(String sql, User user) throws SQLException {
		userService.registerUser(sql, user);
	}
	/* (non-Javadoc)
	 * @see com.shop.service.UserServiceInterface#updateUser(java.lang.String, double)
	 */
	@Override
	public void updateUser(String sql, double money,String id) throws SQLException {
		userService.updateUser(sql, money,id);
	}
	
	@Override
	public double getMoney(String sql, String email) throws SQLException {
		return userService.getMoney(sql, email);
	}
	@Override
	public boolean isLogin(String sql, String email) throws SQLException {
		return userService.isLogin(sql, email);
	}
	@Override
	public User getUser(String sql, String email) throws NullPointerException, SQLException {
		return userService.getUser(sql, email);
	}
	
	
	
}
