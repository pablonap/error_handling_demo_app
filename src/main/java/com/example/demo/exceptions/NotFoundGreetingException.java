package com.example.demo.exceptions;

public class NotFoundGreetingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundGreetingException(String errorMessage) {
		super(errorMessage);
	}
	
	public NotFoundGreetingException(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}

}
