package com.mongo.db.service;

import com.mongo.db.model.Account;
import com.mongo.db.model.AccountDTO;
import com.mongo.db.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRepository repository;

    public String addAccount(AccountDTO accountDTO) {
        if (accountDTO.getId() != null) {
            Optional<Account> account = repository.findById(accountDTO.getId());
            if (account.isPresent()) {
                return "Account with same id already exists";
            }
        }
        repository.save(accountDTO.fromDto());
        return "Account added : " + accountDTO.toString();
    }

    public List<Account> getAccounts() {
        return repository.findAll();
    }
}
