
package com.TCS.tcsusecase;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.security.Principal;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.SessionListener;
import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.TCS.tcsusecase.controller.Controller;
import com.TCS.tcsusecase.entity.Usermodel;
import com.TCS.tcsusecase.repository.Repository;
import com.TCS.tcsusecase.service.Userservice;

@SpringBootApplication
@EnableEurekaClient
public class TcsusecaseApplication {
@Autowired
private Repository repository;

@Autowired
private Controller controller;
@Bean

public RestTemplate rest() {
	return new RestTemplate();
}

@PostConstruct
public void initUser() {
		List<Usermodel> user=Stream.of(new Usermodel("shiva@gmail.com","shiva123","Shiva","elite")
				,new Usermodel("vamshi@gmail.com","vamshi123","Vamshi","elite")
				,new Usermodel("aditya@gmail.com","aditya123","Aditya","elite")).collect(Collectors.toList());
		repository.saveAll(user);
	
	}



	public static void main(String[] args){

		SpringApplication.run(TcsusecaseApplication.class, args);
		
	}

}
