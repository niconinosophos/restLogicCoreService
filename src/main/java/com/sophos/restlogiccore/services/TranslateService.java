package com.sophos.restlogiccore.services;

import java.util.ArrayList;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.sophos.restlogiccore.models.JsonStatusRs;
import com.sophos.restlogiccore.models.TranslateRequest;
import com.sophos.restlogiccore.models.TranslateResponse;
import com.sophos.restlogiccore.utils.Constants;
import com.sophos.restlogiccore.utils.JsonCreatorUtil;

@Service
public class TranslateService {

//	@Autowired
//	private ClientTransactionRepository clientTransactionsRepository;
//	@Autowired
//	private TransactionFieldRepository transactionFieldRepository;
	@Autowired
	private Constants constants;
	@Autowired
	private JsonCreatorUtil jsonCreatorUtil;
	@Autowired
	private SoapClientProcessorService soapClientProcessorService;
	@Autowired
	private RestClientProcessorService restClientProcessorService;
	@Autowired
	private IsoClientProcessorService isoClientProcessorService;
	
	private static final Logger logger = LogManager.getLogger(TranslateService.class);
		
//	public TranslateResponse processMessage(@Valid TranslateRequest request) {
//		// TODO Auto-generated method stub
//		
//		String idCliente = extractClientId(request);
//		String idTransaction = extractTransactionId(request);
//		
//		logger.info("TranslateService-processMessage {} {}", idCliente, idTransaction);
//		
//		ClientTransactionEntity clienteTransaction = clientTransactionsRepository.findByClientIdAndTransactionId(idCliente,idTransaction);
//		ArrayList<TransactionFieldEntity> transactionFields = transactionFieldRepository.findByTransactionId(idTransaction);
//	
//		
//		TranslateResponse response = new TranslateResponse();
//		if (clienteTransaction != null && transactionFields != null ) {
//			
//			if (clienteTransaction.getClientServiceType().equalsIgnoreCase(constants.SOAP)){
//				
//				response = soapClientProcessorService.processSoapMessage(request.getIsoMessage(),idCliente,idTransaction);
//			}
//			else if(clienteTransaction.getClientServiceType().equalsIgnoreCase(constants.REST)) {
//				response = restClientProcessorService.processRestMessage(request.getIsoMessage(),idCliente,idTransaction);
//			}
//			else if(clienteTransaction.getClientServiceType().equalsIgnoreCase(constants.ISO)){
//				response = isoClientProcessorService.processIsoMessage(request.getIsoMessage(),idCliente,idTransaction);
//			}
//			else {
//				JsonStatusRs status = jsonCreatorUtil.createStatus("Warn", HttpStatus.NOT_IMPLEMENTED, null);
//				response.setStatus(status);
//			}			
//		}
//		else {
//			JsonStatusRs status = jsonCreatorUtil.createStatus("Warn", HttpStatus.METHOD_NOT_ALLOWED, null);
//			response.setStatus(status);
//		}
//		return response;
//	}
	
	
	private String extractTransactionId(@Valid TranslateRequest request) {
		// TODO Auto-generated method stub		
		return request.getParameters().getTrn();
	}
	private String extractClientId(@Valid TranslateRequest request) {
		// TODO Auto-generated method stub
		return request.getParameters().getClient();
	}

	
}
