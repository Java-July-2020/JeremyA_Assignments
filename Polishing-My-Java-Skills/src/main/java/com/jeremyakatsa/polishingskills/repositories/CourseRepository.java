package com.jeremyakatsa.polishingskills.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeremyakatsa.polishingskills.models.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
	List<Course> findAll();
}
