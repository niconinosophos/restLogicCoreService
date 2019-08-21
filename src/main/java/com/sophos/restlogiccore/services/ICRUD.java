package com.sophos.restlogiccore.services;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {

	T registrar(T t);

	T modificar(T t);

	Optional<T> consultar(Integer id);

	List<T> listar();

	void eliminar(Integer id);

}
