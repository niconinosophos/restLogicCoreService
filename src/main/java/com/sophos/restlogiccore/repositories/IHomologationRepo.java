package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Homologation;

public interface IHomologationRepo extends JpaRepository<Homologation, Integer> {

}
