package com.prabhatcodes.Exceptions;

public class ResourceNotFoundException extends RuntimeException{

// exception message to display to user
    public ResourceNotFoundException(){
        super("Resource not found on server !!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
