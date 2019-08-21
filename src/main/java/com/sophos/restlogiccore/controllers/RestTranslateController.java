package com.sophos.restlogiccore.controllers;

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

import com.sophos.restlogiccore.models.ListenerRequest;
import com.sophos.restlogiccore.models.TranslateResponse;
import com.sophos.restlogiccore.services.IMappingService;
import com.sophos.restlogiccore.services.SoapClientProcessorService;
import com.sophos.restlogiccore.services.TranslateService;
import com.sophos.restlogiccore.utils.JsonCreatorUtil;

@RestController
@RequestMapping("/translate")
public class RestTranslateController {

	@Autowired
	private TranslateService translateService;
	@Autowired
	private JsonCreatorUtil jsonCreatorUtil;
	@Autowired
	private SoapClientProcessorService soapClientProcessorService;

	@Autowired
	private IMappingService iMappingService;

	@GetMapping(path = "/reciveMessage")
	public ResponseEntity<Object> reciveMessage() {
		System.out.println("reciveMessage");


		return null;

	}

	@PostMapping(path = "/call", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TranslateResponse> messageRecieve(@Valid @RequestBody ListenerRequest request) {

		return new ResponseEntity<TranslateResponse>(new TranslateResponse() , HttpStatus.OK);
		
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
