package com.example.learntheword.repository;

import com.example.learntheword.entity.Word;
import com.example.learntheword.type.TranslateType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WordRepository extends JpaRepository<Word, Long> {
    Optional<Word> findByWordAndTranslateType(String word, TranslateType translateType);
}
