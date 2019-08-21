package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.repositories.IMappingRepo;
import com.sophos.restlogiccore.services.IMappingService;

@Service
public class MappingServiceImpl implements IMappingService {

	@Autowired
	private IMappingRepo repo;

	@Override
	public Mapping registrar(Mapping t) {
		return repo.save(t);
	}

	@Override
	public Mapping modificar(Mapping t) {
		return repo.save(t);
	}

	@Override
	public Optional<Mapping> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Mapping> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
