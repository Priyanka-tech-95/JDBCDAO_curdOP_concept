package org.study.business;

import java.util.List;
import org.study.dao.*;
import org.study.model.Student;
public class StudentBoImpl implements StudentBo {

	StudentDao studentDao = new StudentDaoImpl();
	
	@Override
	public int save(Student std) {
		
		return studentDao.insertStudent(std);
	}

	@Override
	public int update(Student std) {
		
		return studentDao.updateStudent(std);
	}

	@Override
	public int delete(Student std) {
	
		return studentDao.deleteStudent(std);
	}

	@Override
	public Student getById(int id) {
		return studentDao.getByIdStudent(id) ;
		
		
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAllStudent();
		
		
	}

}
