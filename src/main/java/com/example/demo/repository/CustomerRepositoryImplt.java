package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;

import java.util.List;
@Repository
@Transactional
public class CustomerRepositoryImplt implements  CustomerRepository  {
	@Autowired
	private EntityManager em;

	@Override
	public Customer save(Customer customer) {
	    em.persist(customer);
		return customer;
	}

	@Override
	public List<Customer> getInfo() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> r = cq.from(Customer.class);
		cq.select(r);
		List<Customer> result = em.createQuery(cq).getResultList();
		return result;
	}

	@Override
	public List<OrderRequestDto> getMultiFields() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<OrderRequestDto> cq = cb.createQuery(OrderRequestDto.class);
		Root<Customer> r = cq.from(Customer.class);
		Join<Customer, Product> a=r.join("product");
		cq.multiselect(r.get("name"),r.get("gender"),a.get("price"),a.get("productName"));
		List<OrderRequestDto> result = em.createQuery(cq).getResultList();
		return result;
	}

	@Override
	public List<Customer> getById(int id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> r = cq.from(Customer.class);
		cq.select(r);
		cq.orderBy(cb.desc(r.get("id")));
		List<Customer> list = em.createQuery(cq).getResultList();
		return list;
	}

}
