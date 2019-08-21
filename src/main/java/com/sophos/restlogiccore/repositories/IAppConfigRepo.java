package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.AppConfig;

public interface IAppConfigRepo extends JpaRepository<AppConfig, Integer> {

}
