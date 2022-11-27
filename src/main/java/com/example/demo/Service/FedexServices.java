package com.example.demo.Service;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Fedex;
import com.example.demo.Repository.FedExRepository;


@Service
public class FedexServices {

	Map<Integer, Fedex> FedexMap;
	AtomicInteger atomic;
	
	@Autowired
	private FedExRepository fedexrepository;
	
	public Iterable<Fedex>getAllCustoemr(){
		return this.fedexrepository.findAll();
	}
	
	public void addCustomer(Fedex  Customer) {
		this.fedexrepository.save(Customer);
	}
	
	public void deleteCustomer(Integer CustomerId) {
		this.fedexrepository.deleteById(CustomerId);
	}
	
	public Fedex getCustomerById(Integer CustomerId) {
		  return this.fedexrepository.findById(CustomerId).get();
	}
	
	public void updateCustomer(Integer CustomerId, Fedex Customer) {
		Customer.setCustomerId(CustomerId);
		this.fedexrepository.save(Customer);
		
	}

	
	
	
}
