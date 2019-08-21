package com.sophos.restlogiccore.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "concat_rules", schema = "dbo")
public class ConcatRules {
	
	@Id
	@Column(name = "concat_rules_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer concatRulesId;
	
	@Column(name = "message_type")
	private int messageType;
	
	@Column(name = "client_soap_field_id")
	private int clientSoapFieldId;
	
	@ManyToOne()
	@JoinColumn(name="field_id")
	private Field fieldId;
	
	@ManyToOne()
	@JoinColumn(name="client_mapping_id")
	private Mapping clientMappingId;
	
	@Column(name = "fixed_value", columnDefinition = "nvarchar")
	private String fixedValue;
	
	public Integer getConcatRulesId() {
		return concatRulesId;
	}
	public void setConcatRulesId(Integer concatRulesId) {
		this.concatRulesId = concatRulesId;
	}
	public int getMessageType() {
		return messageType;
	}
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
	public int getClientSoapFieldId() {
		return clientSoapFieldId;
	}
	public void setClientSoapFieldId(int clientSoapFieldId) {
		this.clientSoapFieldId = clientSoapFieldId;
	}
	public Field getFieldId() {
		return fieldId;
	}
	public void setFieldId(Field fieldId) {
		this.fieldId = fieldId;
	}
	public Mapping getClientMappingId() {
		return clientMappingId;
	}
	public void setClientMappingId(Mapping clientMappingId) {
		this.clientMappingId = clientMappingId;
	}
	public String getFixedValue() {
		return fixedValue;
	}
	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

}
