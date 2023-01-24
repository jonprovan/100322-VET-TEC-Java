package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportService {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired 
	RabbitTemplate template;
	
	@Autowired
	Queue queue;
	
	public WeatherReport sendReport(WeatherReport report) {
		// send the report
		this.template.convertAndSend(queue.getName(), report);
		// log what was sent
		log.info("============================ Message sent <" + report + ">");
		// return what was sent
		return report;
	}

}
