package com.example.TestStore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.TestStore.domain.Supplier;
import com.example.TestStore.domain.SupplierRepository;

@RestController
public class SupplierCotroller {
	@Autowired
    private SupplierRepository repository;

	@RequestMapping("/suppliers")
    public Iterable<Supplier> getSupplierId() {
		return repository.findAll();
}
}
