package com.spring_boot.workout.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring_boot.workout.exception.WorkoutDetailsNotFoundException;

public class ExcecptionAdvice {
	@ExceptionHandler(value = WorkoutDetailsNotFoundException.class)
	public ResponseEntity<String> notFoundException(WorkoutDetailsNotFoundException wdnfe) {
		return new ResponseEntity<String>("Workout Details Not Found",HttpStatus.NOT_FOUND);
	}
//	 @ExceptionHandler(value = Exception.class)
//	    public ResponseEntity<String> databaseConnectionFailsException(Exception exception) {
//	        return new ResponseEntity<>("Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
}
