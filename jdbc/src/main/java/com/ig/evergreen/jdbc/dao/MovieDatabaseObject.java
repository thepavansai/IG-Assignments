package com.ig.evergreen.jdbc.dao;

import java.util.List;

import com.ig.evergreen.jdbc.model.Movie;

public interface MovieDatabaseObject {
	
	public void addMovie(Movie movie) throws Exception;
	public List<Movie> showAllMovies() throws Exception;
	public boolean deleteMovie(String name) throws Exception;
	public boolean updateMovie(String name,String hero,Float rating) throws Exception;
	

}
