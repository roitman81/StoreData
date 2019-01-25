package com.example.TestStore.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.TestStore.domain.Category;
import com.example.TestStore.domain.Items;
import com.example.TestStore.domain.ItemsRepository;



@RestController
public class ItemsCotroller {
	@Autowired
	private ItemsRepository repository;

	@RequestMapping("/items")
	public Iterable<Items> getItemId() {
		return repository.findAll();
	}
	
	
	
	
	
	
	
/*
	@PostMapping("/item")
	public ResponseEntity<Object> createItem(@RequestBody Items item) {
		Items savedItems = repository.save(item);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedItems.getItemId()).toUri();

		return ResponseEntity.created(location).build();

	}*/
}