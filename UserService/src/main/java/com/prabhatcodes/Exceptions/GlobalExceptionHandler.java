package com.prabhatcodes.Exceptions;


import com.prabhatcodes.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();

//        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        ApiResponse response = new ApiResponse(message, true, HttpStatus.NOT_FOUND);
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
}
