package com.rakib.mywallet.application.repository;

import com.rakib.mywallet.application.model.CustomerWallet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerWalletRepository extends MongoRepository<CustomerWallet, Long> {
}
