package com.prachi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prachi.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{
	// custom methods
//	List<Product> findBybrand(String brand);
	
	//  List<Product> findByNameAndPrice(String name,double price);
	
	//List<Product>  findByPriceGreaterThan(double price);
	
	 //List<Product>  findByPriceLessThan(double price);
	

	//List<Product>  findByBrandAndPriceGreaterThan(String brand, double price);
	
	// List<Product>  findByBrandAndPriceLessThan(String brand, double price);
	
    	 //List<Product> findByNameStartingWith(String firstchar);
	
	//List<Product> findByNameEndingWith(String firstchar);
	
//	List<Product> findByNameEndingWith(String lastchar);
	
//	List<Product> findByNameEndingWithOrPriceGreaterThan(String lastchar,double price);
	
	// List<Product> findByNameEndingWithAndPriceGreaterThan(String lastchar,double price);
	
	//List<Product> findByNameStartingWithOrCategoryStartingWith(String lastchar, String category);
	
	// List<Product> findByNameStartingWithAndCategoryStartingWithAndPriceGreaterThan(String lastchar, String category,double price);
	
	// List<Product> findByNameStartingWithOrCategoryStartingWithOrPriceGreaterThan(String lastchar, String category,double price);
	
	List<Product> findByNameContainingAndPriceGreaterThan(String lastchar, double price);
	
	
}

