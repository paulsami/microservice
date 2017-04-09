package com.sami.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sami.product.domain.Product;
import com.sami.product.repo.ProductRepo;

@RestController
public class ProductController {
	@Autowired
	ProductRepo repo;

	@RequestMapping("/products")
	public Iterable<Product> getProducts() {
		return repo.findAll();
	}

	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable Long id) {
		return repo.findOne(id);
	}
}
