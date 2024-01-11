package com.mensfashion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.mensfashion.dto.UserDTO;
import com.mensfashion.payloads.ApiResponse;
import com.mensfashion.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userservice;

	@PostMapping("/createuser")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userdto) {
		UserDTO user = userservice.creatUser(userdto);
		return new ResponseEntity<UserDTO>(user, HttpStatus.CREATED);
	}

	@PutMapping("/updateUser/{userId}")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userdto, @PathVariable() Integer userId) {
		UserDTO userupdate = userservice.updateUser(userdto, userId);
		return new ResponseEntity<UserDTO>(userupdate, HttpStatus.OK);
	}

	@DeleteMapping("deleteUser/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable() Integer userId) {
		userservice.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
	}

	@GetMapping("getUserbyId/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable() Integer userId) {
		UserDTO user = userservice.getUserbyId(userId);
		return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
	}

	public ResponseEntity<List<UserDTO>> allUsers() {
		List<UserDTO> usersList = userservice.AllUsers();
		return new ResponseEntity<List<UserDTO>>(usersList, HttpStatus.OK);
	}

}
