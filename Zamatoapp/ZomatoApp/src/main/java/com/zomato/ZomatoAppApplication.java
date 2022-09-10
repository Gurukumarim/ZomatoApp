package com.zomato;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zomato.model.Account;
import com.zomato.model.Item;
import com.zomato.model.Zomato;
import com.zomato.service.IAccountService;
import com.zomato.service.IItemService;
import com.zomato.service.IZomatoService;

@SpringBootApplication
public class ZomatoAppApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ZomatoAppApplication.class, args);
	}

	@Autowired
	IAccountService iaccount;
	@Autowired
	IItemService itemService;
	@Autowired
	IZomatoService izomatoService;
//	Zomato zomato=new Zomato();
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Account account=new Account("Guru",76765,"Male","Davanagere");
		iaccount.addAccount(account);
		//iaccount.updateAccount(account);
		Item lists=new Item("Dosa","Veg",345);
		Set<Item> item = new HashSet<>(Arrays.asList(lists));
		
		
		Zomato zomato=new Zomato("Davanagere", account, item);
		izomatoService.addZomato(zomato);
		
		
		
		
	}
	
	
}
