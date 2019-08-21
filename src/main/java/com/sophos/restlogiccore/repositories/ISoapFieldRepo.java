package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.SoapField;

public interface ISoapFieldRepo extends JpaRepository<SoapField, Integer> {

	public SoapField findById(int id);
}
