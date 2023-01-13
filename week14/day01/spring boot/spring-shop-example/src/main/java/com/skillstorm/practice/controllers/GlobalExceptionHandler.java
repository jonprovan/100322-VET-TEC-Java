package com.skillstorm.practice.controllers;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.skillstorm.practice.models.MyCustomException;
import com.skillstorm.practice.models.ProductNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MyCustomException.class)
//	public String[] handleUpdateException(Exception e) { // TODO return an Object with more data than just the message
//		String[] warning = new String[2];
//		warning[0] = e.getMessage();
//		warning[1] = Arrays.asList(e.getStackTrace()).stream().map(i -> i.toString()).reduce("", (a, b) -> a + b);
//		return warning;
//	}
	public String handleUpdateException(Exception e) {
		return e.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ProductNotFound.class)
	public String handleFindByIdProductException(Exception e) {
		return e.getMessage();
	}

}
