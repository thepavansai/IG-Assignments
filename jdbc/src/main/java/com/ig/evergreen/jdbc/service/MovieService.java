package com.ig.evergreen.jdbc.service;

import java.util.List;

import com.ig.evergreen.jdbc.model.Movie;

public interface MovieService {

	public void addMovie(Movie movie) throws Exception;
	public List<Movie> showAllMovies() throws Exception;
	public boolean deleteMovie(String name) throws Exception;
	public boolean updateMovie(String name,String hero,Float rating) throws Exception;
	
}
