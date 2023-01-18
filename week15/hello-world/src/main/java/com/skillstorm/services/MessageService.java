package com.skillstorm.services;

import com.skillstorm.models.Message;

public interface MessageService {
	
	Iterable<Message> findAll();

}
