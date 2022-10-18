package dataAccess;

import entities.Course;

public class HibernateProductDao implements CourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println("kursumuz Hibernate ile sisteme eklenmiştir");
		
		
	}

}
