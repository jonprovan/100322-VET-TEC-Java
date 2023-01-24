package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherReportController {
	
	@Autowired
	WeatherReportService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public WeatherReport save(@RequestBody WeatherReport report) {
		// TODO save this to a database of WeatherReports
		// someservice.save(report);
		
		
		// Alert subscribers there is a new report
		return service.sendReport(report);
	}
}
