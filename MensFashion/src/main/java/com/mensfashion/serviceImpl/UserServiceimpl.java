package com.mensfashion.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensfashion.dto.UserDTO;
import com.mensfashion.entities.UserEntity;
import com.mensfashion.exceptions.ResourceNotFoundException;
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
	
	//update user
	
	public UserDTO updateUser(UserDTO userdto, Integer userid) {
		UserEntity user = this.userrepo.findById(userid).orElseThrow(()-> new ResourceNotFoundException("User","id" ,userid));
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setPhoneNum(userdto.getPhoneNum());
		
		UserEntity updatedUser = userrepo.save(user);
		return modelmap.map(updatedUser, UserDTO.class);
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
