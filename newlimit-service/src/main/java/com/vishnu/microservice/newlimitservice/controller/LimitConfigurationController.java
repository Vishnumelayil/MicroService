package com.vishnu.microservice.newlimitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.microservice.config.MyAppProperties;
import com.vishnu.microservice.newlimitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Value("${limit-service.minimum}")
	int minumum;
	@Value("${limit-service.maximum}")
	int maximum;
	
	@Autowired
	private MyAppProperties properties;

	@GetMapping("/limits")
	public LimitConfiguration getLimitValue() {
		System.out.println(properties.getMinimum());
		return new LimitConfiguration(properties.getMinimum(),properties.getMaximum());
	}

}
