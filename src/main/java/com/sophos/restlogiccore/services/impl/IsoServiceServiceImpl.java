package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.IsoService;
import com.sophos.restlogiccore.repositories.IIsoServiceRepo;
import com.sophos.restlogiccore.services.IIsoServiceService;

@Service
public class IsoServiceServiceImpl implements IIsoServiceService {

	@Autowired
	private IIsoServiceRepo repo;

	@Override
	public IsoService registrar(IsoService t) {
		return repo.save(t);
	}

	@Override
	public IsoService modificar(IsoService t) {
		return repo.save(t);
	}

	@Override
	public Optional<IsoService> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<IsoService> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
