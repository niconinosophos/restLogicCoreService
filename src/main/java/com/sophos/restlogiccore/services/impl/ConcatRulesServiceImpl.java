package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.ConcatRules;
import com.sophos.restlogiccore.repositories.IConcatRulesRepo;
import com.sophos.restlogiccore.services.IConcatRulesService;

@Service
public class ConcatRulesServiceImpl implements IConcatRulesService {

	@Autowired
	private IConcatRulesRepo repo;

	@Override
	public ConcatRules registrar(ConcatRules t) {
		return repo.save(t);
	}

	@Override
	public ConcatRules modificar(ConcatRules t) {
		return repo.save(t);
	}

	@Override
	public Optional<ConcatRules> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<ConcatRules> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
