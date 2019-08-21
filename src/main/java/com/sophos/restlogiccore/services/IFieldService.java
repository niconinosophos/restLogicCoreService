package com.sophos.restlogiccore.services;

import com.sophos.restlogiccore.dtos.Field;

public interface IFieldService extends ICRUD<Field> {
	
	Field findByFieldIsoId(int fieldIsoId);

}
