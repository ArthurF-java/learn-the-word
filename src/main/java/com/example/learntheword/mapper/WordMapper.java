package com.example.learntheword.mapper;

import com.example.learntheword.dto.WordDto;
import com.example.learntheword.entity.Word;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface WordMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "verified", ignore = true)
    Word toEntity(WordDto dto);

    WordDto toDto(Word entity);

    List<WordDto> toDtos(List<Word> entities);
}
