package com.mensfashion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mensfashion.dto.UserDTO;
import com.mensfashion.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/createuser")
	public ResponseEntity<UserDTO> createUser(@RequestBody  UserDTO userdto){
		UserDTO user = userservice.creatUser(userdto);
		return new ResponseEntity<UserDTO>(user, HttpStatus.CREATED);
		
	}
}
