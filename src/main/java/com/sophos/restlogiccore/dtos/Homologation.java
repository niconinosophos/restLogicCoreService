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
@Table(name = "homologation", schema = "dbo")
public class Homologation {
	
	@Id
	@Column(name = "homologation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer homologationId;	
	
	@ManyToOne()
	@JoinColumn(name="client_id")
	private Client clientId;
	
	@Column(name = "homologation_name", columnDefinition = "nvarchar")
	private String homologationName;
	
	@Column(name = "expected_value", columnDefinition = "nvarchar")
	private String expectedValue;
	
	@Column(name = "replaced_value", columnDefinition = "nvarchar")
	private String replacedValue;
	
	@Column(name = "default_value", columnDefinition = "nvarchar")
	private String defaultValue;
	
	@OneToMany(mappedBy = "soapServiceId")
	private List<SoapMessage> soapMessage;
	
	@OneToMany(mappedBy = "homologationId")
	private List<Mapping> mapping;
	
	public Integer getHomologationId() {
		return homologationId;
	}
	public void setHomologationId(Integer homologationId) {
		this.homologationId = homologationId;
	}
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public String getHomologationName() {
		return homologationName;
	}
	public void setHomologationName(String homologationName) {
		this.homologationName = homologationName;
	}
	public String getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	public String getReplacedValue() {
		return replacedValue;
	}
	public void setReplacedValue(String replacedValue) {
		this.replacedValue = replacedValue;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}	
	
}
