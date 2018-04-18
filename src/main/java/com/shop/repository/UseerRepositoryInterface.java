package com.shop.repository;

import java.sql.SQLException;

import com.shop.model.User;

public interface UseerRepositoryInterface {

	boolean hasUser(String sql, String usernameoremail, String password) throws SQLException;

	void registerUser(String sql, User user) throws SQLException;

	void updateUser(String sql, double money,String id) throws SQLException;

	double getMoney(String sql, String email) throws SQLException;

	boolean isLogin(String sql, String email) throws SQLException;

	User getUser(String sql, String email) throws NullPointerException, SQLException;

}