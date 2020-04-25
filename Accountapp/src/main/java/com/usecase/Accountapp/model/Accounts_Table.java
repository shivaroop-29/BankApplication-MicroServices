package com.usecase.Accountapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
public class Accounts_Table {
@Id
private String username;
private String accountnumber;
private String account_type;
private int branch_code;
private long account_balance;
private String account_currency;
private String account_status;
public Accounts_Table() {
	
}
public Accounts_Table(String username, String accountnumber, String account_type, int branch_code, long account_balance,
		String account_currency, String account_status) {
	this.username = username;
	this.accountnumber = accountnumber;
	this.account_type = account_type;
	this.branch_code = branch_code;
	this.account_balance = account_balance;
	this.account_currency = account_currency;
	this.account_status = account_status;
}
public String getUsername() {
	return username;
}
public void setUsername(String userId) {
	this.username = userId;
}
public String getAccountnumber() {
	return accountnumber;
}
public void setAccount_number(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getAccount_type() {
	return account_type;
}
public void setAccount_type(String account_type) {
	this.account_type = account_type;
}
public int getBranch_code() {
	return branch_code;
}
public void setBranch_code(int branch_code) {
	this.branch_code = branch_code;
}
public long getAccount_balance() {
	return account_balance;
}
public void setAccount_balance(long account_balance) {
	this.account_balance = account_balance;
}
public String getAccount_currency() {
	return account_currency;
}
public void setAccount_currency(String account_currency) {
	this.account_currency = account_currency;
}
public String getAccount_status() {
	return account_status;
}
public void setAccount_status(String account_status) {
	this.account_status = account_status;
}

}
