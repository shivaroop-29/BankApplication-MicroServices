package com.logout.logout.controller;

import java.nio.channels.SeekableByteChannel;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.logout.logout.model.Logoffresponse;
import com.logout.logout.model.Sessionid_body;

@RestController
@RequestMapping("/bank/user")
public class Controller {
@Autowired
	private RestTemplate rest;
private Logoffresponse logoff;
@DeleteMapping("/authentication")	
public Logoffresponse logoff(@RequestBody Sessionid_body session) {
	Map<String, String> parameters=new HashMap<>();
	parameters.put("sesssionid", session.getSessionid());
	try {
		System.out.println("try1");
		rest.put("http://login/bank/user/deletesession/"+session.getSessionid(), parameters);
		System.out.println("try2");
		logoff=new Logoffresponse("Success");
		return logoff;
	}
	catch(Exception e) {
		logoff=new Logoffresponse("Failed");
		return logoff;
	}
}



	
}
