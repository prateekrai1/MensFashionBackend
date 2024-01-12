package com.mensfashion.service;

import com.mensfashion.dto.ProductDTO;

public interface ProductService {
	
	public ProductDTO createProduct(ProductDTO productdto, Integer categoryId);
}
