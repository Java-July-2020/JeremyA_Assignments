package com.jeremyakatsa.eventsbelt.services;

import com.jeremyakatsa.eventsbelt.repositories.EventRepository;

public class EventService {
	private final EventRepository eventRepository;
	
	public EventService(EventRepository eRepository) {
		this.eventRepository = eRepository;
	}
	
		// getSome
		public Event getSpecificEvents(String state) {
			Event event = this.eventRepository.findByState(state).orElse(null);
			return event;
		}
		
		// getAll
		public List<Event> getAllEvents(){
			return this.eventRepository.findAll();
		}
		
		public Long getPetContaining(String search) {
			return this.pRepo.countByNameContaining(search);
		}
		
		// createPet
		public Pet createPet(Pet newPet) {
			return this.pRepo.save(newPet);
		}
		
		public Pet createPet(String name, String species, int age) {
			Pet newPet = new Pet(name, species, age);
			return this.pRepo.save(newPet);
		}
		
		// deletePet
		public void deletePet(Long id) {
			this.pRepo.deleteById(id);
		}
		// updatePet
		public Pet updatePet(Pet updatedPet) {
			return this.pRepo.save(updatedPet);
		}

}
