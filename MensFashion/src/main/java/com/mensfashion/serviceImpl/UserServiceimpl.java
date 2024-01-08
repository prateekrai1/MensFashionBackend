package com.mensfashion.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.mensfashion.dto.UserDTO;
import com.mensfashion.entities.UserEntity;
import com.mensfashion.repositories.UserRepo;
import com.mensfashion.service.UserService;

public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private ModelMapper modelmap;
	
	@Override
	public UserDTO creatUser(UserDTO userDto) {
		UserEntity user = modelmap.map(userDto, UserEntity.class);
		return null;
	}

}
