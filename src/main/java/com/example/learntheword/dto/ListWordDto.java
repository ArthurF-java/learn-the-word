package com.example.learntheword.dto;

import com.example.learntheword.type.TranslateType;
import lombok.Data;

@Data
public class ListWordDto {

    private final Long id;
    private final Long accountId;
    private final Integer counter;
    private final String name;
    private final TranslateType translateType;
}
