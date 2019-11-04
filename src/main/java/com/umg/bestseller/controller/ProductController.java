package com.umg.bestseller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.umg.bestseller.ProductService;
import com.umg.bestseller.Entity.Product;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/products"})
public class ProductController {
	
	@Autowired
	ProductService product;
	
	@GetMapping
	public List<Product> listar(){
		return product.listar();
	}
	@PostMapping
	public Product add(@RequestBody Product p) {
		return product.add(p);
	}
	@GetMapping(path = {"/{id}"})
	public Product listarId(@PathVariable("id")int id) {
		return product.listarId(id);
	}
	@PutMapping(path = {"/{id}"})
	public Product Edit(@PathVariable("id")int id,@RequestBody Product p) {
		p.setId(id);
		return product.edit(p);
	}	
	@DeleteMapping(path = {"/{id}"})
	public Product delete(@PathVariable("id") int id) {
		return product.delete(id);
	}
}
