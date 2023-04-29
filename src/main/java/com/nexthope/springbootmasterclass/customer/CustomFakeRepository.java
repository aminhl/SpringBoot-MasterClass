package com.nexthope.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "fake")
@Qualifier
public class CustomFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Next Hope"),
                new Customer(2L, "Protocol Blood")
        );
    }
}
