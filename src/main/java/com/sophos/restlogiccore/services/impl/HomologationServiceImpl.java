package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Homologation;
import com.sophos.restlogiccore.repositories.IHomologationRepo;
import com.sophos.restlogiccore.services.IHomologationService;

@Service
public class HomologationServiceImpl implements IHomologationService {

	@Autowired
	private IHomologationRepo repo;

	@Override
	public Homologation registrar(Homologation t) {
		return repo.save(t);
	}

	@Override
	public Homologation modificar(Homologation t) {
		return repo.save(t);
	}

	@Override
	public Optional<Homologation> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Homologation> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
