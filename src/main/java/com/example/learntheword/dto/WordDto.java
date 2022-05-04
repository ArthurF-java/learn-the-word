package com.example.learntheword.dto;

import com.example.learntheword.type.TranslateType;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class WordDto {

    private Long id;
    @NotBlank(message = "field word must be specified")
    private String word;
    @NotBlank(message = "field transcription must be specified")
    private String transcription;
    @NotBlank(message = "field translate must be specified")
    private String translate;
    @NotNull(message = "field translateType must be specified")
    private TranslateType translateType;
    private boolean verified;
}
