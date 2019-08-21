package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.SoapMessage;
import com.sophos.restlogiccore.repositories.ISoapMessageRepo;
import com.sophos.restlogiccore.services.ISoapMessageService;

@Service
public class SoapMessageServiceImpl implements ISoapMessageService {

	@Autowired
	private ISoapMessageRepo repo;

	@Override
	public SoapMessage registrar(SoapMessage t) {
		return repo.save(t);
	}

	@Override
	public SoapMessage modificar(SoapMessage t) {
		return repo.save(t);
	}

	@Override
	public Optional<SoapMessage> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<SoapMessage> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
