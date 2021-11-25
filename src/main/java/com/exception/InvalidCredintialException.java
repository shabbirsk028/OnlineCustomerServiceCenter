package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class InvalidCredintialException extends Exception {
	public InvalidCredintialException(String message){
        super(message);
    }

}