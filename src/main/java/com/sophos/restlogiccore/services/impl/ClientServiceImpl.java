package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Client;
import com.sophos.restlogiccore.repositories.IClientRepo;
import com.sophos.restlogiccore.services.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientRepo repo;

	@Override
	public Client registrar(Client t) {
		return repo.save(t);
	}

	@Override
	public Client modificar(Client t) {
		return repo.save(t);
	}

	@Override
	public Optional<Client> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Client> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
