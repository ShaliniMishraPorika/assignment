package com.capgemini.springmvcproducts.service;

import java.util.List;

import com.capgemini.springmvcproducts.beans.ProductInfoBean;

public interface ProductService {

	public ProductInfoBean getProduct(int productId);
	public boolean addProduct(ProductInfoBean productInfoBean);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(ProductInfoBean productInfoBean);
	public List<ProductInfoBean> getAllProducts();
	
}
