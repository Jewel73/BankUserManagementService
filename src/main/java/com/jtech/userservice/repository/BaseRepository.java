package com.jtech.userservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T , ID> extends JpaRepository<T, ID> {

	Optional<T> findByUserName(String userName);
	
}
