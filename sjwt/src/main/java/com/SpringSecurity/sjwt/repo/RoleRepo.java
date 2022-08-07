package com.SpringSecurity.sjwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.sjwt.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

	Role findByName(String name);
}
