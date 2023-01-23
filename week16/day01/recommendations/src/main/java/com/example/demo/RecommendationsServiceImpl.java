package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@Service
public class RecommendationsServiceImpl implements RecommendationsService {
	
	private static final Logger log = LoggerFactory.getLogger(RecommendationsServiceImpl.class);
	
	// TODO don't hardcode, instead get this from Service Discovery
	private static final String hardCodedUrl = "http://localhost:9010/movies/v1/";
	

	@Autowired
	EurekaClient eurekaClient;
	
	@Override
	public Movie[] getRecommendations() {
		Movie[] movies = getMovies();
		Movie[] recommendedMovies = selectMovies(movies);
		return recommendedMovies;
	}
	
	private Movie[] getMovies() {
		// get URL from Eureka client
		String moviesHost = eurekaClient.getApplication("movies-api").getInstances().get(0).getHostName();
		int moviesPort = eurekaClient.getApplication("movies-api").getInstances().get(0).getPort();
		String url = "http://" + moviesHost + ":" + moviesPort + "/movies/v1/";
		log.info("======================================" + url);
		// get movies from the Movie API at the given url
		RestTemplate template = new RestTemplate();
		ResponseEntity<Movie[]> result = template.getForEntity(url, Movie[].class);
		return  result.getBody();
		
	}
	
	private Movie[] selectMovies(Movie[] movies) {
		List<Movie> moviesList = Arrays.asList(movies);
		Collections.shuffle(moviesList);
		Movie[] result = { moviesList.get(0), moviesList.get(1), moviesList.get(2)};
		return result;
	}
	

}
