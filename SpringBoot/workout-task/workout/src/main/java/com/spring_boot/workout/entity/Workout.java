package com.spring_boot.workout.entity;

import com.spring_boot.workout.enums.ActivityCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="workout")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workout {
	//@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
   // private Long id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer workoutid;
	public Integer getWorkoutid() {
		return workoutid;
	}
	public void setWorkoutid(Integer workoutid) {
		this.workoutid = workoutid;
	}
	private String title;
	private Float duration;
	private Integer caloriesBurnt;
	//@Enumerated(EnumType.STRING)
	private ActivityCategory category;
	public Workout() {
		super();
	}
	
	public Workout(Integer workoutid, String title, Float duration, Integer caloriesBurnt,
			ActivityCategory category) {
		super();
		//this.id = id;
		this.workoutid = workoutid;
		this.title = title;
		this.duration = duration;
		this.caloriesBurnt = caloriesBurnt;
		this.category = category;
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
		return "Workout [id=" + id + ", workoutid=" + workoutid + ", title=" + title + ", duration=" + duration
				+ ", caloriesBurnt=" + caloriesBurnt + ", category=" + category + "]";
	}

	
}
