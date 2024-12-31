 package edu.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cjc.main.model.Student;
import edu.cjc.main.repository.StudentRepository;
import edu.cjc.main.servicei.StudentServiceI;

public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepository sr;

	@Override
	public void saveStudentDetails(Student st) {
		 sr.save(st);
		
	}
	

}
