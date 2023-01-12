package com.skillstorm.practice.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.practice.models.MyCustomException;
import com.skillstorm.practice.models.Product;
import com.skillstorm.practice.models.Shop;
import com.skillstorm.practice.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repo;
	
	Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	public Iterable<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Product findById(int id) {
		return repo.findById(id).orElse(null); // you could store the optional and do a ifPresent() check then .get() else return null
	}

	@Override
	public Iterable<Product> findByName(String name) {
		return repo.findByNameContaining(name);
	}

	@Override
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Product save(Product product) {
		// if save ignores the id (you could set it to 0) then it would not be indempotent and would create a new one every time
		// save is looking at the id and will overwrite it if it already exists
		// to prevent this behavior do a check:
		log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + product.toString());
		if (!repo.existsById(product.getId())) {
			return repo.save(product);
		}
		return null;
	}

	@Override
	public Product update(Product product, int id) throws MyCustomException {
		if (!repo.existsById(id)) {
			throw new MyCustomException("Update didn't work bc there is no existing record with the given id " + id +"."); // TODO make a custom exception to throw here
		} else {
			product.setId(id);
			return repo.save(product);
		}
	}

	@Override
	public void delete(Product product) {
		repo.delete(product);
	}

	@Override
	public void deleteById(int id) { // TODO we could let it throw the error and add to our GlobalExceptionHanlder class a method to create the HTTP response in this situation
		if (repo.existsById(id)) // this is to make our deletebyid more rebust (ex: if we run this twice in a row by accident)
			repo.deleteById(id); // this is throwing an error if we try to delete a nonexistent row 
	}

	@Override
	public void deleteAll(List<Product> products) {
		repo.deleteAll(products);
	}

	@Override
	public Iterable<Shop> findStoresByProductId(int id) {
		log.debug("======================================================\n" 
					+ "HERE I AM IN ProductServiceImpl findStoresByProductId!");
		return repo.findStoresByProductId(id);
	}
	
	@Override
	public Iterable<Product> findByDescriptionContaining(String name) {
		return repo.findByDescriptionContaining("%" + name + "%");
	}

}
