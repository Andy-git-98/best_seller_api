package com.umg.bestseller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.umg.bestseller.Entity.Product;

@Component
public class ProductServiceImp implements ProductService{
	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> listar() {
		return repository.findAll();
	}
	@Override
	public Product edit(Product p) {
		return repository.save(p);
	}
	@Override
	public Product listarId(int id) {
		return repository.findById(id);
	}
	@Override
	public Product add(Product p) {
		return repository.save(p);
	}
	@Override
	public Product delete(int id) {
		Product p = repository.findById(id);
		if(p != null) {
			repository.delete(p);
		}
		return p;
	}
}
