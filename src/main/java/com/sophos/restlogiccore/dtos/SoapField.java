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
@Table(name = "soap_field", schema = "dbo")
public class SoapField {

	@Id
	@Column(name = "soap_field_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer soapFieldId;
	
	@ManyToOne()
	@JoinColumn(name="soap_message_id")
	private SoapMessage soapMessageId;
	
	@Column(name = "use_field", columnDefinition = "nvarchar")
	private String useField;
	
	@Column(name = "xpath", columnDefinition = "nvarchar")
	private String xpath;
	
	@Column(name = "namespace", columnDefinition = "nvarchar")
	private String namespace;
	
	@Column(name = "name", columnDefinition = "nvarchar")
	private String name;
	
	@Column(name = "data_type", columnDefinition = "nvarchar")
	private String dataType;
	
	@Column(name = "length", columnDefinition = "nvarchar")
	private Integer length;
	
	@Column(name = "is_required", columnDefinition = "bit")
	private int isRequired;
	
	@Column(name = "default_value", columnDefinition = "nvarchar")
	private String defaultValue;

	@OneToMany(mappedBy = "soapFieldId")
	private List<Mapping> mapping;
	
	public Integer getSoapFieldId() {
		return soapFieldId;
	}

	public void setSoapFieldId(Integer soapFieldId) {
		this.soapFieldId = soapFieldId;
	}


	public SoapMessage getSoapMessageId() {
		return soapMessageId;
	}

	public void setSoapMessageId(SoapMessage soapMessageId) {
		this.soapMessageId = soapMessageId;
	}

	public String getUseField() {
		return useField;
	}

	public void setUseField(String useField) {
		this.useField = useField;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public int getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
		
}
