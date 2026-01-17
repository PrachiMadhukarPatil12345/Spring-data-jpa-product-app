package com.prachi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.prachi.Entity.Product;
import com.prachi.repository.ProductRepository;

@SpringBootApplication
public class SpringJpaProductSystemApplication implements CommandLineRunner
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringJpaProductSystemApplication.class, args);
		
		
	}
	
	@Autowired
	ProductRepository productrepository;
	public void run (String... args) throws Exception
	{
		
		// Custom Methods provided By JPA
		//productrepository.findBybrand("Puma").forEach(i->System.err.println(i)  );
		
		
		// productrepository.findByNameAndPrice("Jacket",850.0).forEach(i->System.err.println(i)  );
		
//		productrepository.findByPriceGreaterThan(1100.0).forEach(i->System.err.println(i) );
		
		//productrepository.findByPriceLessThan(1100.0).forEach(i->System.err.println(i) );
		
		// productrepository.findByBrandAndPriceGreaterThan("Adi",850.0).forEach(i->System.err.println(i) );
		
		// productrepository.findByNameStartingWith("G").forEach(i->System.err.println(i) );
		
		// productrepository.findByNameEndingWith("t").forEach(i->System.err.println(i) );
		
		
		// productrepository.findByNameEndingWithOrPriceGreaterThan("t",1100.0).forEach(i->System.err.println(i)  );
		
		
		// productrepository.findByNameStartingWithOrCategoryStartingWith("s","a").forEach(i->System.out.println(i) );
		
		
		// productrepository.findByNameStartingWithAndCategoryStartingWithAndPriceGreaterThan("s","c",1100.00).forEach(i->System.err.println(i) );
		
		productrepository.findByNameContainingAndPriceGreaterThan("s",2100.0).forEach(i->System.err.println(i) ) ;
		
		
		
		
		
		
		
		
		
		
		
		// Filtering
		
//		Product p2= new Product();
//		p2.setCategory("Footwear");
//		
//		p2.setBrand("Zara");
//		
//		Example<Product> of = Example.of(p2);
//		List<Product> products = productrepository.findAll(of);
//		
//		
//		products.forEach(i->System.out.println(i) );
		
		
		
		
		
		
		
		
		// Filtering
//		Product p = new Product();
//		//p.setCategory("Clothing");
//		//p.setName("Hoodie 28");
//		p.setBrand("Puma");
//		
//		ExampleMatcher matcher =
//				ExampleMatcher.matching()	
//				.withIgnoreNullValues()
//				.withIgnorePaths("price","quantity","name","brand","description","createDate","upDateDate")
//				.withIgnoreCase();
//		
//		Example<Product> of = Example.of(p,matcher);
//		
//		List<Product> products = productrepository.findAll(of);    // Returns all entities matching the given 
//		// Example. In case no match could be found an empty Iterable is returned.
//		
//
//		
//		products.forEach(i->System.out.println(i)  );
		
		
		
		
		// Sorting
		
//		// Sort sort = Sort.by("name");
//		 Sort sort = Sort.by("price").descending();
//		//Sort sort = Sort.by("name").descending();
//		
//		List<Product> products = productrepository.findAll(sort);
//		
//		products.forEach(record-> System.out.println(record) );
//		
		
		
		
		
		
		
		
		
		//Pagination
//		int PageNo=2;
//		
//		PageRequest of = PageRequest.of(PageNo-1,5); // pageNo , PageSize
//		Page<Product> page = productrepository.findAll(of);
//		List<Product> products = page.getContent();
//		
//		for(Product p: products)
//		{
//			System.err.println(p);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Product p1= new Product();
//		
//		p1.setName("Garment");
//		p1.setDescription("Cloths");
//		p1.setPrice(900);
//		p1.setQuantity(9);
//		p1.setCategory("Clothsss");
//		p1.setBrand("Adi");
//		p1.setCreateDate(LocalDate.now() );
//		p1.setUpdateDate(LocalDate.now() );
//		
//		productrepository.save(p1);
		//product p2 new Product();
		
		
//		List<Product> products = new ArrayList<>();
//
//		String[] names = {
//		    "T-Shirt", "Jeans", "Jacket", "Shoes", "Cap",
//		    "Shirt", "Trouser", "Hoodie", "Sweater", "Shorts"
//		};
//
//		String[] descriptions = {
//		    "Men wear", "Women wear", "Winter wear", "Summer wear",
//		    "Casual wear", "Formal wear"
//		};
//
//		String[] categories = {
//		    "Clothing", "Footwear", "Accessories"
//		};
//
//		String[] brands = {
//		    "Adi", "Nike", "Puma", "Zara", "Levis"
//		};
//
//		int price = 500;
//		int qty = 5;
//
//		for (int i = 0; i < 40; i++) {
//		    Product p = new Product();
//
//		    p.setName(names[i % names.length] + " " + (i + 1));
//		    p.setDescription(descriptions[i % descriptions.length]);
//		    p.setCategory(categories[i % categories.length]);
//		    p.setBrand(brands[i % brands.length]);
//
//		    p.setPrice(price + (i * 50));      // different price
//		    p.setQuantity(qty + i);             // different quantity
//
//		    p.setCreateDate(LocalDate.now());
//		    p.setUpdateDate(LocalDate.now());
//
//		    products.add(p);
//		}
//		productrepository.saveAll(products);

	}

}
