package com.example.TestStore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long itemId;
	String itemName;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity=Category.class)
	@JoinColumn(name = "category")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler","created" })
	@JsonIgnore

	private Category category;

	

	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity=Supplier.class)
	@JoinColumn(name = "supplier")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" ,"created"})
	@JsonIgnore
	private Supplier supplier;

	@Column(name = "warehouse")
	String warehouse;


	

	public Items() {
	}

	public Items(String itemName, String warehouse, Category category, Supplier supplier) {
		super();
		this.itemName = itemName;
		this.warehouse = warehouse;
		this.category = category;
		this.supplier = supplier;

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
