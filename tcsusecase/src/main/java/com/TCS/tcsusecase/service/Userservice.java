package com.TCS.tcsusecase.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.TCS.tcsusecase.entity.Usermodel;
import com.TCS.tcsusecase.repository.Repository;

@Service
public class Userservice implements UserDetailsService{
@Autowired
private Repository repository;

	


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usermodel user=repository.findByUsername(username);
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}
}
