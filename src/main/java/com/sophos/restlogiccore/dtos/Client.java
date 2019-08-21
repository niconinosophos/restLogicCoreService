package com.sophos.restlogiccore.dtos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client", schema = "dbo")
public class Client {

	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clientId;

	@Column(name = "client_fiid")
	private int clientFiid;

	@Column(name = "client_name", columnDefinition = "nvarchar")
	private String clientName;
	
	@OneToMany(mappedBy = "clientId")
	private List<Certificate> certificate;
	
	@OneToMany(mappedBy = "clientId")
	private List<Homologation> homologation;
	
	@OneToMany(mappedBy = "clientId")
	private List<SoapService> soapService;
	
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public int getClientFiid() {
		return clientFiid;
	}

	public void setClientFiid(int clientFiid) {
		this.clientFiid = clientFiid;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



}
