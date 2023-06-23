package com.example.eshop.db.service.api;


import com.example.eshop.db.service.api.request.BuyProductRequest;
import com.example.eshop.db.service.api.response.BuyProductResponse;

public interface ShoppingService {
    BuyProductResponse buyProduct(BuyProductRequest request);
}
