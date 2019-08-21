package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.AppConfig;
import com.sophos.restlogiccore.repositories.IAppConfigRepo;
import com.sophos.restlogiccore.services.IAppConfigService;

@Service
public class AppConfigServiceImpl implements IAppConfigService {

	@Autowired
	private IAppConfigRepo repo;

	@Override
	public AppConfig registrar(AppConfig t) {
		return repo.save(t);
	}

	@Override
	public AppConfig modificar(AppConfig t) {
		return repo.save(t);
	}

	@Override
	public Optional<AppConfig> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<AppConfig> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
