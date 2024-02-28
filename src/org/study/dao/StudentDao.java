package org.study.dao;

import java.util.List;

import org.study.model.Student;

public interface StudentDao {
	public abstract int insertStudent(Student std);
	
	public abstract int updateStudent(Student std);
	
	public abstract int deleteStudent(Student std);
	
	public abstract Student getByIdStudent(int id);
	
	public abstract List<Student> getAllStudent();
}
