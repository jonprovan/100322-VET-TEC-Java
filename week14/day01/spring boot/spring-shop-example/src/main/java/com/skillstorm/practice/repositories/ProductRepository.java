package com.skillstorm.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.practice.models.Product;

/*
 * 
 * CrudRepository provides CRUD functions
 * PagingAndSortingRepository provides methods to do pagination and sort records
 * JpaRepository provides JPA related methods such as flushing the persistence context and delete records in a batch
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	// SELECT * FROM product WHERE name LIKE ?; 
	Iterable<Product> findByNameLikeIgnoreCase(String name); // this is automaticall generating a query for me based on the method name

}
