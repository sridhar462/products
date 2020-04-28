package com.productlog.products.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.productlog.products.modal.Product;

@Service
public class ProductServiceImpl implements IProductService{
	static List<Product> getProductDetails;
	static {
		getProductDetails = new ArrayList<>();
		Product marieGold = new Product("BRI01","Marie Gold","Snacks", new BigDecimal(10.0),"ITC");
		Product fiftyfifty = new Product("BRI02","50 50","Snacks", new BigDecimal(10.0),"ITC");
		getProductDetails.add(marieGold);
		getProductDetails.add(fiftyfifty);
		
	}

	@Override
	public List<Product> getProductDetails() {
		// TODO Auto-generated method stub
		return getProductDetails;
	}

}
