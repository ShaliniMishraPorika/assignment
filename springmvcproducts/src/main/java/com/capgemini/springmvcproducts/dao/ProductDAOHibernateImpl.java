package com.capgemini.springmvcproducts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springmvcproducts.beans.ProductInfoBean;

@Repository
public class ProductDAOHibernateImpl implements ProductDAO {
	
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public ProductInfoBean getProduct(int empId) {
		EntityManager manager = factory.createEntityManager();
		ProductInfoBean productInfoBean = manager.find(ProductInfoBean.class, empId);
		manager.close();
		return productInfoBean;
	}

	@Override
	public boolean addProduct(ProductInfoBean productInfoBean) {
		boolean isAdded = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(productInfoBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isDeleted = false;
		try {
			transaction.begin();
			ProductInfoBean productInfoBean = manager.find(ProductInfoBean.class, productId);
			System.out.println(productInfoBean.getProductId());
			System.out.println(productInfoBean.getProductName());
			manager.remove(productInfoBean);
			transaction.commit();
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isDeleted;
	}

	@Override
	public boolean updateProduct(ProductInfoBean productInfoBean) {
		EntityManager manager = factory.createEntityManager();
		ProductInfoBean bean = manager.find(ProductInfoBean.class, productInfoBean.getProductId());
		boolean isUpdated = false;
		if (bean != null) {
			try {
				System.out.println("in update"+productInfoBean.getProductName());
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
				manager.remove(bean);
				manager.persist(productInfoBean);
				transaction.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			} finally {
				manager.close();
			}

		}
		return isUpdated;
	}

	@Override
	public List<ProductInfoBean> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "Select p from ProductInfoBean p";
		Query query = manager.createQuery(jpql);
		List<ProductInfoBean> list = query.getResultList();
		return list;

	}

}
