package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class OrderRequestDto {

	
	private String name;
	private String gender;
	private int price;
	private String productName;
	public OrderRequestDto(String name, String gender, int price, String productName) {
		super();
		this.name = name;
		this.gender = gender;
		this.price = price;
		this.productName = productName;
	}
	

}
