package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.SoapService;
import com.sophos.restlogiccore.repositories.ISoapServiceRepo;
import com.sophos.restlogiccore.services.ISoapServiceService;

@Service
public class SoapServiceServiceImpl implements ISoapServiceService {

	@Autowired
	private ISoapServiceRepo repo;

	@Override
	public SoapService registrar(SoapService t) {
		return repo.save(t);
	}

	@Override
	public SoapService modificar(SoapService t) {
		return repo.save(t);
	}

	@Override
	public Optional<SoapService> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<SoapService> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
