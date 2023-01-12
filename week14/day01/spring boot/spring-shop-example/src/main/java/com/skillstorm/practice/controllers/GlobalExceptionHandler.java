package com.skillstorm.practice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.skillstorm.practice.models.MyCustomException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MyCustomException.class)
	public String[] handleUpdateException(Exception e) { // TODO return an Object with more data than just the message
		String[] warning = new String[2];
		warning[0] = e.getMessage();
		warning[1] = e.getStackTrace().toString();
		return warning;
	}

}
