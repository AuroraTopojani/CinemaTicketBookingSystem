package com.example.cinema.repository;


import com.example.cinema.pojo.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String> {

    List<Customer>findAll();
    Customer findCustomerByName(String name);

    @Query
            (
                    "select c "+
                            "from Customer c join fetch Ticket t on c.email=t.customer.email"
            )
    List<Customer>findCustomersWithBookings();

}
