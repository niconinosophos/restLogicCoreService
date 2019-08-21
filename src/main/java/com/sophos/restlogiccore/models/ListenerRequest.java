package com.sophos.restlogiccore.models;

public class ListenerRequest {

	private ClientService clientService;
	private MapISO8583 mapISO8583;

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public MapISO8583 getMapISO8583() {
		return mapISO8583;
	}

	public void setMapISO8583(MapISO8583 mapISO8583) {
		this.mapISO8583 = mapISO8583;
	}

}
