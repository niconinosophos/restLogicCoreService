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
@Table(name = "iso_service", schema = "dbo")
public class IsoService {

	@Id
	@Column(name = "iso_service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isoServiceId;
	
	@Column(name = "iso_service_code", columnDefinition = "nvarchar")
	private String isoServiceCode;
	
	@Column(name = "iso_service_name", columnDefinition = "nvarchar")
	private String isoServiceName;
	
	@OneToMany(mappedBy = "isoServiceId")
	private List<SoapServiceIsoService> soapServiceIsoService;
	
	@OneToMany(mappedBy = "isoServiceId")
	private List<IsoServiceIsoMessage> isoServiceIsoMessage;
	
	public Integer getIsoServiceId() {
		return isoServiceId;
	}
	public void setIsoServiceId(Integer isoServiceId) {
		this.isoServiceId = isoServiceId;
	}
	public String getIsoServiceCode() {
		return isoServiceCode;
	}
	public void setIsoServiceCode(String isoServiceCode) {
		this.isoServiceCode = isoServiceCode;
	}
	public String getIsoServiceName() {
		return isoServiceName;
	}
	public void setIsoServiceName(String isoServiceName) {
		this.isoServiceName = isoServiceName;
	}
	
	
	
}
