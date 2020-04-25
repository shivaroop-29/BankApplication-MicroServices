package com.usecase.Accountapp.model;

public class Transactionresponse {

private String accountNumber;
private String transactionDate;
private int transactionAmount;
private String transactionCurrency;
private String transactionStatus;
private String transactionDescription;

public Transactionresponse() {
	
}

public Transactionresponse(String accountNumber, String transactionDate, int transactionAmount,
		String transactionCurrency, String transactionStatus, String transactionDescription) {
	this.accountNumber = accountNumber;
	this.transactionDate = transactionDate;
	this.transactionAmount = transactionAmount;
	this.transactionCurrency = transactionCurrency;
	this.transactionStatus = transactionStatus;
	this.transactionDescription = transactionDescription;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String getTransactionDate() {
	return transactionDate;
}

public void setTransactionDate(String transactionDate) {
	this.transactionDate = transactionDate;
}

public int getTransactionAmount() {
	return transactionAmount;
}

public void setTransactionAmount(int transactionAmount) {
	this.transactionAmount = transactionAmount;
}

public String getTransactionCurrency() {
	return transactionCurrency;
}

public void setTransactionCurrency(String transactionCurrency) {
	this.transactionCurrency = transactionCurrency;
}

public String getTransactionStatus() {
	return transactionStatus;
}

public void setTransactionStatus(String transactionStatus) {
	this.transactionStatus = transactionStatus;
}

public String getTransactionDescription() {
	return transactionDescription;
}

public void setTransactionDescription(String transactionDescription) {
	this.transactionDescription = transactionDescription;
}



}
