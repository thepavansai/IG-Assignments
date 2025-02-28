package com.ig.evergreen.jdbc.model;

public class Movie {
	String hero;
	String name;
	Float rating;
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [hero=" + hero + ", name=" + name + ", rating=" + rating + "]";
	}
	

}
