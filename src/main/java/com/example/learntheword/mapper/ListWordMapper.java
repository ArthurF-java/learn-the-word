package com.example.learntheword.mapper;

import com.example.learntheword.dto.ListWordDto;
import com.example.learntheword.entity.ListWord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ListWordMapper {

    @Mapping(target = "accountId", source = "account.id")
    ListWordDto toDto(ListWord listWord);

    List<ListWordDto> toDtoList(List<ListWord> listWords);
}
