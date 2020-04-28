package com.productlog.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productlog.products.modal.Property;
import com.productlog.products.service.IConfigService;

@RestController
public class ConfigController {
	
	@Autowired
	IConfigService configService;
	
	@GetMapping("/api/getConfigDetails")
	public List<Property> getConfigDetails() {
		return configService.getConfigDetails();
	}
}
