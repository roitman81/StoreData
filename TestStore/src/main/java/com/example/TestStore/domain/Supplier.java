package com.example.TestStore.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long supplierId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="category")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore

    private List<Items> items;
	
	@Column(name= "city",  length = 20)
	String  city;
	
	@Column(name= "name",  length = 40)
	String name;
	
	@Column(name= "phoneNum",  length = 20)
	int phoneNum;
	
	
	
	
	public Supplier() {
	}

	
	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}


	public Supplier(String name, String city, int phoneNum,List<Items>items) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNum = phoneNum;
		this.items=items;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}
