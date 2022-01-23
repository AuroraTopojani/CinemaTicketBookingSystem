package com.example.cinema.services;


import com.example.cinema.pojo.entity.Customer;
import com.example.cinema.pojo.input.CustomerInput;
import com.example.cinema.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DefaultCustomerService implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();    }

    @Override
    public Customer findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    @Override
    public Customer save(CustomerInput customerInput) {

        String email= customerInput.getEmail();
        String name=customerInput.getName();
        String surname= customerInput.getSurname();
        Integer age= customerInput.getAge();

        Customer customer= new Customer();
        customer.setEmail(email);
        customer.setName(name);
        customer.setSurname(surname);
        customer.setAge(age);

        return customerRepository.save(customer);    }

    @Override
    public Customer update( String name, CustomerInput customerInput){

        Customer customer= customerRepository.findCustomerByName(name);

        if(customer==null){
            return null;
        }

        String updatedName= customerInput.getName();
        String updatedSurname=customerInput.getSurname();
        String updatedEmail=customerInput.getEmail();
        Integer updatedAge=customerInput.getAge();

        customer.setName(updatedName);
        customer.setSurname(updatedSurname);
        customer.setEmail(updatedEmail);
        customer.setAge(updatedAge);

        return customerRepository.save(customer);
    }

    @Override
    public void delete(String name) {
        Customer customer= customerRepository.findCustomerByName(name);
        if(customer!=null){
            customerRepository.delete(customer);
        }
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer>findCustomersWithBookings(){
        return customerRepository.findCustomersWithBookings();
    }

}
