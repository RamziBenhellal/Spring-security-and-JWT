package com.SpringSecurity.sjwt;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.SpringSecurity.sjwt.model.Role;
import com.SpringSecurity.sjwt.model.User;
import com.SpringSecurity.sjwt.service.UserService;

@SpringBootApplication
public class SjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjwtApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
/*	@Bean
	CommandLineRunner run(UserService userService) {
		return args->{
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User(null,"john","1234",new ArrayList<Role>()));
			userService.saveUser(new User(null,"will","1234",new ArrayList<Role>()));
			userService.saveUser(new User(null,"jim","1234",new ArrayList<Role>()));
			userService.saveUser(new User(null,"arnold","1234",new ArrayList<Role>()));
			
			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("will", "ROLE_MANAGER");
			userService.addRoleToUser("jim", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");


		};
	}*/

}
