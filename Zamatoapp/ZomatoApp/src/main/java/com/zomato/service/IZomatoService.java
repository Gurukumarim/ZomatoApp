package com.zomato.service;

import com.zomato.model.Zomato;

public interface IZomatoService {
	
	void addZomato(Zomato zomato);
	void updateZomato(Zomato zomato);
	void deleteZomato(int zomatoId);
	

}
