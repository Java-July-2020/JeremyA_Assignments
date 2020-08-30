package com.jeremyakatsa.polishingskills.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremyakatsa.polishingskills.models.Course;
import com.jeremyakatsa.polishingskills.models.User;
import com.jeremyakatsa.polishingskills.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository cRepo;
	
	public Course findById(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public Course create(Course course) {
		return this.cRepo.save(course);
	}
	public List<Course> getAllCourses(){
		return this.cRepo.findAll();
	}
	public Course update(Course course) {
		return this.cRepo.save(course);
	}
	public void delete(Long id) {
		this.cRepo.deleteById(id);
	}
	public void manageUsers(Course course, User user, boolean add) {
		if(add) {
			course.getUsers().add(user);
			}
		this.cRepo.save(course);
	}
}
