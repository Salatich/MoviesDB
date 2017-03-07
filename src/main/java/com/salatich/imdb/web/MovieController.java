package com.salatich.imdb.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.salatich.imdb.domain.Movie;
import com.salatich.imdb.service.MovieService;

@Controller
public class MovieController {
@Autowired	
private MovieService movieService;

@RequestMapping("/index")
public String listMovies(Map<String,Object> map){
	map.put("movie", new Movie());
	map.put("movieList", movieService.listMovie());
	return "movie";
}

@RequestMapping("/")
public String home() {
	return "redirect:/index";
}

@RequestMapping(value= "/add", method = RequestMethod.POST)
public String addMovie(@ModelAttribute("movie") Movie movie, BindingResult result) {
 movieService.addMovie(movie);
 return "redirect:/index";
}

@RequestMapping("/delete/{movieId}")
public String deleteMovie(@PathVariable("movieId") Integer movieId) {

	movieService.removeMovie(movieId);

	return "redirect:/index";
}
}
