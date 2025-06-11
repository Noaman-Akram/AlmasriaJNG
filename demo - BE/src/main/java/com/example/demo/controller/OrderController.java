package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired
    private OrderRepository orderRepo;   

    @PostMapping
    public Order addOrder(@RequestBody Order x){
        return orderRepo.save(x);
    }
    @GetMapping
    public List<Order> getAllOrder(){
        return orderRepo.findAll();
    }

}


