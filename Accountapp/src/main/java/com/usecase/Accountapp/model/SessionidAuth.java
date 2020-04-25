package com.usecase.Accountapp.model;

import lombok.Data;

@Data
public class SessionidAuth {
private String username;
private String sessionid;
public SessionidAuth() {
	
}
public SessionidAuth(String username, String sessionid) {

	this.username = username;
	this.sessionid = sessionid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getSessionid() {
	return sessionid;
}
public void setSessionid(String sessionid) {
	this.sessionid = sessionid;
}

}
