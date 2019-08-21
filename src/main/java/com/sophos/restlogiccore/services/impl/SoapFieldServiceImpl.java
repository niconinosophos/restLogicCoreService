package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.SoapField;
import com.sophos.restlogiccore.repositories.ISoapFieldRepo;
import com.sophos.restlogiccore.services.ISoapFieldService;

@Service
public class SoapFieldServiceImpl implements ISoapFieldService {

	@Autowired
	private ISoapFieldRepo repo;

	@Override
	public SoapField registrar(SoapField t) {
		return repo.save(t);
	}

	@Override
	public SoapField modificar(SoapField t) {
		return repo.save(t);
	}

	@Override
	public Optional<SoapField> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<SoapField> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
