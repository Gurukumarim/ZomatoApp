package com.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomato.model.Account;
@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {

}
