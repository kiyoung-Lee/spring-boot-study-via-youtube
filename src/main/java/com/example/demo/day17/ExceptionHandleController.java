package com.example.demo.day17;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleController {

    @ExceptionHandler
    public ResponseEntity<String> handelException(VideoException e){
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);

    }
}
