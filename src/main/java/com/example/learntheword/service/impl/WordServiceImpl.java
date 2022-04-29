package com.example.learntheword.service.impl;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.entity.Word;
import com.example.learntheword.entity.WordRating;
import com.example.learntheword.mapper.WordMapper;
import com.example.learntheword.service.WordRatingService;
import com.example.learntheword.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRatingService wordRatingService;
    private final WordMapper wordMapper;

    @Override
    public List<WordDto> getAllLearningListsByAccountId(Long accountId) {
        List<Word> words = wordRatingService.findAllWordRatingByAccountId(accountId).stream().map(WordRating::getWord).collect(Collectors.toList());
        return wordMapper.toDtos(words);
    }
}
