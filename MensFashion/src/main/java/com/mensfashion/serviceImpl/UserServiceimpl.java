package com.mensfashion.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensfashion.dto.UserDTO;
import com.mensfashion.entities.UserEntity;
import com.mensfashion.repositories.UserRepo;
import com.mensfashion.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private ModelMapper modelmap;
	
	
	//create User
	@Override
	public UserDTO creatUser(UserDTO userDto) {
		UserEntity user = modelmap.map(userDto, UserEntity.class);
		UserEntity newUser = userrepo.save(user);
		return modelmap.map(newUser, UserDTO.class);
	}

	public UserEntity dtoToUser(UserDTO userdto) {

		UserEntity user = modelmap.map(userdto, UserEntity.class);
		return user;
	}

	public UserDTO userToDto(UserEntity user) {

		UserDTO userDto = modelmap.map(user, UserDTO.class);
		return userDto;
	}
}
