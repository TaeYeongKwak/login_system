package com.login.system.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.login.system.dto.UserDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long index;
	@Column(unique = true)
	private String userId;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String userName;
	
	public UserDTO toDTO() {
		return UserDTO.builder()
					.index(index)
					.userName(userName)
					.build();
	}
	
}
