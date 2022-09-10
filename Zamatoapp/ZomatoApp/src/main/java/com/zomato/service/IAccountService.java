package com.zomato.service;

import com.zomato.model.Account;

public interface IAccountService {
	
	void addAccount(Account account);
	void updateAccount(Account account);
	void deleteAccount(int accountId);
	

}
