package com.jacobvega.proyectorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacobvega.proyectorest.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone,Long> {

}
