package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReceiverConfig {
	
	@Bean
	public Queue weatherQueue() {
		return new Queue("weather-report");
	}
	
	@Bean
	WeatherSubscriber reciever() {
		return new WeatherSubscriber();
	}
	
	@Bean
	Jackson2JsonMessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public RabbitTemplate rabbitTemplate(Jackson2JsonMessageConverter converter, ConnectionFactory factory) {
		RabbitTemplate template = new RabbitTemplate(factory);
		template.setMessageConverter(converter);
		return template;
		
	}
}