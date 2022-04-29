package com.example.learntheword.service;

import com.example.learntheword.dto.WordDto;

import java.util.List;

public interface WordService {

    List<WordDto> getAllLearningListsByAccountId(Long accountId);
}
