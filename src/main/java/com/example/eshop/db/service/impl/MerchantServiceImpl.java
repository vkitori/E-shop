package com.example.eshop.db.service.impl;

import com.example.eshop.db.service.api.MerchantService;
import com.example.eshop.db.service.repository.MerchantRepository;
import com.example.eshop.domain.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    private final MerchantRepository merchantRepository;

    public MerchantServiceImpl(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    @Override
    public List<Merchant> getMerchants() {
        return merchantRepository.getAll();
    }

    @Override
    public Merchant get(int id) {
        return merchantRepository.get(id);
    }

    @Override
    public Integer add(Merchant merchant) {
        return merchantRepository.add(merchant);
    }
}
