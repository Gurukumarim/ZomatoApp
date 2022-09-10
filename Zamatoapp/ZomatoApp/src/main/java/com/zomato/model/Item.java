package com.zomato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	@Id
	@GeneratedValue(generator = "item_Id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "item_Id",sequenceName = "item_Id",allocationSize = 1,initialValue = 10)
	private Integer itemId;
	private String itemName;
	private String itemType;
	private double itemPrice;

	@ManyToOne
	@JoinColumn(name = "zomato_id")
	Zomato zomato;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, String itemType, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemType=" + itemType + ", itemPrice=" + itemPrice + "]";
	}
	
	

}
