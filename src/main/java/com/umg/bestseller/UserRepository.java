package com.umg.bestseller;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import java.util.List;

@EnableJpaRepositories(value = "UserRepository", repositoryFactoryBeanClass = UserServiceImp.class)
public interface UserRepository extends Repository<User, Integer>{
	List<User> findAll();
	User findById(int id);
	public User save(User u);
	void delete(User u);
}
