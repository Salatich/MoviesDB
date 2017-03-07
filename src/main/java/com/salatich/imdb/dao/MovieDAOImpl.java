package com.salatich.imdb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.salatich.imdb.domain.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO {
	
    @Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addMovie(Movie movie) {
		sessionFactory.getCurrentSession().save(movie);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Movie> listMovie() {
		return sessionFactory.getCurrentSession().createQuery("from Movie").list();
	}

	@Override
	public void removeMovie(Integer id) {
		Movie movie = (Movie) sessionFactory.getCurrentSession().load(Movie.class, id);
		if (movie != null){
			sessionFactory.getCurrentSession().delete(movie);
		}
		
	}

}
