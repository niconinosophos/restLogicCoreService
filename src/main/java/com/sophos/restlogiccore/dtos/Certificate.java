package com.sophos.restlogiccore.dtos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate", schema = "dbo")
public class Certificate {

	@Id
	@Column(name = "certificate_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer certificateId;
	
	@ManyToOne()
	@JoinColumn(name="client_id")
	private Client clientId;
	
	@Column(name = "certificate_serial", columnDefinition = "nvarchar")
	private String certificateSerial;
	
	@Column(name = "certificate_subject", columnDefinition = "nvarchar")
	private String certificateSubject;
	
	@Column(name = "certificate_issuer", columnDefinition = "nvarchar")
	private String certificateIssuer;
	
	@Column(name = "certificate_validity_to", columnDefinition = "date")
	private String certificateValidityTo;
	
	@Column(name = "validity_from", columnDefinition = "date")
	private String validityFrom;
	
	@Column(name = "public_key_algorithm", columnDefinition = "nvarchar")
	private String publicKeyAlgorithm;
	
	@Column(name = "signature_algorithm", columnDefinition = "nvarchar")
	private String signatureAlgorithm;
	
	public Integer getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}
	
	
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public String getCertificateSerial() {
		return certificateSerial;
	}
	public void setCertificateSerial(String certificateSerial) {
		this.certificateSerial = certificateSerial;
	}
	public String getCertificateSubject() {
		return certificateSubject;
	}
	public void setCertificateSubject(String certificateSubject) {
		this.certificateSubject = certificateSubject;
	}
	public String getCertificateIssuer() {
		return certificateIssuer;
	}
	public void setCertificateIssuer(String certificateIssuer) {
		this.certificateIssuer = certificateIssuer;
	}
	public String getCertificateValidityTo() {
		return certificateValidityTo;
	}
	public void setCertificateValidityTo(String certificateValidityTo) {
		this.certificateValidityTo = certificateValidityTo;
	}
	public String getValidityFrom() {
		return validityFrom;
	}
	public void setValidityFrom(String validityFrom) {
		this.validityFrom = validityFrom;
	}
	public String getPublicKeyAlgorithm() {
		return publicKeyAlgorithm;
	}
	public void setPublicKeyAlgorithm(String publicKeyAlgorithm) {
		this.publicKeyAlgorithm = publicKeyAlgorithm;
	}
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}
	public void setSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}
	
	
	
	
	
	
	
}
