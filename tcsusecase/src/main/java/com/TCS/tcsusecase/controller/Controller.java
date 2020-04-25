package com.TCS.tcsusecase.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;


import com.TCS.tcsusecase.entity.Authentication;
import com.TCS.tcsusecase.entity.Loginresponse;



import com.TCS.tcsusecase.entity.Usermodel;
import com.TCS.tcsusecase.repository.Repository;


@RestController
@RequestMapping("/bank/user")
public class Controller {




@Autowired
private RestTemplate rest;
private String session;
@Autowired
private Repository repository;
@Autowired
private AuthenticationManager authenticationmanager;
private Loginresponse loginresponse;
private EntityManager entity;

private List<Integer> i=new ArrayList<Integer>();
private int j=0;
@Autowired
public Controller(EntityManager entity) {
	this.entity=entity;
}

@PostMapping("/authentication")
public Loginresponse generateToken(@RequestBody Authentication authentication)  {
	try {
		j++;
		System.out.println(authentication.getUsername());
		System.out.println(authentication.getPassword());
		authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(authentication.getUsername(), authentication.getPassword()));
	

			session=RequestContextHolder.currentRequestAttributes().getSessionId();
		
			

		Usermodel user=repository.findByUsername(authentication.getUsername());

		
		loginresponse=new Loginresponse("Active", user.getCustomer_name(), user.getCustomer_type(), new Date(), session);
		
		System.out.println(loginresponse.getCustomerName());
		System.out.println(loginresponse.getSessionId());
		
		user.setCustomer_Session_Id(loginresponse.getSessionId());
		user.setLast_login_date(loginresponse.getLastLoginDate());
		
		repository.save(user);
		  }
	catch(Exception exe){
	loginresponse=new Loginresponse("Invalid", null, null, null, null);
		return loginresponse;
		}
	return loginresponse;
}

@GetMapping("/userdata/{username}")
public Usermodel usermodel(@PathVariable("username") String username) {
	Usermodel user=repository.findByUsername(username);
	
	return user;
	
}

@GetMapping("/usersession/{username}")
public String sessionid(@PathVariable("username") String username) {
	Usermodel user=repository.findByUsername(username);
	return user.getsessionid();
}

@PutMapping("/deletesession/{sessionid}")
public String deletesess(@PathVariable("sessionid") String sessionid) {
	javax.persistence.Query query=entity.createNativeQuery("select username from Usermodel where sessionid = :sessionid");
	query.setParameter("sessionid", sessionid);
	List name=query.getResultList();
	String username=(String) name.get(0);
	Usermodel u=repository.findByUsername(username);
	repository.deleteById(username);
	System.out.println(u.getsessionid());
	return "Deleted";
}

}
