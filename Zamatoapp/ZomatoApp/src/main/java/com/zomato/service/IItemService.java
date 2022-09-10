package com.zomato.service;

import com.zomato.model.Item;

public interface IItemService {
	
	void addItem(Item item);
	void updateItem(Item item);
	void deleteItem(int itemId);
	

}
