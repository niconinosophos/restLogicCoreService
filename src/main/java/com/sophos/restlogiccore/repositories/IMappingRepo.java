package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Mapping;

public interface IMappingRepo extends JpaRepository<Mapping, Integer> {

}
