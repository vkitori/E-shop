package com.example.eshop.db.service.api;

import com.example.eshop.domain.Customer;

import org.springframework.lang.Nullable;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    @Nullable
    Customer get(int id);

    @Nullable
    Integer add(Customer customer); // returns generated id
}