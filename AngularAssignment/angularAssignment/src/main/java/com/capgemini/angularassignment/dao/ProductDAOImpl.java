package com.capgemini.angularassignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.angularassignment.beans.ProductPrimary;
import com.capgemini.angularassignment.exception.ProductException;

@Repository
public class ProductDAOImplement implements ProductDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean updateProductInfo(ProductPrimary info) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		ProductPrimary productPrimary = manager.find(ProductPrimary.class,info.getProductName());
		if(productPrimary != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();;
			//productPrimary.setProductName(info.getProductName());
			//productPrimary.setImageUrl(info.getImageUrl());
			productPrimary.setPrice(info.getPrice());
			//productPrimary.setProductDescription(info.getProductDescription());
			transaction.commit();
			isUpdated = true;
		}
		manager.close();
		return isUpdated;
	}

	@Override
	public boolean deleteProductInfo(String productName) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		ProductPrimary productPrimary = manager.find(ProductPrimary.class,productName);
		if(productPrimary != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(productPrimary);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean createProductInfo(ProductPrimary info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded =  false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded = true;
			System.out.println("added");
		} catch(Exception e) {
			e.printStackTrace();
			throw new ProductException("Product already exists");
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public List<ProductPrimary> getAllRecordsProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select p from ProductPrimary p";
		Query query = manager.createQuery(jpql);
		List<ProductPrimary> recordList = query.getResultList();
		manager.close();
		return recordList;
	}

}
