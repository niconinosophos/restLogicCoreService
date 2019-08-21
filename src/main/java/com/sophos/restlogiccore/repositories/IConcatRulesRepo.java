package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.ConcatRules;

public interface IConcatRulesRepo extends JpaRepository<ConcatRules, Integer> {

	
}
