package com.springsocial.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2378681065655249296L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="firts_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="enable")
	private boolean enable;
	
	public UserInfo() {};
	
	public UserInfo(String firstName, String lastName, String imageUrl, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.imageUrl = imageUrl;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}	

}
