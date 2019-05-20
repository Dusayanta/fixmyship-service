package com.fixmyship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigurationController {

	@Autowired
	Configuration config;
	
	@GetMapping("/test")
	public TestConfiguration retrieveValuesFromConfiguration() {
		return new TestConfiguration(config.getMaximum(), config.getMinimum());
	}
}
