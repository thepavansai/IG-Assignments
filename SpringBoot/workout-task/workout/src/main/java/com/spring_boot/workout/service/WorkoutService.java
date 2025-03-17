package com.spring_boot.workout.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.workout.entity.Workout;
import com.spring_boot.workout.exception.WorkoutDetailsNotFoundException;
import com.spring_boot.workout.repository.WorkoutRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class WorkoutService {
	@Autowired
	WorkoutRepository workoutRepository;
	
	public void addWorkoutdetails(Workout workout) {
		workoutRepository.save(workout);
	}
	
	public List<Workout> getAllWorkoutdetails(){
		return (List<Workout>) workoutRepository.findAll();
	}
	public Workout getWorkoutbyTitle(String  title) throws WorkoutDetailsNotFoundException {
		Workout workout=workoutRepository.findByTitle(title);
		if (workout == null) {
	        throw new WorkoutDetailsNotFoundException("Workout with title '" + title + "' not found.");
	    } else {
	        return (Workout) workout;
	    }
	}
	public String updateWorkoutDetails(String title,Workout workout) throws WorkoutDetailsNotFoundException {
		Workout workoutold= workoutRepository.findByTitle(title);
		workoutold.setDuration(workout.getDuration());
		workoutold.setCaloriesBurnt(workout.getCaloriesBurnt());
		workoutRepository.save(workoutold);
		return "Calories and Duration got updated";
	}
	public String deleteByTitle(String title) throws WorkoutDetailsNotFoundException {
		//Workout workout= workoutRepository.findByTitle(title);
		 Workout workout= workoutRepository.findByTitle(title);
		 workoutRepository.delete(workout);
		 return "Deleted";
		 
	}
	public String deleteAllDetails() {
		workoutRepository.deleteAll();
		return "Deleted";
	}
}







