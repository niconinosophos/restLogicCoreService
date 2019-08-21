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
@Table(name = "field", schema = "dbo")
public class Field {

	@Id
	@Column(name = "field_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fieldId;

	@Column(name = "field_origin", columnDefinition = "nvarchar")
	private String fieldOrigin;

	@Column(name = "field_name", columnDefinition = "nvarchar")
	private String fieldName;

	@Column(name = "field_iso_id")
	private int fieldIsoId;

	@Column(name = "field_data_type", columnDefinition = "nvarchar")
	private String fieldDataType;

	@Column(name = "field_length")
	private int fieldLength;

	@Column(name = "field_format", columnDefinition = "nvarchar")
	private String fieldFormat;
	
	@OneToMany(mappedBy = "fieldId")
	private List<IsoMessage> isoMessage;
	
	@OneToMany(mappedBy = "fieldId")
	private List<ConcatRules> concatRules;
	
	@OneToMany(mappedBy = "fieldId")
	private List<Mapping> mapping;

	public Integer getFieldId() {
		return fieldId;
	}

	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldOrigin() {
		return fieldOrigin;
	}

	public void setFieldOrigin(String fieldOrigin) {
		this.fieldOrigin = fieldOrigin;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldIsoId() {
		return fieldIsoId;
	}

	public void setFieldIsoId(int fieldIsoId) {
		this.fieldIsoId = fieldIsoId;
	}

	public String getFieldDataType() {
		return fieldDataType;
	}

	public void setFieldDataType(String fieldDataType) {
		this.fieldDataType = fieldDataType;
	}

	public int getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(int fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getFieldFormat() {
		return fieldFormat;
	}

	public void setFieldFormat(String fieldFormat) {
		this.fieldFormat = fieldFormat;
	}

	

}
