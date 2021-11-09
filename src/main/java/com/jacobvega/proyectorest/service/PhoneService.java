package com.jacobvega.proyectorest.service;

import java.util.List;

import com.jacobvega.proyectorest.dto.PhoneDTO;
import com.jacobvega.proyectorest.model.Phone;

public interface PhoneService {

	List<Phone> listado();
	void agregarLista(List<PhoneDTO> phones, Long userid);

}
