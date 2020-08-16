package com.jeremyakatsa.eventsbelt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.eventsbelt.models.Event;
import com.jeremyakatsa.eventsbelt.repositories.EventRepository;

@Service
public class EventService {
	private final EventRepository eventRepository;
	
	public EventService(EventRepository eRepository) {
		this.eventRepository = eRepository;
	}
	
		// getSome
		public List<Event> getSpecificEvents(String [] state) {
			return this.eventRepository.findByState(state);
		}
		
		// getAll
		public List<Event> getAllEvents(){
			return this.eventRepository.findAll();
		}
		
		
		// createEvent
		public Event createEvent(Event newEvent) {
			return this.eventRepository.save(newEvent);
		}
		
		public Event createEvent(String name, String [] date, String location) {
			Event newEvent = new Event(name, date, location);
			return this.eventRepository.save(newEvent);
		}
		
		// deleteEvent
		public void deleteEvent(Long id) {
			this.eventRepository.deleteById(id);
		}
		// updateEvent
		public Event updateEvent(Event updatedEvent) {
			return this.eventRepository.save(updatedEvent);
		}

}
