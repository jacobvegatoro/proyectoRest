package com.jacobvega.proyectorest.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private String name;
	
	private String email;
	
	private String password;

	private List<PhoneDTO> phones;

}
