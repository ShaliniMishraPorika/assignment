package com.capgemini.springmvcproducts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvcproducts.beans.ProductInfoBean;
import com.capgemini.springmvcproducts.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;

	@Override
	public ProductInfoBean getProduct(int productId) {
		if (productId < 1) {
			return null;
		}
		return dao.getProduct(productId);
	}

	@Override
	public boolean addProduct(ProductInfoBean productInfoBean) {
		if (productInfoBean != null) {
			return dao.addProduct(productInfoBean);
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteProduct(int productId) {
		if (productId < 1) {
			return false;
		} else {
			return dao.deleteProduct(productId);
		}
	}

	@Override
	public boolean updateProduct(ProductInfoBean productInfoBean) {
		if (productInfoBean.getProductId() > 1 && productInfoBean != null) {
			System.out.println("kjdcn"+productInfoBean.getProductId());
			return dao.updateProduct(productInfoBean);
		}else {
		return false;
	}
	}

	@Override
	public List<ProductInfoBean> getAllProducts() {
		return dao.getAllProducts();
	}

}
