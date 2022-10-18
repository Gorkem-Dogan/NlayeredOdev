package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private Logger[] _loggers;
	private CourseDao _courseDao;
	private String name = new String();
	private List<String> courseNames = new ArrayList<>();

	public CourseManager(Logger[] loggers, CourseDao productDao) {
		this._courseDao = productDao;
		this._loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(courseNames.size()==0) 
		{
			courseNames.add(course.getCourseName());
		}
		for (String courseName : courseNames) {
			if (courseName.equals(course.getCourseName())) {
				System.out.println("kurs ismi tekrar edemez");

			}

		}
		if (course.getCoursePrice() < 0) {
			throw new Exception("fiyat 0 dan büyük olmalıdır" + " " + course.getCourseName());

		}

		else {

			_courseDao.add(course);
			for (Logger logger : _loggers) {
				logger.log(course.getCourseName());
			}
		}

	}

}
