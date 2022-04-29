package com.example.learntheword.service.impl;

import com.example.learntheword.entity.WordRating;
import com.example.learntheword.repository.WordRatingRepository;
import com.example.learntheword.service.WordRatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordRatingServiceImpl implements WordRatingService {

    private final WordRatingRepository wordRatingRepository;

    final int MIN_VALUE_OF_SUCCESSFUL_RATING = 80;

    @Override
    public List<WordRating> findAllWordRatingByAccountId(Long accountId) {
        return wordRatingRepository.findAllByAccountId(accountId);
    }

    @Override
    public Long getCountOfHighRatingWord(Long accountId) {
        return wordRatingRepository.findAllByAccountId(accountId).stream()
                .filter(w -> w.getRating() >= MIN_VALUE_OF_SUCCESSFUL_RATING).count();
    }
}
