package com.example.learntheword.controller;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.service.WordService;
import com.example.learntheword.type.TranslateType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping(value = "/accounts/{accountId}")
    public ResponseEntity<List<WordDto>> getAllLearningListByAccount(@PathVariable final Long accountId) {
        return ResponseEntity.ok().body(wordService.getAllLearningListsByAccountId(accountId));
    }

    @GetMapping(value = "/translate-types")
    public ResponseEntity<TranslateType[]> getAllTranslateType() {
        return ResponseEntity.ok().body(wordService.getAllTranslateType());
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllWord() {
        return ResponseEntity.ok().body(wordService.getAllWord());
    }

    @PostMapping
    public void createWord(@RequestBody @Valid WordDto wordDto) {
        wordService.createWord(wordDto);
    }
}
