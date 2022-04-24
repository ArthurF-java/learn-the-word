package com.example.learntheword.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@Getter
@Setter
public class Account extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_seq")
    @SequenceGenerator(name = "account_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "account")
    private Set<WordRating> wordRatings;

    @OneToMany(mappedBy = "account")
    private Set<ListWord> listWords;

    private String firstName;
    private String lastName;
    private String password;
    private String email;
}