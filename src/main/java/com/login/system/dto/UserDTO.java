package com.login.system.dto;

import com.login.system.domain.user.Users;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class UserDTO {
	
	private Long index;
	private String userId;
	private String password;
	private String userName;
	
	public Users toEntity() {
		return Users.builder()
					.index(index)
					.userId(userId)
					.password(password)
					.userName(userName)
					.build();
	}
}
