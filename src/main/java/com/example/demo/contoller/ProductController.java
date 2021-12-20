package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerProductService;
@RestController
@RequestMapping("/order")
public class ProductController {
	@Autowired
	CustomerProductService customerProductService;
	
	
	  @PostMapping("/customersave")
	  public Customer createCustomer(@RequestBody Customer customer) {
		  Customer create = customerProductService.CustomerSave(customer); 
		  return create;
		  
	  }
	  
	  @GetMapping("/all")
	  public List<Customer> getInfo(){
		return customerProductService.getInfo();		  
	  }
	  
	  @GetMapping("/multiFields")
	  public List<OrderRequestDto> getMultiFields(){  
	    return customerProductService.getMultiFields();
	}
	  @GetMapping("/get/{id}")
     public List<Customer> getById(@PathVariable("id") int id){
    	 return customerProductService.getById(id);
     }

}
