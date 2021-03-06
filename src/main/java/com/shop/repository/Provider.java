package com.shop.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Provider {
	
	private Connection conn;
	private PreparedStatement pr;
	
	public Provider() {}
	
	public Provider(Connection conn) {
		this.conn = conn;
	}
	
	public ResultSet getResult(String sql) throws SQLException {
		return conn.prepareStatement(sql).executeQuery();
	}
	
	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}
	
	public ResultSet getUserResult(String sql,String arg0,String arg01) throws SQLException {
		pr = conn.prepareStatement(sql);
		pr.setString(1, arg0);
		pr.setString(2, arg01);
		return pr.executeQuery();
	}
	
	public ResultSet getResultOneArg(String sql, String arg0) throws SQLException {
		pr = getPreparedStatement(sql);
		pr.setString(1, arg0);
		return pr.executeQuery();
		
	}
	
	
	
	
	
	
	
	
	
}
