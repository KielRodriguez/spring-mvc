package com.krod.mvc.view.controllers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.krod.mvc.view.controllers.PrincipalController;

@Configuration
public class ViewControllerConfig {

	@Bean
	public PrincipalController controller(){
		return new PrincipalController();
	}
}
