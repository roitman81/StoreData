package com.example.TestStore.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.TestStore.domain.Category;
import com.example.TestStore.domain.CategoryRepository;
import com.example.TestStore.domain.Items;
import com.example.TestStore.domain.ItemsRepository;
import com.example.TestStore.domain.Supplier;
import com.example.TestStore.domain.SupplierRepository;

@Controller

public class CategoryCotroller {
	private static final Logger logger = LoggerFactory.getLogger(CategoryCotroller.class);

	@Autowired
	CategoryRepository repository;
	@Autowired
	ItemsRepository irepository;
	@Autowired
    private SupplierRepository srepository;



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		Sort sort = Sort.by(Sort.Direction.ASC, "id");
		
		Iterable<Category> reshima = repository.findAll(sort);
		Sort sortItem = Sort.by(Sort.Direction.ASC, "itemId");
		Iterable<Items> parit = irepository.findAll(sortItem);
		Sort sortSupplier = Sort.by(Sort.Direction.ASC, "supplierId");
		Iterable<Supplier> sapak = srepository.findAll(sortSupplier);
		ModelAndView mav = new ModelAndView("category2");
		mav.addObject("reshima", reshima).addObject("reshimaItem", parit).addObject("reshimaSapak",sapak);
		return mav;
	}

	@RequestMapping("/addcategory")
	public String addcategory() {
		return "addcategory";
	}

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String addCategory(@RequestParam("nameCategory") String nameCategory) {
		Category nCat = new Category(nameCategory);
		repository.save(nCat);
		return "redirect:/";
	}

	@RequestMapping(value = "/category2/delete/{id}")
	public String deleteCategory(@PathVariable("id") String id) {
		repository.deleteById(Integer.parseInt(id));
		System.out.println("delete category id: " + id);
		return "redirect:/";
	}

	@GetMapping("/category2/update/{id}")
	public ModelAndView getCategoryById(@PathVariable(value = "id") Integer id) {
		Category upCat = repository.getOne(id);
		List<Category> reshima = new ArrayList<>();
		reshima.add(upCat);
		ModelAndView mav = new ModelAndView("formcategory", "reshima", reshima);
		return mav;

	}

	@PostMapping("/category2/update")
	public String editCategory(@ModelAttribute Category category) {
		System.out.println(category);
		repository.save(category);
		return "redirect:/";
	}
	

}