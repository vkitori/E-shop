package com.example.eshop.db.service.api;

import com.example.eshop.domain.Merchant;
import org.springframework.lang.Nullable;


import java.util.List;

public interface MerchantService {

    List<Merchant> getMerchants();
    @Nullable
    Merchant get(int id);

    @Nullable
    Integer add(Merchant merchant); //returns generated id

}
