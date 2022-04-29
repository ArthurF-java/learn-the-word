package com.example.learntheword.dto;

import lombok.Data;

@Data
public class WordDto {

    private Long id;
    private String word;
    private String transcription;
    private String translate;
}
