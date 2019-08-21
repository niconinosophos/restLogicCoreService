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
@Table(name = "soap_message", schema = "dbo")
public class SoapMessage {
	
	@Id
	@Column(name = "soap_message_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer soapMessageId;
	
	@ManyToOne()
	@JoinColumn(name="soap_service_id")
	private SoapService soapServiceId;
	
	@Column(name = "operation", columnDefinition = "nvarchar")
	private String operation;
	
	@Column(name = "message_type")
	private int messageType;
	
	@Column(name = "soap_action", columnDefinition = "nvarchar")
	private String soapAction;
	
	@Column(name = "skeleton", columnDefinition = "xml")
	private String skeleton;
	
	@OneToMany(mappedBy = "soapMessageId")
	private List<SoapField> soapField;
	
	public Integer getSoapMessageId() {
		return soapMessageId;
	}
	public void setSoapMessageId(Integer soapMessageId) {
		this.soapMessageId = soapMessageId;
	}
	public SoapService getSoapServiceId() {
		return soapServiceId;
	}
	public void setSoapServiceId(SoapService soapServiceId) {
		this.soapServiceId = soapServiceId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getMessageType() {
		return messageType;
	}
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
	public String getSoapAction() {
		return soapAction;
	}
	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}
	public String getSkeleton() {
		return skeleton;
	}
	public void setSkeleton(String skeleton) {
		this.skeleton = skeleton;
	}	
	
	

}
