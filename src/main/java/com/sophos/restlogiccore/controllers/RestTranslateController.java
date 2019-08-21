package com.sophos.restlogiccore.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.dtos.SoapService;
import com.sophos.restlogiccore.models.JsonStatusRs;
import com.sophos.restlogiccore.models.TranslateRequest;
import com.sophos.restlogiccore.models.TranslateResponse;
import com.sophos.restlogiccore.services.IMappingService;
import com.sophos.restlogiccore.services.ISoapServiceService;
import com.sophos.restlogiccore.services.SoapClientProcessorService;
import com.sophos.restlogiccore.utils.JsonCreatorUtil;

@RestController
@RequestMapping("/translate")
public class RestTranslateController {

	//@Autowired
	//private TranslateService translateService;
	@Autowired
	private JsonCreatorUtil jsonCreatorUtil;
	@Autowired
	private SoapClientProcessorService soapClientProcessorService;

	@Autowired
	private IMappingService service2;

	@GetMapping
	public ResponseEntity<Object> reciveMessage() {

		List<Mapping> list = service2.listar();
		for (Mapping appConfig : list) {
			System.out.println("objeto: "+appConfig.getSoapFieldId().getName());
			
		}
		return null;

	}

	@PostMapping(path = "/call")
	public ResponseEntity<TranslateResponse> messageRecieve(@Valid @RequestBody TranslateRequest request) {
		TranslateResponse response = null;
		JsonStatusRs status;
		try {
//			response = translateService.processMessage(request);
			response.setIsoMessage(request.getIsoMessage());
			return new ResponseEntity<TranslateResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			response = new TranslateResponse();
			status = jsonCreatorUtil.createStatus("Error", HttpStatus.INTERNAL_SERVER_ERROR, e);
			response.setStatus(status);
			return new ResponseEntity<TranslateResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
