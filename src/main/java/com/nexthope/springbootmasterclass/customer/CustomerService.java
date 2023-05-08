package com.nexthope.springbootmasterclass.customer;

import com.nexthope.springbootmasterclass.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId){
        return customerRepository
                .findById(customerId)
                .orElseThrow(
                        () -> new NotFoundException("Customer with id " + customerId  + " not found!"));
    }
}
