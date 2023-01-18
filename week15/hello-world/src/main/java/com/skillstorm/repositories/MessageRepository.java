package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
