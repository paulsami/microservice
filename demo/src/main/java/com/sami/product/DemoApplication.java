package com.sami.product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sami.product.domain.LineItem;
import com.sami.product.domain.Product;
import com.sami.product.repo.ProductRepo;

@SpringBootApplication
public class DemoApplication {

	@Autowired ProductRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Product> list = new ArrayList<>();

		Set<LineItem> set = new HashSet<>();
		set.add(new LineItem("Mobile",200.00));
		set.add(new LineItem("TV", 1000.00));
		
		Product prodOne=new Product("Electronics",set);
		//prodOne.setItems(set);
		list.add(prodOne);
		//list.add(new Team("Washington", "Generals", null));

		repo.save(list);
	}

}
