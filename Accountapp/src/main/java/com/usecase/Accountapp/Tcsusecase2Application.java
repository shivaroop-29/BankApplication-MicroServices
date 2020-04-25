package com.usecase.Accountapp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import com.usecase.Accountapp.model.Accounts_Table;
import com.usecase.Accountapp.model.Transaction_table;
import com.usecase.Accountapp.model.Rewards_Table;
import com.usecase.Accountapp.repository.Repository;
import com.usecase.Accountapp.repository.Rewards_Repository;
import com.usecase.Accountapp.repository.Transaction_Repository;

@SpringBootApplication
@EnableEurekaClient
public class Tcsusecase2Application {
	
	@Autowired
	public Repository repository;
	@Autowired
	private Transaction_Repository tx;
	@Autowired
	private Rewards_Repository rewardsrepo;
	
	@Bean
	@LoadBalanced
	public RestTemplate rest() {
		return new RestTemplate();
	}
	
	

	
	@PostConstruct
	public void initacc() {
		List<Accounts_Table> acc=Stream.of(new Accounts_Table("shiva@gmail.com", "123456", "Checking", 1011, 54667, "USD", "Active"),
				new Accounts_Table("vamshi@gmail.com", "123457", "Checking", 1022, 45324, "USD", "Active"),
				new Accounts_Table("aditya@gmail.com", "123458", "Checking", 1033, 34256, "USD", "Active")
				)
				.collect(Collectors.toList());
		repository.saveAll(acc);
		List<Transaction_table> transaction=Stream.of(new Transaction_table("123456", "04/14/2020", 200, "USD", "Success", "test"),
				new Transaction_table("123457", "04/13/2020", 100, "USD", "Success", "test"),
				new Transaction_table("123458", "04/12/2020", 300, "USD", "Success", "test")
				)
				.collect(Collectors.toList());
		tx.saveAll(transaction);
		List<Rewards_Table> rewards=Stream.of(new Rewards_Table("shiva@gmail.com", "abc456", 123, "Checking", "pending", "04/17/2020"),
				new Rewards_Table("vamshi@gmail.com", "abc457", 123, "Checking", "pending", "04/17/2020"),
				new Rewards_Table("aditya@gmail.com", "abc458", 123, "Checking", "pending", "04/17/2020")
				)
				.collect(Collectors.toList());
		rewardsrepo.saveAll(rewards);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Tcsusecase2Application.class, args);
	
	
		
	}

}
