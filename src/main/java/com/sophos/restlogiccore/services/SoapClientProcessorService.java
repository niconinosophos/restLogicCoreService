lkhasjhaskljdh

//package com.sophos.restlogiccore.services;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//
//import com.sophos.restlogiccore.dtos.Mapping;
//import com.sophos.restlogiccore.models.JsonStatusRs;
//import com.sophos.restlogiccore.models.TranslateResponse;
//import com.sophos.restlogiccore.repositories.IMappingRepo;
//import com.sophos.restlogiccore.utils.JsonCreatorUtil;
//
//
//@Service
//public class SoapClientProcessorService {
//
//	private static final Logger logger = LogManager.getLogger(SoapClientProcessorService.class);
//	@Autowired
//	private JsonCreatorUtil jsonCreatorUtil;
////	@Autowired
////	private ISoapServiceRepo iClientSoapServiceRepo; 
////	@Autowired 
////	private ISoapServiceFieldRepo iSoapServiceFieldRepo;
////	@Autowired
////	private ISoapFieldRepo iClientSoapFieldRepo;
//	@Autowired 
//	private IMappingRepo iClientMappingRepo;
//	
//	public TranslateResponse processSoapMessage(Map isoMessage, String idCliente, String idTransaction) {
//		// TODO Auto-generated method stub
//		
//		logger.info("processSoapMessage {} {} {}" , isoMessage, idCliente, idTransaction);
//		// processMapping(JsonISO8583 isoMessage, int idCliente, int idTran);
//		
//		
//		TranslateResponse response= new TranslateResponse();
//		JsonStatusRs status = jsonCreatorUtil.createStatus("Procesado por SOAP", HttpStatus.OK, null);
////		response.setStatus(status);
//		return response;
//	}
//	
//	public HashMap<String, String> processMapping(int idCliente, int idTran) {
//		
//		HashMap<String, String> valores = new HashMap<String,String>();
//		
//		Mapping mapping = iClientMappingRepo.findByFieldId(5);
//		
//		int idMappedType = Integer.parseInt(mapping.getMappedType());
//		
//		System.out.println("valores de mapping: "+idMappedType);
//		
////		int idClientSoapService = iClientSoapServiceRepo.findByClientIdAndTranId(idCliente, idTran).getId();
////		
////		List<SoapServiceField> soapServiceFields = iSoapServiceFieldRepo.findByIdClientSoap(idClientSoapService);
////		
////		for (SoapServiceField listSoapServiceFields : soapServiceFields) {
////			
////			int idClientSoapField = listSoapServiceFields.getIdClientSoapField();
////			SoapField clientSoapField = iClientSoapFieldRepo.findById(idClientSoapField);
////			int idClientSoapFieldMapping = clientSoapField.getId();
////			
////			Mapping clientMapping = iClientMappingRepo.findByClientSoapFielId(idClientSoapFieldMapping);
////			
////			int idMappedType = Integer.parseInt(clientMapping.getMappedType());
////			//selectMapping(JsonISO8583 isoMessage,int idMapping, int idTran)
////			String valor = selectMapping(idMappedType,idTran);
////			valores.put(clientSoapField.getXpath(), valor);
//			
////		}
//		return valores;
//		
//	}
//	
//	
//	public String selectMapping(int idMapping, int idTran) {
//		String valor = "";
//		switch (idMapping) {
//		
//		case 1:
//			valor = processHomologation(idTran);
//			System.out.println("Homologación");
//			break;
//		
//		case 2:
//			valor = processSbstrF0(idTran);
//			break;
//			
//		case 3:
//			valor = processSbstrF1(idTran);
//			break;
//
//		case 4:
//			valor = processConcat(idTran);
//			break;
//
//		case 5:
//			valor = processFormat(idTran);
//			break;
//
//		case 6:
//			valor = processFixedLength(idTran);
//			break;
//
//		case 7:
//			valor = processPassTrough(idTran);
//			break;
//			
//		default:
//			valor = "";
//		}
//		return valor;
//	}
//	
//	public String processHomologation(int idTran) {
//		
//		return null;
//		
//	}
//	public String processSbstrF0(int idTran) {
//		return null;
//	}
//	public String processSbstrF1(int idTran) {
//		return null;
//	}
//	public String processConcat(int idTran) {
//		return null;
//	}
//	public String processFormat(int idTran) {
//		return null;
//	}
//	public String processFixedLength(int idTran) {
//		return null;
//	}
//	public String processPassTrough(int idTran) {
//		return null;
//	}
//
//}
