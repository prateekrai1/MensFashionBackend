package com.mensfashion.service;

import java.util.List;

import com.mensfashion.dto.UserDTO;

public interface UserService {
	
	public UserDTO creatUser(UserDTO userDto);
	public UserDTO updateUser(UserDTO userdto, Integer userId);
	public void deleteUser(Integer userId);
	public UserDTO getUserbyId(Integer userId);
	public List<UserDTO> AllUsers();
}
