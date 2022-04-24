package com.example.learntheword.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@Setter
@Getter
public class LearningInfo extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "learning_list_info_id_seq")
    @SequenceGenerator(name = "learning_list_info_id_seq", sequenceName = "learning_list_info_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "learning_list_id", nullable = false)
    private LearningList learningList;

    @ManyToOne
    @JoinColumn(name = "word_id", nullable = false)
    private Word word;

    private Integer counter = 0;
}
