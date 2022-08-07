package com.SpringSecurity.sjwt.service;

import java.util.List;

import com.SpringSecurity.sjwt.model.Role;
import com.SpringSecurity.sjwt.model.User;

public interface UserService {

	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User> getUsers();
	
	
}
