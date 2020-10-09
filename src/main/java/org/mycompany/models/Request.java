package org.mycompany.models;


public class Request {
	
	private String fromAccountNumber;
	private String toAccountNumber;
	private String amount;
	private String currencyCode;
	
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	
	public String getToAccountNumber() {
		return toAccountNumber;
	}
	
	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	
	
	
}
