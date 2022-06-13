package com.Jdfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jdfilmes.dsmovie.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

	
	User findByEmail(String Email);
}
