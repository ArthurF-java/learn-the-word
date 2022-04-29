package com.example.learntheword.service;

import com.example.learntheword.entity.WordRating;

import java.util.List;

public interface WordRatingService {

    List<WordRating> findAllWordRatingByAccountId(Long accountId);

    Long getCountOfHighRatingWord(Long accountId);
}
