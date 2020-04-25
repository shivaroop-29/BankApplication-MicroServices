package com.usecase.Accountapp.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.usecase.Accountapp.model.Accountinforesponse;
import com.usecase.Accountapp.model.Accounts_Table;
import com.usecase.Accountapp.model.Rewards_Table;
import com.usecase.Accountapp.model.Rewardsresponse;
import com.usecase.Accountapp.model.SessionidAuth;
import com.usecase.Accountapp.model.Sessionid_Accountnumber_Body;
import com.usecase.Accountapp.model.Sessionid_Username_Body;
import com.usecase.Accountapp.model.Transaction_table;
import com.usecase.Accountapp.model.Transactionresponse;
import com.usecase.Accountapp.model.Usermodel;
import com.usecase.Accountapp.repository.Repository;
import com.usecase.Accountapp.repository.Rewards_Repository;
import com.usecase.Accountapp.repository.Transaction_Repository;

@RestController
@RequestMapping("/bank/user/dashboard")
public class Controller {
	
	@Autowired
	private Repository repo;
	@Autowired
	private Transaction_Repository trrepo;
	@Autowired
	private Rewards_Repository rewardsrepo;
@Autowired
private RestTemplate rest;
private Usermodel user;
private EntityManager entity;

private Optional<Accounts_Table> accounts;
private Accountinforesponse accountinfo;
private Optional<Transaction_table> transaction;
private Transactionresponse transactionresponse;
private Optional<Rewards_Table> rewardstable;
private Rewardsresponse rewardsresponse;

@Autowired
public Controller(EntityManager entity) {
	this.entity=entity;
}
@PostMapping("/accountinfo")
public Accountinforesponse getacc(@RequestBody Sessionid_Username_Body sess) {

try {
	user=rest.getForObject("http://login/bank/user/userdata/"+sess.getUsername(),Usermodel.class );
	

		if(sess.getUsername().equals(user.getUsername()) && sess.getSessionid().equals(user.getsessionid())) {	
			

			accounts=repo.findById(user.getUsername());
		
accountinfo=new Accountinforesponse(accounts.get().getAccountnumber(), accounts.get().getAccount_type(), accounts.get().getBranch_code(), accounts.get().getAccount_balance(), accounts.get().getAccount_currency(), accounts.get().getAccount_status());


		}
}
		catch(Exception exc) {
			accountinfo=new Accountinforesponse(null, null, 0, 0, null, null);
			return accountinfo;
		}
return accountinfo;
}


@PostMapping("/transactions")
public Transactionresponse gettransactions(@RequestBody Sessionid_Accountnumber_Body sess) {
try {
	transaction=trrepo.findById(sess.getAccountnumber());

	javax.persistence.Query query=entity.createNativeQuery("select username from Accounts_Table where accountnumber = :account");

	query.setParameter("account", sess.getAccountnumber());
	query.getParameter("account");
	
	ArrayList<String> name=new ArrayList<String>();
			name=(ArrayList<String>) query.getResultList();

	String username=(String) name.get(0);

	String sessionid=rest.getForObject("http://login/bank/user/usersession/"+username,String.class );

	

		if(sess.getAccountnumber().equals(transaction.get().getAccount_number()) && sess.getSessionid().equals(sessionid)) {	
			System.out.println("correct");
			accounts=repo.findById(user.getUsername());

		transactionresponse=new Transactionresponse(transaction.get().getAccount_number(), transaction.get().getTransaction_date(), transaction.get().getTransaction_amount(), transaction.get().getTransaction_currency(), transaction.get().getTransaction_status(), transaction.get().getTransaction_description());
//		return transactionresponse;
//		}
//		else if(sess.getAccountnumber().equals(transaction.get().getAccount_number()) || sess.getSessionid().equals(sessionid)) {
//			transactionresponse=new Transactionresponse(null, null, 0, null, null, null);
//			return transactionresponse;
//		}
//		else {
//			transactionresponse=new Transactionresponse(null, null, 0, null, null, null);
//			return transactionresponse;
//		}
}
}
catch(Exception e) {
	transactionresponse=new Transactionresponse(null, null, 0, null, null, null);
	return transactionresponse;
}
	return transactionresponse;
		
	
}


@GetMapping("/rewards/{username}")
public Rewardsresponse getrewards(@PathVariable("username") String username) {
	
	rewardstable=rewardsrepo.findById(username);
	try {
	if(rewardstable.get().getUser_id().equals(username)) {
	rewardsresponse=new Rewardsresponse(rewardstable.get().getRewards_account_id(), rewardstable.get().getRewards_balance(), rewardstable.get().getRewards_type(), rewardstable.get().getRewards_redeem_status(), rewardstable.get().getRewards_expiry());
	}
	}
	catch (Exception e) {
		rewardsresponse=new Rewardsresponse(null, 0, null, null, null);
	}
	return rewardsresponse;
	}
}


	
	

	

