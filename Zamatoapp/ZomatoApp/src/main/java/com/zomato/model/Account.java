package com.zomato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Account {
	@Id
	@GeneratedValue(generator = "account_id", strategy = GenerationType.AUTO )
	@SequenceGenerator(name = "account_id",sequenceName = "account_id",allocationSize = 1,initialValue = 10)
	private Integer accountId;
	private String accountName;
	private int  accountNumber;
	private String  accountGender;
	private String accountAddress;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountName, int accountNumber, String accountGender, String accountAddress) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountGender = accountGender;
		this.accountAddress = accountAddress;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountGender() {
		return accountGender;
	}

	public void setAccountGender(String accountGender) {
		this.accountGender = accountGender;
	}

	public String getAccountAddress() {
		return accountAddress;
	}

	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountGender="
				+ accountGender + ", accountAddress=" + accountAddress + "]";
	}
	
	

}
