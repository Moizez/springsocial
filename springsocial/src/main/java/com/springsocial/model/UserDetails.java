package com.springsocial.model;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String email;
	
	public UserDetails() {};
	
	public UserDetails(String firstName, String lastName, String imageUrl, String email) {
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
	
	
	

}
