package com.sophos.restlogiccore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.dtos.SoapField;

public interface IMappingRepo extends JpaRepository<Mapping, Integer> {

	List<Mapping> findBySoapFieldId(SoapField soapFieldId);
	
}
