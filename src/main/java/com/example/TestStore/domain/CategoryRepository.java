package com.example.TestStore.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CategoryRepository extends  JpaRepository <Category, Integer> {

	void save(Items items);

	
	
	

}
