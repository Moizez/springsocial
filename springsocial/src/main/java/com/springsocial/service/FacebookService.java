package com.springsocial.service;

import org.springframework.social.facebook.api.User;

public interface FacebookService {

	String facebookLogin();

	String getFacebookAccessToken(String code);

	User getFacebookProfile(String accessToken);

}
