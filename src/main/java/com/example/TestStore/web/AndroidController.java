package com.example.TestStore.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestStore.domain.Category;
import com.example.TestStore.domain.CategoryRepository;

@RestController
public class AndroidController {
	@Autowired
	CategoryRepository repository;

	@RequestMapping("categories")
	public List<Category> getCategories() {
		Sort sort = Sort.by(Sort.Direction.ASC, "id");

		List<Category> reshima = repository.findAll(sort);
		return reshima;
	}
	
	
	
	
	@RequestMapping("deleteCat/{id}")
	public HttpStatus deleteCategory(@PathVariable("id") int id) {
		repository.deleteById(id);
		System.out.println("delete category id: " + id);
		return HttpStatus.ACCEPTED;

	}

	
	

	
	@RequestMapping(value = "addCategory")
	
	public Category addCategory(@RequestBody Category category) {
		repository.save(category);
		return category;

	}
	
	@RequestMapping("updateCat")
	public Category updateCategory(@RequestBody Category category) {
		Optional<Category> optCat = repository.findById(category.getId());
		Category cat = new Category();
		if (optCat.isPresent()) {
			cat = optCat.get();
		}
		
		cat.setName(category.getName());
		
		repository.save(cat);
		return category;

	}
}