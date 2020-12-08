package com.login.system.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.login.system.domain.user.UserRepository;
import com.login.system.domain.user.Users;
import com.login.system.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserDTO userLogin(UserDTO userDTO) {
		//Optional<Users> optionalUser = userRepository.findByUserIdAndPassword(userId, password);
		return null;
	}
	
	public void userSignUp(UserDTO userDTO) {
		
	}
	
}
