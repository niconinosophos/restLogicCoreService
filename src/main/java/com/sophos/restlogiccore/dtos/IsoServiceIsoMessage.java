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
@Table(name = "iso_service_iso_message", schema = "dbo")
public class IsoServiceIsoMessage {

	@Id
	@Column(name = "iso_service_iso_message_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isoServiceIsoMessageId;
	
	@ManyToOne()
	@JoinColumn(name="iso_service_id")
	private IsoService isoServiceId;
	
	@ManyToOne()
	@JoinColumn(name="iso_message_id")
	private IsoMessage isoMessageId;
	
	public Integer getIsoServiceIsoMessageId() {
		return isoServiceIsoMessageId;
	}
	public void setIsoServiceIsoMessageId(Integer isoServiceIsoMessageId) {
		this.isoServiceIsoMessageId = isoServiceIsoMessageId;
	}
	public IsoService getIsoServiceId() {
		return isoServiceId;
	}
	public void setIsoServiceId(IsoService isoServiceId) {
		this.isoServiceId = isoServiceId;
	}
	public IsoMessage getIsoMessageId() {
		return isoMessageId;
	}
	public void setIsoMessageId(IsoMessage isoMessageId) {
		this.isoMessageId = isoMessageId;
	}
	
	
	
}
