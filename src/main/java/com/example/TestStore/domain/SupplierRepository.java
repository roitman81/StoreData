package com.example.TestStore.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface SupplierRepository  extends JpaRepository <Supplier, Long> {

	@Query("select c from Supplier c where c.name = ?1")

	List<Supplier> findByName(String name);
}
