package com.umg.bestseller;

import java.util.List;

import com.umg.bestseller.Entity.Product;

public interface ProductService {
	List<Product> listar();
	Product listarId(int id);
	Product add(Product p);
	Product edit(Product p);
	Product delete(int id);
}
