package com.jacobvega.proyectorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacobvega.proyectorest.dto.PhoneDTO;
import com.jacobvega.proyectorest.model.Phone;
import com.jacobvega.proyectorest.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	@Override
	public List<Phone> listado() {
		return phoneRepository.findAll();
	}

	@Override
	public void agregarLista(List<PhoneDTO> phones, Long userid) {
		for (PhoneDTO phdto:phones) {
			Phone ph = new Phone();
			ph.setNumber(phdto.getNumber());
			ph.setCitycode(phdto.getCitycode());
			ph.setCountrycode(phdto.getCountrycode());
			ph.setUserid(userid);
			phoneRepository.save(ph);
		}
	}
	
}
