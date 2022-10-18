package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao _instructorDao;
	private Logger[] _loggers;
	private List<String> instructorName = new ArrayList<>();

	public InstructorManager(Logger[] loggers, InstructorDao instructorDao) {
		_loggers = loggers;
		_instructorDao = instructorDao;
	}

	public void add(Instructor instructor) {
		if (instructorName.size() == 0) {
			instructorName.add(instructor.getFirstName() + " " + instructor.getLastName());
			_instructorDao.add(instructor);
			for (Logger logger : _loggers) {
				logger.log(instructor.getFirstName() + " " + instructor.getLastName());
			}
		} else {
			for (String name : instructorName) {

				if (name.equals(instructor.getFirstName() + " " + instructor.getLastName())) {
					System.out.println("bu eğitmen daha önceden eklenmiş :" + instructor.getFirstName() + " "
							+ instructor.getLastName());
					break;
				} else {
					_instructorDao.add(instructor);
					for (Logger logger : _loggers) {
						logger.log(instructor.getFirstName() + " " + instructor.getLastName());
					}
				}
			}
		}

	}
}
