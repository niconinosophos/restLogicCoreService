package com.sophos.restlogiccore.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Field;
import com.sophos.restlogiccore.repositories.IFieldRepo;
import com.sophos.restlogiccore.services.IFieldService;

@Service
public class FieldServiceImpl implements IFieldService {

	@Autowired
	private IFieldRepo repo;

	@Override
	public Field registrar(Field t) {
		return repo.save(t);
	}

	@Override
	public Field modificar(Field t) {
		return repo.save(t);
	}

	@Override
	public Optional<Field> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Field> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

}
