package com.capgemini.angularassignment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.angularassignment.beans.ProductResponse;
import com.capgemini.angularassignment.exception.ProductException;

@RestControllerAdvice
public class MyRestControllerAdvice {
	@ExceptionHandler
	public ProductResponse myExceptionHandler(ProductException productException) {
		ProductResponse response = new ProductResponse();
		response.setError(true);
		response.setMessage(productException.getMessage());
		return response;
	}
}
