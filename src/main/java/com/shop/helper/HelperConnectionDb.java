package com.shop.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperConnectionDb {
	
	public static HelperConnectionDb getDatabase = new HelperConnectionDb();
	
	public static final String DbUrl = "jdbc:mysql://localhost/shop";
	public static final String DbUser = "root";
	public static final String DbPassword = "15109215";
	
	private Connection getConnection(String url,String user, String password) throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	public Connection connect(DbEnum database) throws SQLException {
		
		switch (database) {
		case Mysql:
			return getConnection(DbUrl, DbUser, DbPassword);
		default:
			throw new SQLException();
		}
		
	}
	
}
