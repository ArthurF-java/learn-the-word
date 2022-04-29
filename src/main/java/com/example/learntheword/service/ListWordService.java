package com.example.learntheword.service;

import com.example.learntheword.dto.ListWordDto;

import java.util.List;

public interface ListWordService {

    List<ListWordDto> getAllWordListsByAccountId(Long accountId);

    ListWordDto createListWord(ListWordDto listWordDto);

    void deleteListWord(Long listWordId);
}
