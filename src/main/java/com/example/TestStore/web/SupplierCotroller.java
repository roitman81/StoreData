package com.example.TestStore.web;

import java.util.ArrayList;
import java.util.List;

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

import com.example.TestStore.domain.Supplier;
import com.example.TestStore.domain.SupplierRepository;

@Controller
public class SupplierCotroller {
	@Autowired
    private SupplierRepository srepository;

/*	@RequestMapping("/suppliers")
    public Iterable<Supplier> getSupplierId() {
		return srepository.findAll();
}
	*/
	@RequestMapping (value = "/suppliers", method = RequestMethod.GET)
	public ModelAndView Supplier() {
		Sort sort = Sort.by(Sort.Direction.ASC, "supplierId");
		Iterable<Supplier> sapak = srepository.findAll(sort);
		ModelAndView mav = new ModelAndView("category2", "reshimaSapak", sapak);
		return mav;
	}
	@RequestMapping("/addsupplier")
	public String addsupplier() {
		return "addsupplier";
	}

	@RequestMapping(value = "/addsupplier", method = RequestMethod.POST)
	public String addsupplier(
			@RequestParam("name") String name,
			@RequestParam("city") String city,
			@RequestParam("phoneNum") String phoneNum
			) {
		Supplier nSup = new Supplier();
		nSup.setName(name);
		nSup.setCity(city);
		nSup.setPhoneNum(Integer.parseInt(phoneNum));
		srepository.save(nSup);
		return "redirect:/";
	}

	@RequestMapping(value = "/category2/deletesupplier/{id}")
	public String deleteSupplier(@PathVariable("id") String supplierId) {
		srepository.deleteById(Long.parseLong(supplierId));
		System.out.println("delete supplier id: " + supplierId);
		return "redirect:/";
	}

	@GetMapping("/category2/updatesupplier/{id}")
	public ModelAndView getSupplierById(@PathVariable(value = "id") String supplierId) {
		Supplier upSup = srepository.getOne(Long.parseLong(supplierId));
		List<Supplier> sapak = new ArrayList<>();
		sapak.add(upSup);
		ModelAndView mav = new ModelAndView("formsupplier", "reshimaSapak", sapak);
		return mav;

	}

	@PostMapping("/category2/updatesupplier")
	public String editSupplier(@ModelAttribute Supplier supplier) {
		System.out.println(supplier);
		srepository.save(supplier);
		return "redirect:/";
	}
}
