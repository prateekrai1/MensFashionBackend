package com.mensfashion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mensfashion.dto.CategoryDTO;
import com.mensfashion.payloads.ApiResponse;
import com.mensfashion.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryservice;
	
	@PostMapping("/createCategory")
	public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categorydto){
		CategoryDTO newCategory = categoryservice.createCategory(categorydto);
		return new ResponseEntity<CategoryDTO>(newCategory,HttpStatus.CREATED);
	}
	
	@PutMapping("/updateCategory/{categoryid}")
	public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO categoryDto, @PathVariable ()  Integer categoryid){
		CategoryDTO update = categoryservice.updateCategory(categoryDto, categoryid);
		return new ResponseEntity<CategoryDTO>(update,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecategory/{categoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable () Integer categoryId){
		categoryservice.deleteCategory(categoryId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category deleted successfully",true),HttpStatus.OK);
	}
	
}
