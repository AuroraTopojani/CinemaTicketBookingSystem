package com.example.cinema.services;

import com.example.cinema.pojo.entity.Customer;
import com.example.cinema.pojo.input.CustomerInput;

import java.util.List;

public interface CustomerService {

    List<Customer>findAll();
    Customer findCustomerByName(String name);
    Customer save(CustomerInput customerInput);
    Customer update(String name, CustomerInput customerInput);
    void delete(String name);

    List<Customer>findCustomersWithBookings();

}
