package com.mensfashion.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensfashion.dto.ProductDTO;
import com.mensfashion.entities.CategoryEntity;
import com.mensfashion.entities.ProductEntity;
import com.mensfashion.exceptions.ResourceNotFoundException;
import com.mensfashion.repositories.CategoryRepo;
import com.mensfashion.repositories.ProductRepo;
import com.mensfashion.service.ProductService;

@Service
public class ProductsServiceImpl implements ProductService {

	@Autowired
	ProductRepo productrepo;

	@Autowired
	ModelMapper modelmap;

	@Autowired
	CategoryRepo categoryrepo;


	//create Product
	@Override
	public ProductDTO createProduct(ProductDTO productdto, Integer categoryId) {
		CategoryEntity category = categoryrepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("category", "id", categoryId));

		ProductEntity product = modelmap.map(productdto, ProductEntity.class);
		product.setCategory(category);

		ProductEntity saveProduct = productrepo.save(product);
		return modelmap.map(saveProduct, ProductDTO.class);
	}
}