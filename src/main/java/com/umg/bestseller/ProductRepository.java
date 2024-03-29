package com.umg.bestseller;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import com.umg.bestseller.Entity.Product;

@EnableJpaRepositories(value = "ProductRepository", repositoryFactoryBeanClass = ProductServiceImp.class)
public interface ProductRepository extends Repository<Product, Integer>{
	List<Product> findAll();
	Product findById(int id);
	public Product save(Product p);
	void delete(Product p);
}
