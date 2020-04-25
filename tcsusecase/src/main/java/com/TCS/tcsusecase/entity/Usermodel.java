package com.TCS.tcsusecase.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@Entity
public class Usermodel {

public Usermodel() {
		
	}
public Usermodel(String username, String password, String customer_name,String customer_type) {
	
//		this.id = id;
		this.username= username;
		Password = password;
		Customer_name = customer_name;
		
		
		Customer_type = customer_type;
		
	}
//@Id
//private int id;
@Id
@Email
private String username;
private String Password;
private String Customer_name;
private Date date;
private String Customer_type;
private String sessionid;
private String Session_Status;
//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getCustomer_name() {
	return Customer_name;
}
public void setCustomer_name(String customer_name) {
	Customer_name = customer_name;
}
public Date getLast_login_date() {
	return date;
}
public void setLast_login_date(Date date) {
	this.date = date;
}
public String getCustomer_type() {
	return Customer_type;
}
public void setCustomer_type(String customer_type) {
	Customer_type = customer_type;
}
public String getsessionid() {
	return sessionid;
}
public void setCustomer_Session_Id(String sessionid) {
	this.sessionid = sessionid;
}
public String getSession_Status() {
	return Session_Status;
}
public void setSession_Status(String session_Status) {
	Session_Status = session_Status;
}
@Override
public String toString() {
	return "username=" + username + ", Password=" + Password + ", Customer_name="
			+ Customer_name + ", last_login_date=" + date + ", Customer_type=" + Customer_type
			+ ", Customer_Session_Id=" +sessionid + ", Session_Status=" + Session_Status + "]";
}

}
