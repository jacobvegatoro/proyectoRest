package com.jacobvega.proyectorest.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.jacobvega.proyectorest.dto.TokenDTO;
import com.jacobvega.proyectorest.dto.UserDTO;
import com.jacobvega.proyectorest.model.User;

public interface UserService {

	List<User> obtener();
	
	TokenDTO crear(UserDTO usuario);
	
	UserDetails loadUserByEmail(String email);

}
