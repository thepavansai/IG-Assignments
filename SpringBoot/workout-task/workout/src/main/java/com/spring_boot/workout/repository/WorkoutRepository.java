package com.spring_boot.workout.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring_boot.workout.entity.Workout;
import com.spring_boot.workout.exception.WorkoutDetailsNotFoundException;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
	Workout findByTitle(String title) throws WorkoutDetailsNotFoundException; 
	//Workout deleteByTitle(String title); 
}
