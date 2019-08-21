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
@Table(name = "soap_service_iso_service", schema = "dbo")
public class SoapServiceIsoService {

	@Id
	@Column(name = "soap_service_iso_service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer soapServiceIsoServiceId;

	@ManyToOne()
	@JoinColumn(name="soap_service_id")
	private SoapService soapServiceId;
	
	@ManyToOne()
	@JoinColumn(name="iso_service_id")
	private IsoService isoServiceId;
	
	@Column(name = "is_validate_atalla", columnDefinition = "bit")
	private int isValidateAtalla;
	
	public Integer getSoapServiceIsoServiceId() {
		return soapServiceIsoServiceId;
	}
	public void setSoapServiceIsoServiceId(Integer soapServiceIsoServiceId) {
		this.soapServiceIsoServiceId = soapServiceIsoServiceId;
	}
	public SoapService getSoapServiceId() {
		return soapServiceId;
	}
	public void setSoapServiceId(SoapService soapServiceId) {
		this.soapServiceId = soapServiceId;
	}
	public IsoService getIsoServiceId() {
		return isoServiceId;
	}
	public void setIsoServiceId(IsoService isoServiceId) {
		this.isoServiceId = isoServiceId;
	}
	public int getIsValidateAtalla() {
		return isValidateAtalla;
	}
	public void setIsValidateAtalla(int isValidateAtalla) {
		this.isValidateAtalla = isValidateAtalla;
	}
	
	
	
	
}
