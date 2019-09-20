package com.umg.bestseller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.umg.bestseller.Entity.User;

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
		return repository.save(u);
	}
	@Override
	public User listarId(int id) {
		return repository.findById(id);
	}
	@Override
	public User add(User u) {
		return repository.save(u);
	}
	@Override
	public User delete(int id) {
		User u = repository.findById(id);
		if(u != null) {
			repository.delete(u);
		}
		return u;
	}

}
