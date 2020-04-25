package com.TCS.tcsusecase.entity;

import java.util.Date;

public class Loginresponse {

	private String loginstatus;
	private String customerName;
	private String customerType;
	private Date lastLoginDate;
	private String sessionId;
	public Loginresponse(){
		
	}
	public Loginresponse(String loginstatus, String customerName, String customerType, Date lastLoginDate,
			String sessionId) {
		this.loginstatus = loginstatus;
		this.customerName = customerName;
		this.customerType = customerType;
		this.lastLoginDate = lastLoginDate;
		this.sessionId = sessionId;
	}
	public String getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
}
