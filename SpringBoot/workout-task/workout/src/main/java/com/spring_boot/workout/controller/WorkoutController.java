package com.spring_boot.workout.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.workout.entity.Workout;
import com.spring_boot.workout.exception.WorkoutDetailsNotFoundException;
import com.spring_boot.workout.model.WorkoutDTO;
import com.spring_boot.workout.service.WorkoutService;

@RestController
public class WorkoutController {
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	WorkoutService workoutService;
	
	@PostMapping("/workout")
	public String addWorkout(@RequestBody WorkoutDTO workoutdto) {
		workoutService.addWorkoutdetails(modelMapper.map(workoutdto, Workout.class));
		return "Inserted/Updated";
	}
	@GetMapping("/workout")
	public List<WorkoutDTO> getAllWorkOutDetails(){
		List<Workout> workouts= workoutService.getAllWorkoutdetails();
		return workouts.stream().map(w->modelMapper.map(w,WorkoutDTO.class)).collect(Collectors.toList());
		///return workoutService.getAllWorkoutdetails();
	}
	@GetMapping("/workout/{title}")
	public WorkoutDTO getWorkoutByTitle(@PathVariable String title) throws WorkoutDetailsNotFoundException {
		return modelMapper.map(workoutService.getWorkoutbyTitle(title), WorkoutDTO.class);
	}
	@DeleteMapping("/delete")
	public String deleteAllDetails() {
		workoutService.deleteAllDetails();
		return "Deleted";
	}
	@DeleteMapping("/delete/{title}")
	public String deletebByTitle(@PathVariable String title) throws WorkoutDetailsNotFoundException {
		 modelMapper.map(workoutService.deleteByTitle(title),WorkoutDTO.class);
		 return "Deleted";
		
	}
	
	
	@PutMapping("/updateworkout/{title}")
	public String updateWorkDetails(@PathVariable String title,@RequestBody WorkoutDTO workoutdto) throws WorkoutDetailsNotFoundException {
		return workoutService.updateWorkoutDetails(title, modelMapper.map(workoutdto, Workout.class));
	}
	
}
