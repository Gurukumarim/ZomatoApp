package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.model.Zomato;
import com.zomato.repository.IZomatoRepository;

@Service
public class ZomatoServiceImpl implements IZomatoService{

	@Autowired
	IZomatoRepository zomatoRepository;
	
	@Override
	public void addZomato(Zomato zomato) {
		zomatoRepository.save(zomato);
		
	}

	@Override
	public void updateZomato(Zomato zomato) {
		zomatoRepository.save(zomato);
		
	}

	@Override
	public void deleteZomato(int zomatoId) {
		zomatoRepository.deleteById(zomatoId);
		
	}

	
}
