package com.mensfashion.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
	
	private String name;
	private String email;
	private String password;
	private long phoneNum;
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", email=" + email + ", password=" + password + ", phoneNum=" + phoneNum + "]";
	}
	
	
}
