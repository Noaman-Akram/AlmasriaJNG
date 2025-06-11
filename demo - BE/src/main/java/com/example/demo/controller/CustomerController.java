package com.example.demo.controller;

import com.example.demo.repository.CustomerRepository;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Customer;


public class CustomerController{

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository x){
        this.repo = x;

    }

 


        public List<Customer> getAll(){
            return repo.findAll();
        }

        public Customer create(@RequestBody Customer cust){
            return repo.save(cust);
        }
}