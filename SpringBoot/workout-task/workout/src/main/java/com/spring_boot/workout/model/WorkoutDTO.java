package com.spring_boot.workout.model;

import com.spring_boot.workout.enums.ActivityCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class WorkoutDTO {
	//private Long id;
	private String title;
	private Float duration;
	private Integer caloriesBurnt;
	private ActivityCategory category;
	private Integer workoutid;
	public WorkoutDTO(String title, Float duration, Integer caloriesBurnt, ActivityCategory category,
			Integer workoutid) {
		super();
		this.title = title;
		this.duration = duration;
		this.caloriesBurnt = caloriesBurnt;
		this.category = category;
		this.workoutid = workoutid;
	}

	public WorkoutDTO() {
		super();
	}
	
	public Integer getWorkoutid() {
		return workoutid;
	}

	public void setWorkoutid(Integer workoutid) {
		this.workoutid = workoutid;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getDuration() {
		return duration;
	}
	public void setDuration(Float duration) {
		this.duration = duration;
	}
	public Integer getCaloriesBurnt() {
		return caloriesBurnt;
	}
	public void setCaloriesBurnt(Integer caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}
	public ActivityCategory getCategory() {
		return category;
	}
	public void setCategory(ActivityCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "WorkoutDTO [title=" + title + ", duration=" + duration + ", caloriesBurnt=" + caloriesBurnt
				+ ", category=" + category + ", workoutid=" + workoutid + "]";
	}
	
}
