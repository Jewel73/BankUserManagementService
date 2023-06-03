package com.jtech.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.jtech.userservice.model.User;
import com.jtech.userservice.repository.UserRepository;

@Service
public class UserService{

	@Autowired
	private UserRepository repository;
	
	
	public User create(User entity) {
        return repository.save(entity);
    }
	
	

}
