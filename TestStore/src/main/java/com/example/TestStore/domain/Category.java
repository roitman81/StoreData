package com.example.TestStore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="category")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore

    private List<Items> items;
	
	private String name;
	
	

	
	
	
	public List<Items> getItems() {
		return items;
	}





	public void setItems(List<Items> items) {
		this.items = items;
	}


	public Category(int id,String name,List<Items> items) {
		super();
		this.id=id;
		this.name = name;
		this.items=items;
		
	}
	
	public Category(String name) {
		this.setName(name);
	}

	public Category(int id,String name) {
		this.setId(id);
		this.setName(name);
	}




	public Category() {
	}


	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}