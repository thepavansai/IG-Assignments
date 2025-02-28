package com.ig.evergreen.jdbc.service;

import java.util.List;

import com.ig.evergreen.jdbc.dao.MovieDatabaseObject;
import com.ig.evergreen.jdbc.dao.MovieDatabaseObjectImplementation;
import com.ig.evergreen.jdbc.model.Movie;

public class MovieServiceImpl implements MovieService {
	MovieDatabaseObject movieDb;
	@Override
	public void addMovie(Movie movie) throws Exception {
		movieDb = new MovieDatabaseObjectImplementation();
		movieDb.addMovie(movie);
		
	}

	@Override
	public List<Movie> showAllMovies() throws Exception {
		movieDb= new MovieDatabaseObjectImplementation();
		return movieDb.showAllMovies();
	}

	@Override
	public boolean deleteMovie(String name) throws Exception {
		movieDb = new MovieDatabaseObjectImplementation();
		return movieDb.deleteMovie(name);
	}

	@Override
	public boolean updateMovie(String name, String hero, Float rating) throws Exception {
		movieDb= new MovieDatabaseObjectImplementation();
		return movieDb.updateMovie(name, hero, rating);
	}

}
