package com.cg.paymentwallet.bean;

import java.util.Date;
import java.util.List;

public class AccountBean {
	private  int AccountId;
	
	private double balance;
	
	private Date dateOfOpening;
	
	private CustomerBean customerBean;
	
	private double initialDeposit;
	
	private List<WalletTransaction> allTransactions;
	
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public List<WalletTransaction> getAllTransactions() {
		return allTransactions;
	}
	public void setAllTransactions(List<WalletTransaction> allTransactions) {
		this.allTransactions = allTransactions;
	}
	@Override
	public String toString() {
		return "AccountBean [AccountId=" + AccountId + ", balance=" + balance
				+ ", dateOfOpening=" + dateOfOpening + ", initialDeposit="
				+ initialDeposit + ", allTransactions=" + allTransactions + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AccountId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountBean other = (AccountBean) obj;
		if (AccountId != other.AccountId)
			return false;
		return true;
	}
	public void addTransation(WalletTransaction wt){
		this.allTransactions.add(wt);
	}
	


}
