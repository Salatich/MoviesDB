package com.salatich.imdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salatich.imdb.dao.MovieDAO;
import com.salatich.imdb.domain.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDAO movieDAO;
    
	@Transactional
	public void addMovie(Movie movie) {
		movieDAO.addMovie(movie);
		
	}
	
	@Transactional
	public List<Movie> listMovie() {
		return movieDAO.listMovie();
	}
	
	@Transactional
	public void removeMovie(Integer id) {
		movieDAO.removeMovie(id);
		
	}

}
