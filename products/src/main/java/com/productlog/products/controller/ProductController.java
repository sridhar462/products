package com.productlog.products.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productlog.products.modal.Product;
import com.productlog.products.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@GetMapping("/api/getProductDetails")
	public List<Product> getProductDetails() {
		return productService.getProductDetails();
	}
}
