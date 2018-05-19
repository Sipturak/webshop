package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import com.shop.model.Product;
import com.shop.repository.ProductRepositoryInterface;

public class ProductService implements ProductServiceInterface {

	private ProductRepositoryInterface service;

	public ProductRepositoryInterface getService() {
		return service;
	}

	public void setService(ProductRepositoryInterface service) {
		this.service = service;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shop.service.ProductServiceInterface#getAllProducts(java.lang.String)
	 */
	@Override
	public List<Product> getAllProducts(String sql) throws SQLException {
		return service.getAllProducts(sql);
	}
	
	@Override
	public void update(String sql, String id, int numberOfProducts) throws SQLException {
		service.updateNumbersOfProduct(sql, id, numberOfProducts);
	}


}
