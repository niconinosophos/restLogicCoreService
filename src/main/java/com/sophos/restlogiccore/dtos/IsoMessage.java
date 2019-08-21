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
@Table(name = "iso_message", schema = "dbo")
public class IsoMessage {

	@Id
	@Column(name = "iso_message_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isoMessageId;

	@ManyToOne()
	@JoinColumn(name="field_id")
	private Field fieldId;

	@Column(name = "iso_message_code", columnDefinition = "nvarchar")
	private String isoMessageCode;

	@Column(name = "iso_message_type")
	private int isoMessageType;

	@Column(name = "fixed_value", columnDefinition = "nvarchar")
	private String fixedValue;

	@Column(name = "position")
	private Integer position;

	@Column(name = "is_required", columnDefinition = "bit")
	private int isRequired;
	
	@OneToMany(mappedBy = "isoMessageId")
	private List<IsoServiceIsoMessage> isoServiceIsoMessage;

	public Integer getIsoMessageId() {
		return isoMessageId;
	}

	public void setIsoMessageId(Integer isoMessageId) {
		this.isoMessageId = isoMessageId;
	}

	public Field getFieldId() {
		return fieldId;
	}

	public void setFieldId(Field fieldId) {
		this.fieldId = fieldId;
	}

	public String getIsoMessageCode() {
		return isoMessageCode;
	}

	public void setIsoMessageCode(String isoMessageCode) {
		this.isoMessageCode = isoMessageCode;
	}

	public int getIsoMessageType() {
		return isoMessageType;
	}

	public void setIsoMessageType(int isoMessageType) {
		this.isoMessageType = isoMessageType;
	}

	public String getFixedValue() {
		return fixedValue;
	}

	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public int getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
	}

}
