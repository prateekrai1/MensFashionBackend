package com.mensfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mensfashion.entities.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
