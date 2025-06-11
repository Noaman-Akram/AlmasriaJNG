package com.example.demo.model;

//Columns: id, customer_id, customer_name, address, order_status, order_price, order_cost, work_types, created_at, created_by, company, code

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id; 


private String customer_id; 

private String customer_name;


private String address; 


private String order_status; 

private double order_price;

private double order_cost;

private char[] work_types; 

private Date created_at; 

private String created_by; 

private String company; 

private String code;


// Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public double getOrder_cost() {
        return order_cost;
    }

    public void setOrder_cost(double order_cost) {
        this.order_cost = order_cost;
    }

    public char[] getWork_types() {
        return work_types;
    }

    public void setWork_types(char[] work_types) {
        this.work_types = work_types;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;

}
}