package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sophos.restlogiccore.dtos.SoapMessage;

public interface ISoapMessageRepo extends JpaRepository<SoapMessage, Integer> {

	
}
