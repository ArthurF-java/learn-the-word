package com.example.learntheword.entity;

import com.example.learntheword.type.TranslateType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@Getter
@Setter
public class ListWord extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_word_id_seq")
    @SequenceGenerator(name = "list_word_id_seq", sequenceName = "list_word_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @OneToMany(mappedBy = "listWord")
    private Set<ListWordInfo> listWordInfos;

    private Integer counter = 0;
    private TranslateType translateType;
}
