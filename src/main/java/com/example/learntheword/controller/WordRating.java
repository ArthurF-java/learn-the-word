package com.example.learntheword.controller;

import com.example.learntheword.service.WordRatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word-ratings")
@RequiredArgsConstructor
public class WordRating {

    private final WordRatingService wordRatingService;

    @GetMapping("/high-rating/count/accounts/{accountId}")
    public ResponseEntity<Long> getCountOfHighRatingWord(@PathVariable Long accountId) {
        return ResponseEntity.ok().body(wordRatingService.getCountOfHighRatingWord(accountId));
    }
}
