package com.usecase.Accountapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Transaction_table {
@Id

private String accountnumber;
private String transaction_date;
private int transaction_amount;
private String transaction_currency;
private String transaction_status;
private String transaction_description;
public Transaction_table() {
	
}
public Transaction_table(String accountnumber, String transaction_date, int transaction_amount, String transaction_currency,
		String transaction_status, String transaction_description) {
	this.accountnumber = accountnumber;
	this.transaction_date = transaction_date;
	this.transaction_amount = transaction_amount;
	this.transaction_currency = transaction_currency;
	this.transaction_status = transaction_status;
	this.transaction_description = transaction_description;
}
public String getAccount_number() {
	return accountnumber;
}
public void setAccount_number(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getTransaction_date() {
	return transaction_date;
}
public void setTransaction_date(String transaction_date) {
	this.transaction_date = transaction_date;
}
public int getTransaction_amount() {
	return transaction_amount;
}
public void setTransaction_amount(int transaction_amount) {
	this.transaction_amount = transaction_amount;
}
public String getTransaction_currency() {
	return transaction_currency;
}
public void setTransaction_currency(String transaction_currency) {
	this.transaction_currency = transaction_currency;
}
public String getTransaction_status() {
	return transaction_status;
}
public void setTransaction_status(String transaction_status) {
	this.transaction_status = transaction_status;
}
public String getTransaction_description() {
	return transaction_description;
}
public void setTransaction_description(String transaction_description) {
	this.transaction_description = transaction_description;
}

}
