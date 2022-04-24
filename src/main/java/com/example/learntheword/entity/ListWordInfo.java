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
public class ListWordInfo extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_word_info_id_seq")
    @SequenceGenerator(name = "list_word_info_id_seq", sequenceName = "list_word_info_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "list_word_id", nullable = false)
    private ListWord listWord;

    @ManyToOne
    @JoinColumn(name = "word_id", nullable = false)
    private Word word;

    private Integer counter = 0;
}
