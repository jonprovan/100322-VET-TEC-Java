package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class WeatherSubscriber {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@RabbitListener(queues = "weather-queue")
	public void receiver(@Payload WeatherReport report) {
		// TODO save the report to our database or whatever
		
		// Right now we'll just log that the receiver has gotten the message
		log.info(" [x] Received '" + report + "'");
	}

}
