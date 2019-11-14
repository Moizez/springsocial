package com.springsocial.service;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.*;

import com.springsocial.model.UserInfo;
import com.springsocial.repository.UserRepository;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserInfo user = userRepository.findByEmailAndEnable(email, true);
		if(user == null) {
			throw new UsernameNotFoundException("Digite um e-mail válido" + email);
		}
		
		GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + user.getRole());
		UserDetails userDetails = (UserDetails)new User(user.getEmail(), user.getPassword(), Arrays.asList(authority));
		return userDetails;
	}

}
