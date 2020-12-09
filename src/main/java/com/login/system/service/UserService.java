package com.login.system.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.system.domain.user.UserRepository;
import com.login.system.domain.user.Users;
import com.login.system.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Users userLogin(UserDTO userDTO) {
		Optional<Users> optionalUser = userRepository.findByUserId(userDTO.getUserId());
		Users user = null;
		if(optionalUser.isPresent()) 
			user = optionalUser.get();
		else 
			return null;
		if(passwordEncoder.matches(userDTO.getPassword(), user.getPassword()))
			return user;
		
		return null;
	}
	
	public Users userSignUp(UserDTO userDTO) {
		userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		return userRepository.save(userDTO.toEntity());
	}
	
}
