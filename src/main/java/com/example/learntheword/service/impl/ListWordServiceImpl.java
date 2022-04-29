package com.example.learntheword.service.impl;

import com.example.learntheword.dto.ListWordDto;
import com.example.learntheword.entity.ListWord;
import com.example.learntheword.exception.ResourceNotFoundException;
import com.example.learntheword.mapper.ListWordMapper;
import com.example.learntheword.repository.ListWordRepository;
import com.example.learntheword.service.AccountService;
import com.example.learntheword.service.ListWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListWordServiceImpl implements ListWordService {

    private final ListWordRepository listWordRepository;
    private final ListWordMapper listWordMapper;
    private final AccountService accountService;

    @Override
    public List<ListWordDto> getAllWordListsByAccountId(final Long accountId) {
        return listWordMapper.toDtoList(listWordRepository.findAllByAccountId(accountId));
    }

    @Override
    @Transactional
    public ListWordDto createListWord(final ListWordDto listWordDto) {
        ListWord listWord = new ListWord();
        listWord.setAccount(accountService.findAccountByIdOrThrow(listWordDto.getAccountId()));
        listWord.setTranslateType(listWordDto.getTranslateType());
        return listWordMapper.toDto(listWordRepository.save(listWord));
    }

    @Override
    public void deleteListWord(Long listWordId) {
        try {
            listWordRepository.deleteById(listWordId);
        } catch(EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("ListWord", "Id", listWordId);
        }
    }
}
