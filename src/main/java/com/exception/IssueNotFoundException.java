package com.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class IssueNotFoundException extends Exception {

public IssueNotFoundException(String message) {
		super(message);
}
}