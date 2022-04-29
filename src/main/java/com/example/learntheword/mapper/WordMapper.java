package com.example.learntheword.mapper;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.entity.Word;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface WordMapper {

    WordDto toDto(Word entity);

    List<WordDto> toDtos(List<Word> entities);
}
