package com.revature.books.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.core.JsonParseException;
import com.revature.books.services.ServiceMethodNotImplementedException;

/**
 * This is the single location where we provide exception handling
 * behaviour for our API.
 * @author Revature
 *
 */
@ControllerAdvice
public class ModelControllerAdvice {
	
	@ExceptionHandler(value = ServiceMethodNotImplementedException.class)
	@ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED, reason = "Service method not implemented")
	public void handleNotImplemented() {
		
	}
	
	@ExceptionHandler(value = DataAccessException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Failed to access requested data")
	public void handleDataAccess() {
	}
	
	@ExceptionHandler(value = JsonParseException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Invalid JSON")
	public void handleJsonParse() {
		
	}

}
