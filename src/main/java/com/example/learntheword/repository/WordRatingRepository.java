package com.example.learntheword.repository;

import com.example.learntheword.entity.WordRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRatingRepository extends JpaRepository<WordRating, Long> {
    List<WordRating> findAllByAccountId(Long accountId);
}
