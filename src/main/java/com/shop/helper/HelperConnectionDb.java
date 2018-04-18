package com.shop.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperConnectionDb {
	
	public static HelperConnectionDb getDatabase = new HelperConnectionDb();
	
	public Connection getConnection(String url,String user, String password) throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
}
