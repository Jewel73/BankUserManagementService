package com.jtech.userservice.service;

import org.springframework.data.repository.CrudRepository;


public abstract class BaseService<T, ID> {

	protected abstract CrudRepository<T, ID> getRepository();

    public T create(T entity) {
        return getRepository().save(entity);
    }
	
}
