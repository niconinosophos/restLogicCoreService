package com.sophos.restlogiccore.utils;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.sophos.restlogiccore.models.JsonStatusRs;

@Component
public class JsonCreatorUtil {

	public JsonStatusRs createStatus(String severity, HttpStatus statusCode, Exception e) {
		JsonStatusRs status = new JsonStatusRs();
		status.setSeverity(severity);
		status.setStatusCode(String.valueOf(statusCode.value()));
		status.setStatusDesc(e != null ? e.getMessage() : "Transaccion Exitosa");
		return status;
	}
}
