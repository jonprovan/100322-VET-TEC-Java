package com.skillstorm.practice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity // a class that maps an object's properties to a table's columns
@Table(name = "shop") // don't need the parameter unless the table name doesn't match the class -- Spring Boot will map a class name GeneralShop to a table named general_shop

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Shop { // implements Serializable done for us by our above annotation Entity
	
	// Our model class needs to follow a couple rules for Spring to use it as an Entity
	// It needs to be a Bean =
	// 1. needs getters and setters that follow the naming conventions of getPropertyName
	// 2. needs a default constructor or no-arguments constructor
	// 3. needs to be serializable = can be serialized and deserialized (necessary to send data in a stream to our database)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shop_id", updatable=false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "open_weekends")
	private boolean openWeekends;
	
	// Version 2:
	@ManyToMany
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(
			name = "shop_stock",
			joinColumns = @JoinColumn(name = "shop_id"), // name of column of owner class
			inverseJoinColumns = @JoinColumn(name = "product_id") // name of the column of the target class
			)
	private Set<Product> products;
	
	// Version 1:
//	@OneToMany(mappedBy = "shop", cascade = CascadeType.ALL )
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	private List<Product> products;
	
//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
	
	public Shop() { }
	
	public Shop(String name, boolean openWeekends) {
		this.name = name;
		this.openWeekends = openWeekends;
		this.products = new HashSet<>();
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void removeProduct(Product product) {
		this.products.remove(product);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpenWeekends() {
		return openWeekends;
	}

	public void setOpenWeekends(boolean openWeekends) {
		this.openWeekends = openWeekends;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", openWeekends=" + openWeekends + "]";
	}
	
	// TODO add more properties
	
	
	
}
