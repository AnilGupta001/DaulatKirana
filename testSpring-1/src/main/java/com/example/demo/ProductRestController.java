package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.annotation.PostConstruct;

//contorller
@RestController

public class ProductRestController {
	@PostMapping("/product")
public String  SaveProduct(@RequestBody Product p) {
		//logic  to persict the data
	return "Product Save";
}
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		if(id==1) {
			Product product=new Product(101,"COMPUTER",121.00);
			return product;
		}
		return new Product(id, null, null);
	}
	@GetMapping("/product")
	public List<Product> getProduct() {
		List<Product> products=new ArrayList<Product>();
		products.add(new Product(1, "System-1", 2000.00));
		products.add(new Product(2, "System-2", 2000.00));
		products.add(new Product(3, "System-3", 2000.00));
		products.add(new Product(4, "System-4", 2000.00));
		products.add(new Product(6, "System-6", 2000.00));
		products.add(new Product(7, "System-7", 2000.00));
		products.add(new Product(8, "System-8", 2000.00));
		products.add(new Product(9, "System-9", 2000.00));
		products.add(new Product(10, "System-10", 2000.00));
		products.add(new Product(11, "System-11", 2000.00));
		products.add(new Product(12, "System-12", 2000.00));
		products.add(new Product(13, "System-13", 2000.00));
		products.add(new Product(14, "System-14", 2000.00));
		products.add(new Product(15, "System-15", 2000.00));
		products.add(new Product(16, "System-16", 2000.00));
		products.add(new Product(17, "System-17", 2000.00));
		return products;
	}
	
	
}
