package com.example.TestStore.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository  extends CrudRepository <Supplier, Long> {

	@Query("select c from Supplier c where c.name = ?1")

	List<Supplier> findByName(String name);
}
