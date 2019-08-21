package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.IsoMessage;
import com.sophos.restlogiccore.repositories.IIsoMessageRepo;
import com.sophos.restlogiccore.services.IIsoMessageService;

@Service
public class IsoMessageServiceImpl implements IIsoMessageService {

	@Autowired
	private IIsoMessageRepo repo;

	@Override
	public IsoMessage registrar(IsoMessage t) {
		return repo.save(t);
	}

	@Override
	public IsoMessage modificar(IsoMessage t) {
		return repo.save(t);
	}

	@Override
	public Optional<IsoMessage> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<IsoMessage> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
