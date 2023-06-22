package com.example.eshop.db.service.api;

import com.example.eshop.domain.CustomerAccount;
import org.springframework.lang.Nullable;

public interface CustomerAccountService {

    void addCustomerAccount(CustomerAccount customerAccount);

    @Nullable
    Double getMoney(int customerId);

    void setMoney(int customerId, double money);
}
