package com.salatich.imdb.dao;

import java.util.List;

import com.salatich.imdb.domain.Movie;

public interface MovieDAO {
	
	public void addMovie(Movie movie);
	
	public List<Movie> listMovie();
	
	public void removeMovie(Integer id);
	

}
