package com.sophos.restlogiccore.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sophos.restlogiccore.models.ListenerRequest;
import com.sophos.restlogiccore.models.TranslateResponse;

@Service
public class TranslateService {

	public TranslateResponse processMessage(@Valid ListenerRequest request) {

//		int client_id = Integer.parseInt(extractClientId(request));
//		int soap_service_id = Integer.parseInt(extractServiceId(request));
		
		//soap_message - request
		
//		System.out.println(iSoapServiceRepo.findByClientIdAndSoapServiceId(client_id, soap_service_id));

		

		return null;

//		// TODO Auto-generated method stub
//		
//		String idCliente = extractClientId(request);
//		String idTransaction = extractTransactionId(request);
//		
//		logger.info("TranslateService-processMessage {} {}", idCliente, idTransaction);
//		
////		ClientTransactionEntity clienteTransaction = clientTransactionsRepository.findByClientIdAndTransactionId(idCliente,idTransaction);
////		ArrayList<TransactionFieldEntity> transactionFields = transactionFieldRepository.findByTransactionId(idTransaction);
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
	}

	private String extractServiceId(@Valid ListenerRequest request) {
		return request.getClientService().getIso_service_id();
	}

	private String extractClientId(@Valid ListenerRequest request) {
		return request.getClientService().getClient_id();
	}

}
