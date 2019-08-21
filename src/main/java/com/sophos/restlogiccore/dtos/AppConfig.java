package com.sophos.restlogiccore.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_config", schema = "dbo")
public class AppConfig {

	@Id
	@Column(name = "id_app_config")
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	private Integer idAppConfig;

	@Column(name = "app_id")
	private int appId;

	@Column(name = "app_name", columnDefinition = "nvarchar")
	private String appName;

	@Column(name = "config_type", columnDefinition = "nvarchar")
	private String configType;

	@Column(name = "parameter", columnDefinition = "nvarchar")
	private String parameter;
	
	@Column(name = "value", columnDefinition = "nvarchar")
	private String value;

	public Integer getIdAppConfig() {
		return idAppConfig;
	}

	public void setIdAppConfig(Integer idAppConfig) {
		this.idAppConfig = idAppConfig;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	



}
