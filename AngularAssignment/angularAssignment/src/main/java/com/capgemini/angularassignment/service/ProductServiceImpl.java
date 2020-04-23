package com.capgemini.angularassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.angularassignment.beans.ProductPrimary;
import com.capgemini.angularassignment.dao.ProductDAO;

@Service
public class ProductServiceImplement implements ProductService{
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean updateProductInfo(ProductPrimary info) {
		return dao.updateProductInfo(info);
	}

	@Override
	public boolean deleteProductInfo(String productName) {
		return dao.deleteProductInfo(productName);
	}

	@Override
	public boolean createProductInfo(ProductPrimary info) {
		return dao.createProductInfo(info);
	}

	@Override
	public List<ProductPrimary> getAllRecordsProduct() {
		return dao.getAllRecordsProduct();
	}

}
