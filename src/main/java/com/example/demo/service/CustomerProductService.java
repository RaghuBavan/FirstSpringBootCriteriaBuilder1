package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.model.Customer;

public interface CustomerProductService {
	Customer CustomerSave(Customer customer);
	List<Customer> getInfo();
	List<Customer> getById(int id);
	List<OrderRequestDto> getMultiFields();

}
