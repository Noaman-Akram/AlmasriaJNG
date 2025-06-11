package com.example.demo.model;

import java.sql.Date;

//Columns: id, name, address, created_at, phone_number, company, paid_total, to_be_paid
import jakarta.persistence.*;

@Entity
public class Customer{

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 

private String name;

private String address;

private Date created_at;

private String phone_number;

private String company;

private double paid_total; 

private double to_be_paid;




 public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPaid_total() {
        return paid_total;
    }

    public void setPaid_total(double paid_total) {
        this.paid_total = paid_total;
    }

    public double getTo_be_paid() {
        return to_be_paid;
    }

    public void setTo_be_paid(double to_be_paid) {
        this.to_be_paid = to_be_paid;

}




}