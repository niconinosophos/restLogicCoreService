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
@Table(name = "mapping", schema = "dbo")
public class Mapping {

	@Id
	@Column(name = "mapping_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mappingId;

	@ManyToOne()
	@JoinColumn(name="field_id")
	private Field fieldId;

	@ManyToOne()
	@JoinColumn(name="soap_field_id")
	private SoapField soapFieldId;

	@Column(name = "rest_field_id")
	private Integer restFieldId;

	@Column(name = "tcp_iso_field_id")
	private Integer tcpIsoFieldId;

	@ManyToOne()
	@JoinColumn(name="homologation_id")
	private Homologation homologationId;

	@Column(name = "mapped_type", columnDefinition = "nvarchar")
	private String mappedType;

	@Column(name = "fixed_length")
	private Integer fixedLength;

	@Column(name = "format_origin", columnDefinition = "nvarchar")
	private String formatOrigin;

	@Column(name = "format_destiny", columnDefinition = "nvarchar")
	private String formatDestiny;

	@Column(name = "alingn")
	private Integer alingn;

	@Column(name = "fill_char", columnDefinition = "nchar")
	private String fillChar;

	@Column(name = "fixed_value", columnDefinition = "nvarchar")
	private String fixedValue;

	@Column(name = "sbstr_f0")
	private Integer sbstrF0;

	@Column(name = "sbstr_f1")
	private Integer sbstrF1;
	
	@OneToMany(mappedBy = "clientMappingId")
	private List<ConcatRules> concatRules;

	public Integer getMappingId() {
		return mappingId;
	}

	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
	}

	public Field getFieldId() {
		return fieldId;
	}

	public void setFieldId(Field fieldId) {
		this.fieldId = fieldId;
	}

	public SoapField getSoapFieldId() {
		return soapFieldId;
	}

	public void setSoapFieldId(SoapField soapFieldId) {
		this.soapFieldId = soapFieldId;
	}

	public Integer getRestFieldId() {
		return restFieldId;
	}

	public void setRestFieldId(Integer restFieldId) {
		this.restFieldId = restFieldId;
	}

	public Integer getTcpIsoFieldId() {
		return tcpIsoFieldId;
	}

	public void setTcpIsoFieldId(Integer tcpIsoFieldId) {
		this.tcpIsoFieldId = tcpIsoFieldId;
	}

	public Homologation getHomologationId() {
		return homologationId;
	}

	public void setHomologationId(Homologation homologationId) {
		this.homologationId = homologationId;
	}

	public String getMappedType() {
		return mappedType;
	}

	public void setMappedType(String mappedType) {
		this.mappedType = mappedType;
	}

	public Integer getFixedLength() {
		return fixedLength;
	}

	public void setFixedLength(Integer fixedLength) {
		this.fixedLength = fixedLength;
	}

	public String getFormatOrigin() {
		return formatOrigin;
	}

	public void setFormatOrigin(String formatOrigin) {
		this.formatOrigin = formatOrigin;
	}

	public String getFormatDestiny() {
		return formatDestiny;
	}

	public void setFormatDestiny(String formatDestiny) {
		this.formatDestiny = formatDestiny;
	}

	public Integer getAlingn() {
		return alingn;
	}

	public void setAlingn(Integer alingn) {
		this.alingn = alingn;
	}

	public String getFillChar() {
		return fillChar;
	}

	public void setFillChar(String fillChar) {
		this.fillChar = fillChar;
	}

	public String getFixedValue() {
		return fixedValue;
	}

	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public Integer getSbstrF0() {
		return sbstrF0;
	}

	public void setSbstrF0(Integer sbstrF0) {
		this.sbstrF0 = sbstrF0;
	}

	public Integer getSbstrF1() {
		return sbstrF1;
	}

	public void setSbstrF1(Integer sbstrF1) {
		this.sbstrF1 = sbstrF1;
	}


	
	

}
