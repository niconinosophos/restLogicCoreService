package com.sophos.restlogiccore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sophos.restlogiccore.dtos.AppConfig;
import com.sophos.restlogiccore.services.IAppConfigService;

public class Prueba {
	
	@Autowired
	private IAppConfigService iAppConfigService;
	
	public void prueba() {
		
		List<AppConfig> list = iAppConfigService.listar();
		
		for (AppConfig appConfig : list) {
			
			System.out.println("valores: "+appConfig.getAppName());
		}
		
	}
	
	public static void main(String[] args) {
		
		Prueba prueba = new Prueba();
		prueba.prueba();
	}

}
