package com.springsocial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import com.springsocial.model.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long>{

	UserInfo findByEmailAndEnable(String email, boolean enable);
	UserInfo findByEmail(String email);

}
