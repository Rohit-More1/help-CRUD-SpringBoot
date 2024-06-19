package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.IProductService;

@RestController   //http://localhost:9191/api/hello
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	IProductService productService;
	 @GetMapping("/hello")
	    String hello() {
	        return "Hello World, Spring Boot.... Welcome to You!";
	    }
	 
	 @GetMapping("/products")
	 List<Product> products() {
		 
		return productService.getProductsFromDatabase();
		 
	 }

	
}
