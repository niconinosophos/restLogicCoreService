package com.sophos.restlogiccore.models;

public class TranslateRequest {

	private JsonRequest parameters;
	private JsonISO8583 isoMessage;
	
	public JsonRequest getParameters() {
		return parameters;
	}
	public void setParameters(JsonRequest parameters) {
		this.parameters = parameters;
	}
	public JsonISO8583 getIsoMessage() {
		return isoMessage;
	}
	public void setIsoMessage(JsonISO8583 isoMessage) {
		this.isoMessage = isoMessage;
	}
	
	
}
