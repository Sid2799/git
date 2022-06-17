package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	// List<Course> list;
	 public CourseServiceimpl() {
		 
	//	 list = new ArrayList<>();
		// list.add(new Course(1,"life","sid"));
//		 list.add(new Course(2,"lfe","ram"));
	//	 list.add(new Course(3,"ife","sfa"));
	 
	 
	 }


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
	//	Course c =null;
	//	for(Course course:list)
	//	{
	//		if(course.getId()==courseId)
	//		{
		//		c=course;
		//		break;
			//}
		//}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
	//	list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		//list.forEach(e -> {
			//if(e.getId() == course.getId()) {
				//e.setTitle(course.getTitle());
			//	e.setDescrioption(course.getDescrioption());
			// }
		//}
		//);
		
		courseDao.save(course);
		return course;
	}


	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
