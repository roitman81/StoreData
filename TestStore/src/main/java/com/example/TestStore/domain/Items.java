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
	int itemId;
	String itemName;
	
	 @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category")
	 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    @JsonIgnore

    private Category category;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "supplier")
	    private Supplier supplier;
	 
	@Column(name= "warehouse")
	String warehouse;
	
	@Column(name= "supplierId" )
	long  supplierId;

	public Items() {
	}

	public Items(String itemName,String warehouse, Category category, Supplier supplier) {
		super();
		this.warehouse = warehouse;
		this.category = category;
		this.supplier = supplier;
		this.itemName=itemName;
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

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

}
