package com.login.system.domain.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long>{
	public Optional<Users> findByUserId(String userId);
	//public Optional<Users> findByUserIdAndPassword(String userId, String password);
}
