package com.SpringSecurity.sjwt.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="user", uniqueConstraints = {@UniqueConstraint(name ="UK_User_email", columnNames = "username" ) })
@Entity(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", updatable = false)
	private Integer id;
	
	@Column(name ="username", nullable = false, length = 100)
	private String username;
	
	@Column(name="password", nullable = false, length = 100)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles = new ArrayList<>(); 

}
