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

	public class ItemsCotroller {
		private static final Logger logger = LoggerFactory.getLogger(ItemsCotroller.class);

		@Autowired
		CategoryRepository repository;
		@Autowired
		ItemsRepository irepository;
		@Autowired
	    private SupplierRepository srepository;


		@RequestMapping(value = "/items", method = RequestMethod.GET)
		public ModelAndView item() {
			Sort sort = Sort.by(Sort.Direction.ASC, "itemId");
			Iterable<Items> parit = irepository.findAll(sort);
			ModelAndView mItem = new ModelAndView("category2", "parit", parit);
			return mItem;
		}
		@RequestMapping("/additem")
		public ModelAndView additem() {
			Iterable<Category> catList=repository.findAll();
			Iterable<Supplier> supList=srepository.findAll();
			ModelAndView mav=new ModelAndView("additem");
			mav.addObject("reshima", catList).addObject("reshimaSapak",supList);
			return mav;
		}

		@RequestMapping(value = "/additemnew", method = RequestMethod.POST)
		public String addItem(
				@RequestParam("itemName") String itemName,
				@RequestParam("warehouse") String warehouse,
				@RequestParam("category") String category,
				@RequestParam("supplierId") String supplier
				) {
			Items nItem = new Items();
			nItem.setItemName(itemName);
			nItem.setWarehouse(warehouse);
			Supplier supp=srepository.getOne(Long.parseLong(supplier));
			Category cat=repository.getOne(Integer.parseInt(category));
			nItem.setCategory(cat);
			nItem.setSupplier(supp);
			
			irepository.save(nItem);
			return "redirect:/";
		}

		@RequestMapping(value = "/category2/deleteItem/{id}")
		public String deleteItems(@PathVariable("id") String id) {
			irepository.deleteById(Long.parseLong(id));
			System.out.println("delete item id: " + id);
			return "redirect:/";
		}

		@GetMapping("/category2/updateItem/{id}")
		public ModelAndView getCategoryById(
				@PathVariable(value = "id") String id) {
			
			Items upItem = irepository.getOne(Long.parseLong(id));
			List<Items> parit = new ArrayList<>();
			parit.add(upItem);
			
			ModelAndView mav = new ModelAndView("formitem");
			Iterable<Category> catList=repository.findAll();
			Iterable<Supplier> supList=srepository.findAll();
			mav.addObject("reshima", catList).addObject("reshimaSapak",supList).addObject("parit", parit);
			return mav;
		}

		@PostMapping ("/category2/updateItem")
		public String editItems(
				@RequestParam("itemId") String itemId,
				@RequestParam("itemName") String itemName,
				@RequestParam("warehouse") String warehouse,
				@RequestParam("category") String category,
				@RequestParam("supplierId") String supplier
				){
			Items newItem = irepository.getOne(Long.parseLong(itemId));
			Supplier supp=srepository.getOne(Long.parseLong(supplier));
			Category cat=repository.getOne(Integer.parseInt(category));
			
			newItem.setItemName(itemName);
		    newItem.setWarehouse(warehouse);
			newItem.setCategory(cat);
			newItem.setSupplier(supp);
			
			irepository.save(newItem);
			return "redirect:/";
		}
}
