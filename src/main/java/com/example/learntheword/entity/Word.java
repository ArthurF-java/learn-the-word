package com.example.learntheword.entity;

import com.example.learntheword.type.TranslateType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@Getter
@Setter
public class Word  extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "word_id_seq")
    @SequenceGenerator(name = "word_id_seq", sequenceName = "word_id_seq", allocationSize = 1)
    private Long id;

    @OneToMany(mappedBy = "word")
    private Set<WordRating> wordRatings;

    private String word;
    private String transcription;
    private String translate;
    private TranslateType translateType;
}
