package com.example.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies/v1/")
public class MoviesController {
	
	private static final Logger log = LoggerFactory.getLogger(MoviesController.class);
	
	@GetMapping
	public Movie[] findAll() {
		Movie[] movies = {
				new Movie("Avatar"),
				new Movie("Puss in Boots"),
				new Movie("Zombieland"),
				new Movie("Starship Troopers"),
				new Movie("Monster House"),
				new Movie("Hidden Figures")
				
		};
		log.debug(Arrays.asList(movies).toString());
		return movies;
	}

}
