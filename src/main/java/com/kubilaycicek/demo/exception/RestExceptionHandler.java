package com.kubilaycicek.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class})
    public String illegalArgumentException() {
        return "Wrong Parameter !";
    }

    @ExceptionHandler({EntityNotFoundException.class})
    public String entityNotFoundException() {
        return "Record not found !";
    }
}
