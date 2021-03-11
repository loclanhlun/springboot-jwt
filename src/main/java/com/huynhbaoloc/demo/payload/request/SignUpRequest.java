package com.huynhbaoloc.demo.payload.request;

import java.util.HashSet;
import java.util.Set;

public class SignUpRequest {

	private String username;
	private String email;
	private String password;
	private Set<String> role = new HashSet<>();

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	
	
}
