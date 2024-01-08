package com.mensfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mensfashion.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
