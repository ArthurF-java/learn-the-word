package com.example.learntheword.service.impl;

import com.example.learntheword.entity.Account;
import com.example.learntheword.exception.ResourceNotFoundException;
import com.example.learntheword.repository.AccountRepository;
import com.example.learntheword.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account findAccountByIdOrThrow(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(() -> new ResourceNotFoundException("Account", "id", accountId));
    }
}
