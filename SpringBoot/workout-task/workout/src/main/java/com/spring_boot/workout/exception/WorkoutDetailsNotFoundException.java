package com.spring_boot.workout.exception;

public class WorkoutDetailsNotFoundException extends Exception {
	
	public WorkoutDetailsNotFoundException() {
        //super("Workout details not found.");
    }

    
    public WorkoutDetailsNotFoundException(String message) {
        super(message);
    }
} 
