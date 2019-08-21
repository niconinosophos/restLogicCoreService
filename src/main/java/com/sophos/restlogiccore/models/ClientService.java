package com.sophos.restlogiccore.models;

public class ClientService {

	private String iso_service_id;
	private String client_id;
	private String additionalBlock;

	public String getIso_service_id() {
		return iso_service_id;
	}

	public void setIso_service_id(String iso_service_id) {
		this.iso_service_id = iso_service_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getAdditionalBlock() {
		return additionalBlock;
	}

	public void setAdditionalBlock(String additionalBlock) {
		this.additionalBlock = additionalBlock;
	}

}
