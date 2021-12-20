package com.example.demo.repository;

import java.util.List;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.model.Customer;

public interface CustomerRepository {
	Customer save(Customer customer);
	List<Customer> getInfo();
	List<Customer> getById(int id);
	List<OrderRequestDto> getMultiFields();

}
