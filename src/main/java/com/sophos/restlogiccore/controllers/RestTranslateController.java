package com.sophos.restlogiccore.controllers;

import java.util.HashMap;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.restlogiccore.dtos.Mapping;
import com.sophos.restlogiccore.models.ListenerRequest;
import com.sophos.restlogiccore.models.TranslateResponse;
import com.sophos.restlogiccore.services.IFieldService;
import com.sophos.restlogiccore.services.IMappingService;
import com.sophos.restlogiccore.services.ISoapFieldService;
import com.sophos.restlogiccore.services.TranslateService;
import com.sophos.restlogiccore.utils.JsonCreatorUtil;

@RestController
@RequestMapping("/translate")
public class RestTranslateController {

	@Autowired
	private TranslateService translateService;
	@Autowired
	private JsonCreatorUtil jsonCreatorUtil;
//	@Autowired
//	private SoapClientProcessorService soapClientProcessorService;

	@Autowired
	private IFieldService iFieldService;

	@Autowired
	private IMappingService iMappingService;

	@Autowired
	private ISoapFieldService isopFieldService;

	@GetMapping(path = "/reciveMessage")
	public ResponseEntity<Object> reciveMessage() {

		iMappingService.generateMappings(null, new HashMap<String, String>());

		return null;

	}

	@PostMapping(path = "/call", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TranslateResponse> messageRecieve(@Valid @RequestBody ListenerRequest request) {

		return new ResponseEntity<TranslateResponse>(new TranslateResponse(), HttpStatus.OK);

//		TranslateResponse response = null;
//		JsonStatusRs status;
//		try {
//			ListenerRequest listenerRequest = new ListenerRequest();
//			response = translateService.processMessage(listenerRequest);
//
////			response.setIsoMessage(translateRequest.getIsoMessage());
//			return new ResponseEntity<TranslateResponse>(response, HttpStatus.OK);
//		} catch (Exception e) {
//			e.printStackTrace();
//			response = new TranslateResponse();
//			status = jsonCreatorUtil.createStatus("Error", HttpStatus.INTERNAL_SERVER_ERROR, e);
////			response.setStatus(status);
//			return new ResponseEntity<TranslateResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}
}
