package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.SoapService;

public interface ISoapServiceRepo extends JpaRepository<SoapService, Integer> {

//	public SoapService findByClientIdAndTranId(int clientId, int tranId);
	
}
