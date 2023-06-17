package com.example.eshop.db.service.impl;

import com.example.eshop.db.service.api.CustomerService;
import com.example.eshop.db.service.repository.CustomerRepository;
import com.example.eshop.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository){

        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.getAll();
    }

    @Override
    public Customer get(int id) {
        return customerRepository.get(id);
    }

    @Override
    public Integer add(Customer customer) {
        return customerRepository.add(customer);
    }
}
