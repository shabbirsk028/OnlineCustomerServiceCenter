package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Login implements Serializable {

	private static final long serialVersionUID = -9168833388053422036L;
	@Id
	@GeneratedValue
	@NotNull
	private int userId;
	@NotNull
	private String username;
	@NotNull
	private String password;

	public Login(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;

	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
}
