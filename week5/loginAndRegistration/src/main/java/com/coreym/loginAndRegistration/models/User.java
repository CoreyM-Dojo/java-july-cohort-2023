package com.coreym.loginAndRegistration.models;

import java.util.Date;

import com.coreym.loginAndRegistration.validators.FieldMatch;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


// This class is used to inherit all required properties and methods for an Enity in Spring
@Entity
@Table(name="users")
//@FieldMatch(field="confirm", fieldMatch="password", message="Password must match Confirm Password")
public class User extends Foo{
	
	
	@NotBlank(message="username is required")
	@Size(min=2, max=200)
	private String username;
	
	@NotBlank(message="Email is required")
	@Email(message="Incorrect email format. Try 'example@email.com'")
	private String email;
	
	@Size(min=8, max=200)
	private String password;
	
	@NotBlank(message="Confirm password is required")
	@Transient
	private String confirm;
	
	
	
	public User() {
		
	}

	public User(Long id, @Size(min = 2, max = 200) String username, @Email String email,
			@Size(min = 8, max = 200) String password, String confirm, Date createdAt, Date updatedAt) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	
}
