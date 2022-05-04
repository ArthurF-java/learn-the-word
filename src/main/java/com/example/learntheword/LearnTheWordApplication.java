package com.example.learntheword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearnTheWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnTheWordApplication.class, args);
    }

}
