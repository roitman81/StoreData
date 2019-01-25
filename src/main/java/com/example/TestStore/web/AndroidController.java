package com.example.TestStore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("categories/delete/{id}")
	public int deleteCategory(@PathVariable("id") int id) {
		repository.deleteById(id);
		return id;

	}

	@RequestMapping("addCategory")
	public Category addCategory(@RequestParam("Category") Category category) {
		repository.save(category);
		return category;

	}
	
	@RequestMapping("update")
	public Category updateCategory(@RequestParam("Category") Category category) {
		repository.save(category);
		return category;

	}
}