package com.example.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations/v1/")
public class RecommendationsController {
	
	final static Logger logger = LoggerFactory.getLogger(RecommendationsController.class);
	
	@Autowired
	RecommendationsService service;
	
	@GetMapping
	public Movie[] getRecomendations() {
		Movie[] movies = service.getRecommendations();
		logger.debug(Arrays.asList(movies).toString());
		return movies;
	}

}
