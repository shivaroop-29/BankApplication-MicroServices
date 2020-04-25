package com.usecase.Accountapp.model;

import lombok.Data;

@Data
public class Sessionid_Username_Body {
private String username;
private String sessionid;
public Sessionid_Username_Body() {
	
}
public Sessionid_Username_Body(String username, String sessionid) {

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
