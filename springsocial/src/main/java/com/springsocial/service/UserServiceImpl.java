package com.springsocial.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.springsocial.model.UserInfo;
import com.springsocial.repository.UserRepository;
import com.springsocial.util.PasswordUtil;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserInfo save(UserInfo userInfo) {
		userInfo.setEnable(true);
		userInfo.setRole("ADMIN");
		if(StringUtils.hasText(userInfo.getPassword())) {
			userInfo.setPassword(PasswordUtil.getEncodePassword(userInfo.getPassword()));
		}
		return userRepository.save(userInfo);
	}

}
