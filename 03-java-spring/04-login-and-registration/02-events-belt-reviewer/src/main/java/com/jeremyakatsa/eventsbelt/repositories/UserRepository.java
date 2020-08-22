package com.jeremyakatsa.eventsbelt.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.eventsbelt.models.EventUser;

public interface UserRepository extends CrudRepository<EventUser, Long> {
    EventUser findByEmail(String email);
    List<EventUser> findAll();
}
