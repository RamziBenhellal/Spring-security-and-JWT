package com.SpringSecurity.sjwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.sjwt.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
