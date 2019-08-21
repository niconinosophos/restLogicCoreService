package com.sophos.restlogiccore.dtos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "soap_service", schema = "dbo")
public class SoapService {

	@Id
	@Column(name = "soap_service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer soapServiceId;
	
	@ManyToOne()
	@JoinColumn(name="client_id")
	private Client clientId;
	
	@Column(name = "contract_service", columnDefinition = "xml")
	private String contractService;
	
	@Column(name = "endpoint", columnDefinition = "nvarchar")
	private String endpoint;
	
	@Column(name = "soap_version")
	private int soapVersion;
	
	@Column(name = "service_name", columnDefinition = "nvarchar")
	private String serviceName;
	
	@OneToMany(mappedBy = "soapServiceId")
	private List<SoapMessage> soapMessage;
	
	@OneToMany(mappedBy = "soapServiceId")
	private List<SoapServiceIsoService> soapServiceIsoService;
	
	public Integer getSoapServiceId() {
		return soapServiceId;
	}
	public void setSoapServiceId(Integer soapServiceId) {
		this.soapServiceId = soapServiceId;
	}
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public String getContractService() {
		return contractService;
	}
	public void setContractService(String contractService) {
		this.contractService = contractService;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public int getSoapVersion() {
		return soapVersion;
	}
	public void setSoapVersion(int soapVersion) {
		this.soapVersion = soapVersion;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	

	
	
	
	
	
}
