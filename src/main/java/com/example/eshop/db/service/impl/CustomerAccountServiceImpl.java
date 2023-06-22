package com.example.eshop.db.service.impl;

import com.example.eshop.db.service.api.CustomerAccountService;
import com.example.eshop.db.service.repository.CustomerAccountRepository;
import com.example.eshop.domain.CustomerAccount;
import org.springframework.stereotype.Service;

@Service
public class CustomerAccountServiceImpl implements CustomerAccountService {

    private final CustomerAccountRepository customerAccountRepository;

    public CustomerAccountServiceImpl(CustomerAccountRepository customerAccountRepository) {
        this.customerAccountRepository = customerAccountRepository;
    }

    @Override
    public void addCustomerAccount(CustomerAccount customerAccount) {
        customerAccountRepository.add(customerAccount);
    }

    @Override
    public Double getMoney(int customerId) {
        return customerAccountRepository.getMoney(customerId);
    }

    @Override
    public void setMoney(int customerId, double money) {
        customerAccountRepository.setMoney(customerId, money);
    }
}
