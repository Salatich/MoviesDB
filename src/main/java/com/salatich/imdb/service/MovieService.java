package com.salatich.imdb.service;

import java.util.List;

import com.salatich.imdb.domain.Movie;

public interface MovieService {
	
	public void addMovie(Movie movie);
	
	public List<Movie> listMovie();
	
	public void removeMovie(Integer id);
	
}
