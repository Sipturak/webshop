package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import com.shop.model.Product;

public interface ProductServiceInterface {

	List<Product> getAllProducts(String sql) throws SQLException;

}