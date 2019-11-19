package com.springsocial.service;

import com.springsocial.model.UserInfo;

public interface UserService {

	UserInfo save(UserInfo userInfo);
	UserInfo findByEmail(String email);
	void update(UserInfo userInfo);

}
