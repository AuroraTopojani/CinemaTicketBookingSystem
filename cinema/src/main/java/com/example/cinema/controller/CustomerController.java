package com.example.cinema.controller;
import com.example.cinema.pojo.entity.Customer;
import com.example.cinema.pojo.input.CustomerInput;
import com.example.cinema.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class CustomerController {

        @Autowired
        private CustomerService customerService;

        @GetMapping("/customer")
        public List<Customer> getCustomers() {
            return customerService.findAll();
        }

        @GetMapping("/customer/{name}")
        public Customer getCustomerbyName(@PathVariable String name) {
            return customerService.findCustomerByName(name);
        }

        @PostMapping("/customer")
        public Customer insertNewCustomer(@RequestBody CustomerInput customerInput) {

            return customerService.save(customerInput);
        }

        @PutMapping("customer/{name}")
        public Customer updateCustomer(@PathVariable String name,
                                       @RequestBody CustomerInput customerInput) {

            return customerService.save(customerInput);
        }

        @DeleteMapping("customer/{name}")
        public Boolean deleteCustomer(@PathVariable String name) {
            customerService.delete(name);
            return true;
        }

        @GetMapping("customer/bookings")
        public List<Customer>getCustomersWithBookings(){
            return customerService.findCustomersWithBookings();
        }
    }
