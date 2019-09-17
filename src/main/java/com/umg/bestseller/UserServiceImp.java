package com.umg.bestseller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> listar() {
		return repository.findAll();
	}
	@Override
	public User edit(User u) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User add(User u) {
		return repository.save(u);
	}
	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
