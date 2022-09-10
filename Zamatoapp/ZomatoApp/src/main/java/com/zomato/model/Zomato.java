package com.zomato.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Zomato {
	@Id
	@GeneratedValue(generator = "zomato_Id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "zomato_Id",sequenceName = "zomato_Id",allocationSize = 1,initialValue = 10)
	private Integer zomatoId;
	private String zomatoAddress;
	@OneToOne()
	@JoinColumn(name="account_id")
	private Account account;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="zomato_id")
	private Set<Item>  items;
	
	public Zomato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zomato(String zomatoAddress, Account account, Set<Item> items) {
		super();
		this.zomatoAddress = zomatoAddress;
		this.account = account;
		this.items = items;
	}

	public Integer getZomatoId() {
		return zomatoId;
	}

	public void setZomatoId(Integer zomatoId) {
		this.zomatoId = zomatoId;
	}

	public String getZomatoAddress() {
		return zomatoAddress;
	}

	public void setZomatoAddress(String zomatoAddress) {
		this.zomatoAddress = zomatoAddress;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Zomato [zomatoAddress=" + zomatoAddress + ", account=" + account + ", items=" + items + "]";
	}

	
	
}
