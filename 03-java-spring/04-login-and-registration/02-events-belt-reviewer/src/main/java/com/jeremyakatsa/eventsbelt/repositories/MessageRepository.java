package com.jeremyakatsa.eventsbelt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.eventsbelt.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long>{

}
