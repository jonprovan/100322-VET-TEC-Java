package com.skillstorm.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.practice.models.Product;
import com.skillstorm.practice.models.Shop;

/*
 * 
 * CrudRepository provides CRUD functions
 * PagingAndSortingRepository provides methods to do pagination and sort records
 * JpaRepository provides JPA related methods such as flushing the persistence context and delete records in a batch
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	// SELECT * FROM product WHERE name LIKE ?; 
//	Iterable<Product> findByNameLikeIgnoreCase(String name); // this is automaticall generating a query for me based on the method name
	// LIKE keyword matches exactly unless you concatenate the wildcards
	// we would need to do this in the service class
	
	// instead use the keyword CONTAINING
	Iterable<Product> findByNameContaining(String name);
	
	@Query(value = "SELECT * FROM product WHERE description LIKE ?1 ;", nativeQuery = true) // can write your own query in JPQL (different syntax than SQL we've been using)
	Iterable<Product> findByDescriptionContaining(String description); // must pre and append the % in the service
	
	// This is a JPQL query (Java Persistence Query Language) 
	@Query("SELECT s FROM Product p JOIN p.shops s WHERE p.id = :id") // :id is a named parameter // I could have done ?1
	Iterable<Shop> findStoresByProductId(@Param("id") int id); // Annotate the parameter the @Param("whateveryounamedit")
}
