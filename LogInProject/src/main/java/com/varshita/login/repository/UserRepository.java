package com.varshita.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.varshita.login.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Double>{
	
	@Query(value = "Select * from user where email =? and password = ?",nativeQuery = true)
	public Optional<User> validateUserInDB(String username, String password);
	
	public Optional<User> findByEmail(String email);
	
}