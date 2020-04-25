package com.usecase.Accountapp.model;

import lombok.Data;

@Data
public class Sessionid_Accountnumber_Body {
private String sessionid;
private String accountnumber;
	
public Sessionid_Accountnumber_Body() {
	
}

public Sessionid_Accountnumber_Body(String sessionid, String accountnumber) {
	this.sessionid = sessionid;
	this.accountnumber = accountnumber;
}

public String getSessionid() {
	return sessionid;
}

public void setSessionid(String sessionid) {
	this.sessionid = sessionid;
}

public String getAccountnumber() {
	return accountnumber;
}

public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}

}
