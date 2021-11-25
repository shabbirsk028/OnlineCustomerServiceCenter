package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class DepartmentNotFoundException extends Exception{
	public DepartmentNotFoundException(String message) {
		super(message);
	}

}
