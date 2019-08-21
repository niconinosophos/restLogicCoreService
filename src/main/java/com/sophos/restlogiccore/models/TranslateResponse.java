package com.sophos.restlogiccore.models;

public class TranslateResponse {

	private JsonStatusRs status;
	private JsonISO8583 isoMessage;

	public JsonStatusRs getStatus() {
		return status;
	}
	public void setStatus(JsonStatusRs status) {
		this.status = status;
	}
	public JsonISO8583 getIsoMessage() {
		return isoMessage;
	}
	public void setIsoMessage(JsonISO8583 isoMessage) {
		this.isoMessage = isoMessage;
	}
	
}
