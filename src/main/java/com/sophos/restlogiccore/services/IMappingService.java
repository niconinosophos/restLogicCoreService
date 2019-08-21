package com.sophos.restlogiccore.services;

import java.util.List;
import java.util.Map;

import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.dtos.SoapField;

public interface IMappingService extends ICRUD<Mapping> {

	List<Mapping> findBySoapFieldId(SoapField i);

	Map<String, String> generateMappings(List<Mapping> lmapping, Map<String, String> map);
}
