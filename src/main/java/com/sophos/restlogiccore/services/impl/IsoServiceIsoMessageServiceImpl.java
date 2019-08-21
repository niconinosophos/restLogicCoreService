package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.IsoServiceIsoMessage;
import com.sophos.restlogiccore.repositories.IIsoServiceIsoMessageRepo;
import com.sophos.restlogiccore.services.IIsoServiceIsoMessageService;

@Service
public class IsoServiceIsoMessageServiceImpl implements IIsoServiceIsoMessageService {

	@Autowired
	private IIsoServiceIsoMessageRepo repo;

	@Override
	public IsoServiceIsoMessage registrar(IsoServiceIsoMessage t) {
		return repo.save(t);
	}

	@Override
	public IsoServiceIsoMessage modificar(IsoServiceIsoMessage t) {
		return repo.save(t);
	}

	@Override
	public Optional<IsoServiceIsoMessage> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<IsoServiceIsoMessage> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
