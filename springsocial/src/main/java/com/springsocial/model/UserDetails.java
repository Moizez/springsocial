package com.springsocial.model;

public class UserDetails {
	
	private String firtName;
	private String lastName;
	private String imageUrl;
	
	public UserDetails() {};
	
	public UserDetails(String firtName, String lastName, String imageUrl) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.imageUrl = imageUrl;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
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
	
	
	

}
