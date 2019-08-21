package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.IsoMessage;

public interface IIsoMessageRepo extends JpaRepository<IsoMessage, Integer> {

	
}
