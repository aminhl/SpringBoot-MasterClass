package com.nexthope.springbootmasterclass.customer;

import java.util.Arrays;
import java.util.List;

public class CustomFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Next Hope"),
                new Customer(2L, "Protocol Blood")
        );
    }
}
