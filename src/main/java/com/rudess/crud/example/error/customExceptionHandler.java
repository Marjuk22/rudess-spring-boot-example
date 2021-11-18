package com.rudess.crud.example.error;

import org.apache.tomcat.jni.Local;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class customExceptionHandler {
    @ExceptionHandler({customException.class})
    ResponseEntity<?> activityNotValidHandler(Exception e, ServletWebRequest request) {
        APIError apiError = new APIError();
        apiError.setLocalDateTime(LocalDateTime.now());
        apiError.setPathUrl(request.getDescription(true));
        apiError.setStatus(HttpStatus.BAD_REQUEST);
        apiError.setErrors(Arrays.asList(e.getClass() + ":" + e.getMessage()));

        return new ResponseEntity(apiError, new HttpHeaders(), apiError.getStatus());
    }


}
