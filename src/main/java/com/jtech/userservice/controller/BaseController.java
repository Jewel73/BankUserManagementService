package com.jtech.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jtech.userservice.service.BaseService;

public abstract class BaseController<T, ID> {
	
	protected abstract BaseService<T, ID> getService();
	
	@PostMapping
	public ResponseEntity<T> create(@RequestBody T user){
		T createdEntity = getService().create(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdEntity);
	}

}
