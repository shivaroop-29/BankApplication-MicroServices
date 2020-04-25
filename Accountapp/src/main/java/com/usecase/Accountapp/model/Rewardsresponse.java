package com.usecase.Accountapp.model;

public class Rewardsresponse {
private String rewardsAccountId;
private long rewardsBalance;
private String rewardsType;
private String rewardsRedeemStatus;
private String rewardsExpiry;
public Rewardsresponse() {
	
}
public Rewardsresponse(String rewardsAccountId, long rewardsBalance, String rewardsType, String rewardsRedeemStatus,
		String rewardsExpiry) {
	this.rewardsAccountId = rewardsAccountId;
	this.rewardsBalance = rewardsBalance;
	this.rewardsType = rewardsType;
	this.rewardsRedeemStatus = rewardsRedeemStatus;
	this.rewardsExpiry = rewardsExpiry;
}
public String getRewardsAccountId() {
	return rewardsAccountId;
}
public void setRewardsAccountId(String rewardsAccountId) {
	this.rewardsAccountId = rewardsAccountId;
}
public long getRewardsBalance() {
	return rewardsBalance;
}
public void setRewardsBalance(long rewardsBalance) {
	this.rewardsBalance = rewardsBalance;
}
public String getRewardsType() {
	return rewardsType;
}
public void setRewardsType(String rewardsType) {
	this.rewardsType = rewardsType;
}
public String getRewardsRedeemStatus() {
	return rewardsRedeemStatus;
}
public void setRewardsRedeemStatus(String rewardsRedeemStatus) {
	this.rewardsRedeemStatus = rewardsRedeemStatus;
}
public String getRewardsExpiry() {
	return rewardsExpiry;
}
public void setRewardsExpiry(String rewardsExpiry) {
	this.rewardsExpiry = rewardsExpiry;
}

}
