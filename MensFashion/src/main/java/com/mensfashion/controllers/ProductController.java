package com.mensfashion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mensfashion.dto.ProductDTO;
import com.mensfashion.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@PostMapping("/{categoryId}/createProduct")
	public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productdto, @PathVariable () Integer categoryId){
		ProductDTO createProduct = productservice.createProduct(productdto, categoryId);
		return new ResponseEntity<ProductDTO>(createProduct, HttpStatus.CREATED);
    }
}