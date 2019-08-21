package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sophos.restlogiccore.dtos.IsoServiceIsoMessage;

public interface IIsoServiceIsoMessageRepo extends JpaRepository<IsoServiceIsoMessage, Integer> {

	
}
