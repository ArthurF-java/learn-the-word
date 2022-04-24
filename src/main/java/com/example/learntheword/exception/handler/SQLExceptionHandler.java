package com.example.learntheword.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class SQLExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public void handle(ConstraintViolationException e) {
        log.error("Constraint was violated, " + e.getMessage());
    }

}
