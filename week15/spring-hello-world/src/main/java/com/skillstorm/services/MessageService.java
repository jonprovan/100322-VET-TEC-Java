package com.skillstorm.services;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Message;

public interface MessageService {
	
	Iterable<Message> findAll();

}
