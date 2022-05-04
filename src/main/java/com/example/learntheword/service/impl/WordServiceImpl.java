package com.example.learntheword.service.impl;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.entity.Word;
import com.example.learntheword.entity.WordRating;
import com.example.learntheword.exception.BadRequestException;
import com.example.learntheword.exception.ResourceNotFoundException;
import com.example.learntheword.mapper.WordMapper;
import com.example.learntheword.repository.WordRepository;
import com.example.learntheword.service.WordRatingService;
import com.example.learntheword.service.WordService;
import com.example.learntheword.type.TranslateType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRatingService wordRatingService;
    private final WordMapper wordMapper;
    private final WordRepository wordRepository;

    @Override
    public List<WordDto> getAllLearningListsByAccountId(Long accountId) {
        List<Word> words = wordRatingService.findAllWordRatingByAccountId(accountId).stream().map(WordRating::getWord).collect(Collectors.toList());
        return wordMapper.toDtos(words);
    }

    @Override
    public TranslateType[] getAllTranslateType() {
        return TranslateType.values();
    }

    @Override
    public List<String> getAllWord() {
        return wordRepository.findAll().stream().map(Word::getWord).collect(Collectors.toList());
    }

    @Override
    public void createWord(WordDto wordDto) {
        wordRepository.findByWordAndTranslateType(wordDto.getWord(), wordDto.getTranslateType()).ifPresent(s -> {
            throw new BadRequestException("Word already existed");
        });
        Word word = wordMapper.toEntity(wordDto);
        wordRepository.save(word);
    }
}
