package com.example.learntheword.service;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.type.TranslateType;

import java.util.List;

public interface WordService {

    List<WordDto> getAllLearningListsByAccountId(Long accountId);

    TranslateType[] getAllTranslateType();

    List<String> getAllWord();

    void createWord(WordDto wordDto);
}
