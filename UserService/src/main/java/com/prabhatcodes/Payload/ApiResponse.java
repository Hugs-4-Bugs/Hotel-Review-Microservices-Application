package com.prabhatcodes.Payload;


import lombok.*;
import org.springframework.http.HttpStatus;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class ApiResponse {
//
//    private String message;
//    private boolean success;
//    private HttpStatus status;
//}


/**
 * when you will use the above code with lombok annotations then in the GlobalExceptionHandler.java
 * you need to use 👇✅
 * ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
 *
 * instead of 👇❌
 * ApiResponse response = new ApiResponse(message, true, HttpStatus.NOT_FOUND);
 *
 * and vise-versa
 */

public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;

    public ApiResponse() {}

    public ApiResponse(String message, boolean success, HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    // getters & setters (generate via IDE)

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
