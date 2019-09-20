package com.umg.bestseller;

import java.util.List;

import com.umg.bestseller.Entity.User;

public interface UserService {
	List<User> listar();
	User listarId(int id);
	User add(User u);
	User edit(User u);
	User delete(int id);
}
