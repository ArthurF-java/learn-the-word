package com.example.learntheword.controller;

import com.example.learntheword.dto.ListWordDto;
import com.example.learntheword.service.ListWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/list-words")
public class ListWordController {

    private final ListWordService learningListService;

    @GetMapping(value = "accounts/{accountId}")
    public ResponseEntity<List<ListWordDto>> getAllLearningListByAccount(@PathVariable final Long accountId) {
        return ResponseEntity.ok().body(learningListService.getAllWordListsByAccountId(accountId));
    }
}
