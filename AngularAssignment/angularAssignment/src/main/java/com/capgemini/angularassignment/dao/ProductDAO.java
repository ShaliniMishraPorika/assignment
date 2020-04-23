package com.capgemini.angularassignment.dao;

import java.util.List;

import com.capgemini.angularassignment.beans.ProductPrimary;


public interface ProductDAO {
	boolean updateProductInfo(ProductPrimary info);
	boolean deleteProductInfo(String productName);
	boolean createProductInfo(ProductPrimary info);
	List<ProductPrimary>  getAllRecordsProduct();
}
