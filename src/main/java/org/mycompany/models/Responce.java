package org.mycompany.models;

public class Responce {

	private String fromAccountNumber;
	private Long fromBalance;
	private Long toBalance;
	private String journalReferenceNumber;
	
	
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public Long getFromBalance() {
		return fromBalance;
	}
	public void setFromBalance(Long fromBalance) {
		this.fromBalance = fromBalance;
	}
	public Long getToBalance() {
		return toBalance;
	}
	public void setToBalance(Long toBalance) {
		this.toBalance = toBalance;
	}
	public String getJournalReferenceNumber() {
		return journalReferenceNumber;
	}
	public void setJournalReferenceNumber(String journalReferenceNumber) {
		this.journalReferenceNumber = journalReferenceNumber;
	}
	
	@Override
	public String toString() {
		return "Responce [fromAccountNumber=" + fromAccountNumber + ", fromBalance=" + fromBalance + ", toBalance="
				+ toBalance + ", journalReferenceNumber=" + journalReferenceNumber + "]";
	}
	
	
	

}
