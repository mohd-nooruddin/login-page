package com.varshita.login.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varshita.login.entity.LoginStatus;
import com.varshita.login.entity.User;
import com.varshita.login.repository.LogInStatusRepository;
import com.varshita.login.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LogInStatusRepository logInStatusRepository;
	
	public String validateUser(String username, String password) {
		LoginStatus loginStatus = new LoginStatus();
		loginStatus.setEmail(username);
		loginStatus.setPassword(password);
		loginStatus.setDate(LocalDateTime.now());
		loginStatus.setLoginStatus("Failed");
		
		if (validateUsername(username)) {
			Optional<User> userOptional = null;
			userOptional = userRepository.validateUserInDB(username, password);
			if (!userOptional.isEmpty()) {
				loginStatus.setLoginStatus("Successful");	
				loginStatus.setPassword("True");
				loginStatus.setReason("Success");
				saveLogInStatus(loginStatus);
				
				return "Login Successful !!!.. "+userOptional.get().getFullName();
			}else {
				loginStatus.setReason("Invalid Password");
				saveLogInStatus(loginStatus);
				
				return "Invalid Password";
			}
		}
		loginStatus.setReason("Invalid UserName");
		saveLogInStatus(loginStatus);
		return "Invalid UserName";
	}
	
	public Boolean validateUsername(String username) {
		Optional<User> userOptional = null;
		userOptional = userRepository.findByEmail(username);
		if (!userOptional.isEmpty()) {
			System.out.println("True");
			return true;
		}
		System.out.println("false");
		return false;
	}
	
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void saveLogInStatus(LoginStatus loginStatus) {
		logInStatusRepository.save(loginStatus);
	}
}
