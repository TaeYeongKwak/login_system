package com.login.system.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.system.dto.UserDTO;
import com.login.system.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/signUp")
	public String signUp(UserDTO userDTO) {
		
		return null;
	}
	
	@PostMapping("/login")
	public String login(UserDTO userDTO) {
		
		return null;
	}
	
	@PutMapping("/modify")
	public String modify() {
		
		return null;
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		
		return null;
	}
}
