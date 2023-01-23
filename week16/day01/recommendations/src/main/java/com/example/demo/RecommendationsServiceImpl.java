package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RecommendationsServiceImpl implements RecommendationsService {
	
	private static final Logger log = LoggerFactory.getLogger(RecommendationsServiceImpl.class);
	
	// TODO don't hardcode, instead get this from Service Discovery
	private static final String hardCodedUrl = "http://localhost:9010/movies/v1/";

	@Override
	public Movie[] getRecommendations() {
		Movie[] movies = getMovies();
		Movie[] recommendedMovies = selectMovies(movies);
		return recommendedMovies;
	}
	
	private Movie[] getMovies() {
		// get movies from the Movie API at the given url
		RestTemplate template = new RestTemplate();
		ResponseEntity<Movie[]> result = template.getForEntity(hardCodedUrl, Movie[].class);
		return  result.getBody();
		
	}
	
	private Movie[] selectMovies(Movie[] movies) {
		List<Movie> moviesList = Arrays.asList(movies);
		Collections.shuffle(moviesList);
		Movie[] result = { moviesList.get(0), moviesList.get(1), moviesList.get(2)};
		return result;
	}
	

}
