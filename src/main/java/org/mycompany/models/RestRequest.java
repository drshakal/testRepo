package org.mycompany.models;

public class RestRequest {
	
	private String fromAccountNumber;
	private String toAccountNumber;
	private String fromAmount;
	private String toAmount;
	private String curruncyCode;
	
	
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
	public String getFromAmount() {
		return fromAmount;
	}
	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}
	public String getToAmount() {
		return toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}
	public String getCurruncyCode() {
		return curruncyCode;
	}
	public void setCurruncyCode(String curruncyCode) {
		this.curruncyCode = curruncyCode;
	}
	
	@Override
	public String toString() {
		return "RestRequest [fromAccountNumber=" + fromAccountNumber + ", toAccountNumber=" + toAccountNumber
				+ ", fromAmount=" + fromAmount + ", toAmount=" + toAmount + ", curruncyCode=" + curruncyCode + "]";
	}
	

}
