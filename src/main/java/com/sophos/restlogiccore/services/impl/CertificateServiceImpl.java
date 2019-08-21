package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Certificate;
import com.sophos.restlogiccore.repositories.ICertificateRepo;
import com.sophos.restlogiccore.services.ICertificateService;

@Service
public class CertificateServiceImpl implements ICertificateService {

	@Autowired
	private ICertificateRepo repo;

	@Override
	public Certificate registrar(Certificate t) {
		return repo.save(t);
	}

	@Override
	public Certificate modificar(Certificate t) {
		return repo.save(t);
	}

	@Override
	public Optional<Certificate> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Certificate> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
