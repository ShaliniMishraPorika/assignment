package com.capgemini.springmvcproducts.dao;

import java.util.List;

import com.capgemini.springmvcproducts.beans.ProductInfoBean;

public interface ProductDAO {
	public ProductInfoBean getProduct(int prodcutId);
	public boolean addProduct(ProductInfoBean productInfoBean);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(ProductInfoBean productInfoBean);
	public List<ProductInfoBean> getAllProducts();
	
}
