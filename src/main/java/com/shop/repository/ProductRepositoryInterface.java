package com.shop.repository;

import java.sql.SQLException;
import java.util.List;

import com.shop.model.Product;

public interface ProductRepositoryInterface {

	List<Product> getAllProducts(String sql) throws SQLException;

	void updateNumbersOfProduct(String sql, String id, int numberOfProducts) throws SQLException;

}