package com.mensfashion.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

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

	// create User
	@Override
	public UserDTO creatUser(UserDTO userDto) {
		UserEntity user = modelmap.map(userDto, UserEntity.class);
		UserEntity newUser = userrepo.save(user);
		return modelmap.map(newUser, UserDTO.class);
	}

	// update user
	public UserDTO updateUser(UserDTO userdto, Integer userid) {
		UserEntity user = this.userrepo.findById(userid)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userid));
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setPhoneNum(userdto.getPhoneNum());

		UserEntity updatedUser = userrepo.save(user);
		return modelmap.map(updatedUser, UserDTO.class);
	}

	// Delete user
	public void deleteUser(Integer userId) {
		UserEntity user = userrepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
		userrepo.delete(user);
	}

	// get user by id
	public UserDTO getUserbyId(Integer userId) {
		UserEntity user = userrepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
		return modelmap.map(user, UserDTO.class);
	}

	// All Users
	public List<UserDTO> AllUsers() {
		List<UserEntity> users = userrepo.findAll();
		List<UserDTO> usersList = users.stream().map(user -> modelmap.map(users, UserDTO.class))
				.collect(Collectors.toList());
		return usersList;
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
