package com.springrest.springrest.serviceJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceJPA {

	@Autowired
	private CourseDao courseDao;

	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getReferenceById(courseId);
	}

	
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		Course Entity = courseDao.getReferenceById(courseId);
		courseDao.delete(Entity);
		
	}
	

}
