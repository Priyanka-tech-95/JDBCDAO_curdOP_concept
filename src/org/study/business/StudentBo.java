package org.study.business;

import java.util.List;

import org.study.model.*;

public interface StudentBo {

	public abstract int save(Student std);
	
	public abstract int update(Student std);
	
	public abstract int delete(Student std);
	
	public abstract Student getById(int id);
	
	public abstract List<Student> getAll();
}
