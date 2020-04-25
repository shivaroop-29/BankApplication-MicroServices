package com.usecase.Accountapp.model;

public class Accountinforesponse {
private String accountNumber;
private String accountType;
private int accountBranchCode;
private long accountBalance;
private String accountCurrency;
private String accountStatus;

public Accountinforesponse() {
	
}

public Accountinforesponse(String accountNumber, String accountType, int accountBranchCode, long accountBalance,
		String accountCurrency, String accountStatus) {
	this.accountNumber = accountNumber;
	this.accountType = accountType;
	this.accountBranchCode = accountBranchCode;
	this.accountBalance = accountBalance;
	this.accountCurrency = accountCurrency;
	this.accountStatus = accountStatus;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public int getAccountBranchCode() {
	return accountBranchCode;
}

public void setAccountBranchCode(int accountBranchCode) {
	this.accountBranchCode = accountBranchCode;
}

public long getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(long accountBalance) {
	this.accountBalance = accountBalance;
}

public String getAccountCurrency() {
	return accountCurrency;
}

public void setAccountCurrency(String accountCurrency) {
	this.accountCurrency = accountCurrency;
}

public String getAccountStatus() {
	return accountStatus;
}

public void setAccountStatus(String accountSTatus) {
	this.accountStatus = accountStatus;
}


}
