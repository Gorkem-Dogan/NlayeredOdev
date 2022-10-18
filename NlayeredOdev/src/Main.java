import java.io.File;

import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateInstructorDao;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	Course course = new Course();
	
	course.setCourseId(1);
	course.setCourseName("Yazılım geliştirici Yetiştirme Kampı");
	course.setCoursePrice(0);
	Course course2 = new Course();
	course2.setCourseId(2);
	course2.setCourseName("Yazılım geliştirici Yetiştirme Kampı");
	course2.setCoursePrice(0);
	Instructor instructor = new Instructor("Engin","Demiroğ", "PMP,ITIL,MCT certificates");
	Logger[] loggers = new Logger[] 
			{
					new DatabaseLogger(),new EmailLogger(),new FileLogger()
			};
	CourseManager courseManager = new CourseManager(loggers, new JdbcProductDao());
	CourseManager courseManager2 = new CourseManager(loggers, new JdbcProductDao());
	courseManager.add(course);
	courseManager2.add(course2);
	InstructorManager instructorManager = new InstructorManager(loggers, new HibernateInstructorDao());
	instructorManager.add(instructor);
	
	
	
	}

}
