package com.jeremyakatsa.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.productsandcategories.models.Category;
import com.jeremyakatsa.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
