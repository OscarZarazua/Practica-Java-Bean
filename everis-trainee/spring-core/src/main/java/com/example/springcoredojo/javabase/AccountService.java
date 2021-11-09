package com.example.springcoredojo.javabase;

import org.springframework.beans.factory.annotation.Autowired;


public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    private String name;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
