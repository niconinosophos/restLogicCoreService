package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.SoapServiceIsoService;
import com.sophos.restlogiccore.repositories.ISoapServiceIsoServiceRepo;
import com.sophos.restlogiccore.services.ISoapServiceIsoServiceService;

@Service
public class SoapServiceIsoServiceServiceImpl implements ISoapServiceIsoServiceService {

	@Autowired
	private ISoapServiceIsoServiceRepo repo;

	@Override
	public SoapServiceIsoService registrar(SoapServiceIsoService t) {
		return repo.save(t);
	}

	@Override
	public SoapServiceIsoService modificar(SoapServiceIsoService t) {
		return repo.save(t);
	}

	@Override
	public Optional<SoapServiceIsoService> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<SoapServiceIsoService> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
