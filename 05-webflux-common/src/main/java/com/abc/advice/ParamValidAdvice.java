package com.abc.advice;

import com.abc.exception.StudentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;

// 处理器通知切面（连接点为处理器方法）
@ControllerAdvice
public class ParamValidAdvice {

    @ExceptionHandler
    public ResponseEntity<String> validateHandle(StudentException e) {
        String message = e.getMessage();
        String fn = e.getField();
        String fv = e.getValue();
        String msg = fn + " : " + fv + " : " + message;
        return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<String> validateHandle(WebExchangeBindException ex) {
        return new ResponseEntity<String>(getExceptionMsg(ex), HttpStatus.BAD_REQUEST);
    }

    private String getExceptionMsg(WebExchangeBindException ex) {
        return ex.getFieldErrors()
                .stream()
                .map(e -> e.getField() + " : " + e.getDefaultMessage())
                .reduce("", (s1, s2) -> s1 + "\n" + s2);
    }

}
