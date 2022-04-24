package com.example.learntheword.repository;

import com.example.learntheword.entity.ListWord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListWordRepository extends JpaRepository<ListWord, Long> {
    List<ListWord> findAllByAccountId(Long accountId);
}
