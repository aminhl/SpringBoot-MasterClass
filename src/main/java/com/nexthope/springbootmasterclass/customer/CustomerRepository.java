package com.nexthope.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;

import java.util.Collections;
import java.util.List;

@Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.emptyList();
    }
}
