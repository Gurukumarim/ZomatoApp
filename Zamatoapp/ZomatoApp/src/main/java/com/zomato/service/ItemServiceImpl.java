package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zomato.model.Item;
import com.zomato.repository.IItemRepository;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	IItemRepository itemRepository;
	@Override
	public void addItem(Item item) {
		itemRepository.save(item);
		
	}

	@Override
	public void updateItem(Item item) {
		itemRepository.save(item);
		
	}

	@Override
	public void deleteItem(int itemId) {
		itemRepository.deleteById(itemId);
		
	}

	
}
