package com.blog.api.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blog.api.Payloads.APIResoponce;
 // Correct the typo in the import statement

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ConfigDataResourceNotFoundException.class)
    public ResponseEntity<APIResoponce> handleResourceNotFoundException(ConfigDataResourceNotFoundException exception) {
        String message = exception.getMessage();
        APIResoponce apiResponse = new APIResoponce(message, false); // Correct the typo in the class name
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    // You can add more @ExceptionHandler methods for other custom exceptions if needed
}
