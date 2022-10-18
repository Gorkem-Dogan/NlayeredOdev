package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcProductDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("kursumuz Hibernate ile sisteme eklenmiştir");

		
	}

}
