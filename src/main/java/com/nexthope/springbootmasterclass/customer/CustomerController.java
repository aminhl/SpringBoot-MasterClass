package com.nexthope.springbootmasterclass.customer;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long customerId){
        return customerService.getCustomer(customerId);
    }

    @PostMapping
    public void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println("POST REQUEST");
        System.out.println(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId){
        System.out.println("DELETE REQUEST");
        System.out.println(customerId);
    }

}
