package com.ig.evergreen.jdbc.exception;

@SuppressWarnings("serial")
public class MovieNotFoundException extends Exception {

	public MovieNotFoundException(String message) {
		super(message);
	}
	

}
