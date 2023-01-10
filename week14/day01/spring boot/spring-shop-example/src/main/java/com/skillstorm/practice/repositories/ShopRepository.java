package com.skillstorm.practice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.practice.models.Shop;

@Repository
// Spring Data JPA gives us a bunch of different Repository interfaces we can choose from
// CrudRepository the most  basic
// JPARepository has a little more functionality we won't need today
// PagingAndSorting has paging and sorting functionality on top of all of the JPARepository functionality
public interface ShopRepository extends CrudRepository<Shop, Integer>{
	// We are done our repository class will be generated for us including methods for all the CRUD queries
	// To see the options to generate more than are provided see
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
}
