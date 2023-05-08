package com.nexthope.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
    @Value("${app.useCustomerFakeRepo:false}")
    private boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            //System.out.println("Inside CommandLineRunner!");
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        return new CustomFakeRepository();
    }
}
