package com.example.learntheword.service;

import com.example.learntheword.entity.Account;

public interface AccountService {

    Account findAccountByIdOrThrow(Long accountId);
}
