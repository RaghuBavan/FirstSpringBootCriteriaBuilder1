package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private int quantity;
	private int price;
//ManyToOne(cascade = CascadeType.ALL)
//rivate Customer customer;


}
