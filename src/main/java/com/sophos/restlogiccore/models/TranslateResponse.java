package com.sophos.restlogiccore.models;

public class TranslateResponse {

	private JsonStatusRs status;
	private MapISO8583 isoMessage;

	public JsonStatusRs getStatus() {
		return status;
	}

	public void setStatus(JsonStatusRs status) {
		this.status = status;
	}

	public MapISO8583 getIsoMessage() {
		return isoMessage;
	}

	public void setIsoMessage(MapISO8583 isoMessage) {
		this.isoMessage = isoMessage;
	}

}
