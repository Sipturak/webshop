package com.shop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.helper.DbEnum;
import com.shop.helper.HelperConnectionDb;
import com.shop.model.Product;
import com.shop.model.Watch;

public class ProductRepository extends Provider implements ProductRepositoryInterface {


	public ProductRepository() throws SQLException {
		super(HelperConnectionDb.getDatabase.connect(DbEnum.MySql));
	}
	
	
	/* (non-Javadoc)
	 * @see com.shop.repository.ProductRepositoryInterface#getAllProducts(java.lang.String)
	 */
	@Override
	public List<Product> getAllProducts(String sql) throws SQLException{
		
		ResultSet rs = super.getResult(sql);
		List<Product> list = new ArrayList<>();
		Watch watch = null;
		while(rs.next()) {
			watch = new Watch(rs.getString("name"), rs.getString("description"), rs.getString("img_url"), Double.parseDouble(rs.getString("price")));
			list.add(watch);
		}
		return list;
	}
	
	public void close() throws SQLException {
		HelperConnectionDb.getDatabase.connect(DbEnum.MySql).close();
	}
	
	
	
	
}
