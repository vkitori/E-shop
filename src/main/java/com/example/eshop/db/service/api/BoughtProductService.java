package com.example.eshop.db.service.api;

import com.example.eshop.domain.BoughtProduct;

import java.util.List;

public interface BoughtProductService {
    void add(BoughtProduct boughtProduct);

    List<BoughtProduct> getAllByCustomerId(int customerId);
}
