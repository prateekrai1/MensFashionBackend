package com.mensfashion.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensfashion.dto.CategoryDTO;
import com.mensfashion.entities.CategoryEntity;
import com.mensfashion.repositories.CategoryRepo;
import com.mensfashion.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

		@Autowired
		CategoryRepo categoryrepo;
		
		@Autowired
		ModelMapper modelmap;

		
		//create category
		@Override
		public CategoryDTO createCategory(CategoryDTO categorydto) {
			CategoryEntity category = modelmap.map(categorydto, CategoryEntity.class);
			CategoryEntity addCategory = categoryrepo.save(category);
			return modelmap.map(addCategory, CategoryDTO.class);
		}

		//update Category
		@Override
		public CategoryDTO updateCategory(CategoryDTO categorydto, Integer categoryId) {
			
			return null;
		}

		
		//Delete Category
		@Override
		public void deleteCategory(Integer categoryId) {
			// TODO Auto-generated method stub
			
		}
		
		
}
