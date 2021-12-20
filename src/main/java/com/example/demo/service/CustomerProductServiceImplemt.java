package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerProductServiceImplemt implements CustomerProductService  {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ModelMapper modelmapper;
	
	@Override
	public Customer CustomerSave(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getInfo() {
		
		return customerRepository.getInfo();
	}

	@Override
	public List<OrderRequestDto> getMultiFields() {
		return customerRepository.getMultiFields();
	}

	@Override
	public List<Customer> getById(int id) {
		return customerRepository.getById(id);
	}


}
