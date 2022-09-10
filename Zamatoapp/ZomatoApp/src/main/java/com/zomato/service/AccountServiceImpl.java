package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.model.Account;
import com.zomato.repository.IAccountRepository;

@Service
public class AccountServiceImpl  implements IAccountService{

	@Autowired
	IAccountRepository accountRepository;
	
	@Override
	public void addAccount(Account account) {
		accountRepository.save(account);
	}

	@Override
	public void updateAccount(Account account) {
		accountRepository.save(account);
		
		
	}

	@Override
	public void deleteAccount(int accountId) {
		accountRepository.deleteById(accountId);
		
	}

	
}
