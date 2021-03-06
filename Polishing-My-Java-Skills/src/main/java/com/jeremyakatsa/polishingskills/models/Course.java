package com.jeremyakatsa.polishingskills.models;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank (message="is required")
	private String name;
	@NotBlank (message="is required")
	private String instructor;
	@NotNull
	@Range(min=0, message="must be more than 1")
	private int capacity;
	@Column(updatable=false)
    private Date createdAt;
	private Date updatedAt;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User courseCreator;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
		name="userCourses",
		joinColumns = @JoinColumn(name="course_id"),
		inverseJoinColumns = @JoinColumn(name="user_id")
	)
    private List<User> users;

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
	public Course() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public User getCourseCreator() {
		return courseCreator;
	}
	public void setCourseCreator(User courseCreator) {
		this.courseCreator = courseCreator;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}



	
	}
	
