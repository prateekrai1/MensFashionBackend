package com.mensfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mensfashion.entities.CategoryEntity;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer>{

}
