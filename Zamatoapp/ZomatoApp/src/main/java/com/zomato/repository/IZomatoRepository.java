package com.zomato.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomato.model.Zomato;
@Repository
public interface IZomatoRepository extends JpaRepository<Zomato, Integer>{

	List<Zomato> findAll();
}
