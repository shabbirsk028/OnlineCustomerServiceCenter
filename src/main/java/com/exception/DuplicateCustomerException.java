package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class DuplicateCustomerException extends Exception {
	public DuplicateCustomerException(String message){
        super(message);
    }

}