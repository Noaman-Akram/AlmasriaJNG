package com.example.demo.model;


import jakarta.persistence.*;

@Entity
public class Customer{

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 

private String name;

private String email;

public Long getId(){

    return id;
}


public void setId(Long x){
    this.id = x;


}
public String getName(){
    return name;
}


public void setName(String x){
    this.name= x;


}


}