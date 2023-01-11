package com.skillstorm.practice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	// Version 2:
	@ManyToMany(mappedBy = "products") // name of PROPERTY in the OWNER class
	@JsonIgnore
	private Set<Shop> shops;
	
	// Version 1: 
//	@ManyToOne
//	@JoinColumn(name = "shop_id")
//	@JsonIdentityReference(alwaysAsId = true)
//	private Shop shop;

//	public Shop getShop() {
//		return shop;
//	}
//
//	public void setShop(Shop shop) {
//		this.shop = shop;
//	}
	
	public Set<Shop> getShops() {
		return shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	

}
