package com.jtech.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtech.userservice.model.User;
import com.jtech.userservice.service.UserService;

@RestController
@RequestMapping("api/v1/register")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user){
		User createdEntity = userService.create(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdEntity);
	}
	
	@GetMapping()
	public String greeting() {
		return "User added successfully............";
	}

	
}
