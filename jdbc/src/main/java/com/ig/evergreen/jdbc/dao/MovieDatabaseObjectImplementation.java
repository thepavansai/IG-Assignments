package com.ig.evergreen.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ig.evergreen.jdbc.model.Movie;
import com.ig.evergreen.jdbc.util.DatabaseUtility;

public class MovieDatabaseObjectImplementation implements MovieDatabaseObject {

	@Override
	public void addMovie(Movie movie) throws Exception {
		Connection connection=DatabaseUtility.getConnection();
		PreparedStatement statement =connection.prepareStatement("insert into movie values (?,?,?)");
		statement.setString(1, movie.getName());
		statement.setString(2, movie.getHero());
		statement.setFloat(3, movie.getRating());
		statement.execute();
		
	}

	@Override
	public List<Movie> showAllMovies() throws Exception {
		List<Movie> movies= new ArrayList<>();
		Connection connection=DatabaseUtility.getConnection();
		Statement statement= connection.createStatement();
		ResultSet resultset= statement.executeQuery("select * movie");
		while(resultset.next()) {
			Movie mv= new Movie();
			mv.setName(resultset.getString(1));
			mv.setHero(resultset.getString(2));
			mv.setRating(resultset.getFloat(3));
			movies.add(mv);
		}
		return movies;
	}

	@Override
	public boolean deleteMovie(String name) throws Exception {
		Connection connection= DatabaseUtility.getConnection();
		PreparedStatement statement =connection.prepareStatement("delete from movie where name=?");
		statement.setString(1, name);
		return statement.executeUpdate()>0;
		
	}

	@Override
	public boolean updateMovie(String name,String hero,Float rating) throws Exception {
		Connection connection=DatabaseUtility.getConnection();
		PreparedStatement statement= connection.prepareStatement("update movie set hero=? rating=? where name=?");
		statement.setString(1, hero);
		statement.setFloat(2, rating);
		statement.setString(3, name);
		return statement.executeUpdate()>0;
		 
	}

	

}
