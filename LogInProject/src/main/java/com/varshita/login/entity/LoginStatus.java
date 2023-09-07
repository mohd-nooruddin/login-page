package com.varshita.login.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double id;
	private String email;
	private String loginStatus;
	private String reason;
	private LocalDateTime date;
	private String password;
	
	public LoginStatus() {
		super();
	}

	public LoginStatus(Double id, String email, String loginStatus, String reason, LocalDateTime date,
			String password) {
		super();
		this.id = id;
		this.email = email;
		this.loginStatus = loginStatus;
		this.reason = reason;
		this.date = date;
		this.password = password;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginStatus [id=" + id + ", email=" + email + ", loginStatus=" + loginStatus + ", reason=" + reason
				+ ", date=" + date + ", password=" + password + "]";
	}
	
}
