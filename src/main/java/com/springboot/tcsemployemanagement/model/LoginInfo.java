package com.springboot.tcsemployemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoginInfo")
public class LoginInfo {

	private String username;
	private String password;

	public LoginInfo() {
	}

	public LoginInfo(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Id
	@Column(name = "username", nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfo [username=" + username + ", password=" + password + "]";
	}

}
