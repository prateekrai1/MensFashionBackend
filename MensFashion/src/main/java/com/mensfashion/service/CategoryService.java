package com.mensfashion.service;

import com.mensfashion.dto.CategoryDTO;

public interface CategoryService {
	
	public CategoryDTO createCategory(CategoryDTO categorydto);
	public CategoryDTO updateCategory(CategoryDTO categorydto, Integer categoryId);
	public void deleteCategory(Integer categoryId);
	
}
