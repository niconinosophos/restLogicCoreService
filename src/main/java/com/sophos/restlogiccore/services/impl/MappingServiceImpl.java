package com.sophos.restlogiccore.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.dtos.Field;
import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.dtos.SoapField;
import com.sophos.restlogiccore.repositories.IMappingRepo;
import com.sophos.restlogiccore.services.IFieldService;
import com.sophos.restlogiccore.services.IMappingService;
import com.sophos.restlogiccore.services.ISoapFieldService;

@Service
public class MappingServiceImpl implements IMappingService {

	@Autowired
	private IMappingService iMappingService;

	@Autowired
	private IFieldService iFieldService;

	@Autowired
	private ISoapFieldService isoapFieldService;

	@Override
	public Map<String, String> generateMappings(List<Mapping> lmapping, Map<String, String> map) {

		map.put("4", "1000");
		map.put("11", "097qr");

		SoapField soapField = new SoapField();
		soapField.setSoapFieldId(1);

		lmapping = iMappingService.findBySoapFieldId(soapField);
		Map<String, String> soapMap = new HashMap<String, String>();

		for (Mapping mapping : lmapping) {

			Field field = mapping.getFieldId();
			if (field != null) {
				String value = applyProcess(mapping.getMappedType(), map.get(Integer.toString(field.getFieldIsoId())),
						mapping);
				soapMap.put(mapping.getSoapFieldId().getXpath(), value);
			}

		}

		for (Map.Entry<String, String> entry : soapMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		return null;
	}

	private String applyProcess(String type, String value, Mapping mapping) {

		int mappedType = Integer.parseInt(type);
		String valor = "";
		switch (mappedType) {

		case 1:
			break;

		case 2:
			valor = processPassTrough(value);
			break;

		case 3:
//			valor = processFixedLength();
			break;

		case 4:
//			valor = processFormat();
			break;

		case 5:
//			valor = processFixedValue();
			break;

		case 6:
//			valor = processSubstring();
			break;

		case 7:
//			valor = processHomologation();
			break;

		case 8:
//			valor = processConcatenate();
			break;

		default:
			valor = "";
		}
		return valor;

	}

	private String processPassTrough(String value) {
		return value;
	}

	@Autowired
	private IMappingRepo repo;

	@Override
	public Mapping registrar(Mapping t) {

		return repo.save(t);
	}

	@Override
	public Mapping modificar(Mapping t) {
		return repo.save(t);
	}

	@Override
	public Optional<Mapping> consultar(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Mapping> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public List<Mapping> findBySoapFieldId(SoapField i) {
		return repo.findBySoapFieldId(i);
	}

}
