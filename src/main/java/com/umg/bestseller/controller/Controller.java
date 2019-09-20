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

import com.umg.bestseller.UserService;
import com.umg.bestseller.Entity.User;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/users"})
public class Controller {
	
	@Autowired
	UserService service;
	
	@GetMapping
	public List<User> listar(){
		return service.listar();
	}
	@PostMapping
	public User add(@RequestBody User u) {
		// TODO Auto-generated method stub
		return service.add(u);
	}
	@GetMapping(path = {"/{id}"})
	public User listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	@PutMapping(path = {"/{id}"})
	public User Edit(@PathVariable("id")int id,@RequestBody User u) {
		u.setId(id);
		return service.edit(u);
	}	
	@DeleteMapping(path = {"/{id}"})
	public User delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
