package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Client;

public interface IClientRepo extends JpaRepository<Client, Integer> {

}
