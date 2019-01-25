package com.example.TestStore;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.TestStore.domain.Category;
import com.example.TestStore.domain.CategoryRepository;
import com.example.TestStore.domain.Items;
import com.example.TestStore.domain.ItemsRepository;
import com.example.TestStore.domain.Supplier;
import com.example.TestStore.domain.SupplierRepository;



@SpringBootApplication

public class TestStoreApplication  extends SpringBootServletInitializer {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestStoreApplication.class);
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestStoreApplication.class);
	}

	
	@Autowired 
    private CategoryRepository repository;
	@Autowired 
	private ItemsRepository orepository;
	@Autowired 
	SupplierRepository   arepository;



	public static void main(String[] args) throws Exception{
		SpringApplication.run(TestStoreApplication.class, args);
		logger.info("Hello Spring Boot");
	}
	// @Bean
    /* CommandLineRunner runner(){
       return args -> {
    	 Supplier supplier=new Supplier();
    	    supplier.setName("ddddd");
    	 arepository.save(supplier);
    	 */
    	 
    	   /*	 Category category=new Category();
    	   	 repository.save(category);
	        	// Add owner objects and save these to db
	              Items item1 = new Items("John",category,  supplier);
	              Items item2 = new Items("Mary", category,  supplier );
	              orepository.save(item1);
	              orepository.save(item2);*/
    // List<Items> items=new Items()<>;
    	   
//    	  repository.save(new Category( "BedRoom"));
//    	            repository.save(new Category("salon", null));    
//    	             repository.save(new Category("aron", null));
         // Place your code here
   //    };
	// }
}
