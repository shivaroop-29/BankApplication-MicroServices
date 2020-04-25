package com.usecase.Accountapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Rewards_Table {
@Id
private String username;
private String rewards_account_id;
private long rewards_balance;
private String rewards_type;
private String rewards_redeem_status;
private String rewards_expiry;
public Rewards_Table() {

}
public Rewards_Table(String username, String rewards_account_id, long rewards_balance, String rewards_type,
		String rewards_redeem_status, String rewards_expiry) {
	this.username = username;
	this.rewards_account_id = rewards_account_id;
	this.rewards_balance = rewards_balance;
	this.rewards_type = rewards_type;
	this.rewards_redeem_status = rewards_redeem_status;
	this.rewards_expiry = rewards_expiry;
}
public String getUser_id() {
	return username;
}
public void setUser_id(String username) {
	this.username = username;
}
public String getRewards_account_id() {
	return rewards_account_id;
}
public void setRewards_account_id(String rewards_account_id) {
	this.rewards_account_id = rewards_account_id;
}
public long getRewards_balance() {
	return rewards_balance;
}
public void setRewards_balance(long rewards_balance) {
	this.rewards_balance = rewards_balance;
}
public String getRewards_type() {
	return rewards_type;
}
public void setRewards_type(String rewards_type) {
	this.rewards_type = rewards_type;
}
public String getRewards_redeem_status() {
	return rewards_redeem_status;
}
public void setRewards_redeem_status(String rewards_redeem_status) {
	this.rewards_redeem_status = rewards_redeem_status;
}
public String getRewards_expiry() {
	return rewards_expiry;
}
public void setRewards_expiry(String rewards_expiry) {
	this.rewards_expiry = rewards_expiry;
}

}
