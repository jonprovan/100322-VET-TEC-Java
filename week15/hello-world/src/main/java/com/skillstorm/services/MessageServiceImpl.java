package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Message;
import com.skillstorm.repositories.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository repo;

	@Override
	public Iterable<Message> findAll() {
		return repo.findAll();
	}

}
