package com.productlog.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productlog.products.modal.Property;

@Service
public class ConfigServiceImpl implements IConfigService {
	@Autowired
	private BasicConfiguration configuration;

	@Override
	public List<Property> getConfigDetails() {
		// TODO Auto-generated method stub
		List<Property> list = new ArrayList<>();
		Property property = new Property("product.name", configuration.getName());
		list.add(property);
		return list;
	}

}
