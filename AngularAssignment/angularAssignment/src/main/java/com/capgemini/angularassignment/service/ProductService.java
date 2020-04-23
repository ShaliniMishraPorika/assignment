package com.capgemini.angularassignment.service;

import java.util.List;

import com.capgemini.angularassignment.beans.ProductPrimary;

public interface ProductService {
	boolean updateProductInfo(ProductPrimary info);
	boolean deleteProductInfo(String productName);
	boolean createProductInfo(ProductPrimary info);
	List<ProductPrimary>  getAllRecordsProduct();

}
