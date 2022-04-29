package com.example.learntheword.controller;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping(value = "accounts/{accountId}")
    public ResponseEntity<List<WordDto>> getAllLearningListByAccount(@PathVariable final Long accountId) {
        return ResponseEntity.ok().body(wordService.getAllLearningListsByAccountId(accountId));
    }
}
