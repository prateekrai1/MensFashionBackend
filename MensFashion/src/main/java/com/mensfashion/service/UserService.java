package com.mensfashion.service;

import com.mensfashion.dto.UserDTO;

public interface UserService {
	
	public UserDTO creatUser(UserDTO userDto);
	public UserDTO updateUser(UserDTO userdto, Integer userId);
}
