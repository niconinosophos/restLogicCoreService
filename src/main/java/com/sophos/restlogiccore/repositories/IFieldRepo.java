package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Field;

public interface IFieldRepo extends JpaRepository<Field, Integer> {

}
