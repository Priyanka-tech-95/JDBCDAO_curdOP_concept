package org.study.driver;

import java.util.List;

import org.study.business.StudentBo;
import org.study.business.StudentBoImpl;
import org.study.model.Student;


public class TestClient {

	public static void main(String[] args) {
		System.out.println("Client....");
		
		StudentBo business = new StudentBoImpl();
		
		//============Insert====================
	/*	Student s1 = new Student(104,"mohit","mohit@gmail.com","Banglore",99.23f);
		
		int save = business.save(s1);
		
		if(save !=0)
			System.out.println("Save success..");
		else
			System.out.println("DB Error..");
		*/
		//===================Update========
	/*	Student s2 = new Student(103,"manisha","manisha@gmail.com","Noida",45.45f);
		int upt = business.update(s2);
		if(upt != 0)
			System.out.println("Update Success ..."+upt);
		else
			System.out.println("DB Error ");
			*/
		//===================Delete==============
		
	/*	Student s3 = new Student();
		s3.setId(103);
		int del = business.delete(s3);
		if(del != 0)
			System.out.println("Delete Success ..."+del);
		else
			System.out.println("DB Error ");
			*/
		//======Get by Id======
	/*	
	Student std = business.getById(101);
	if(std != null) {
		
		System.out.println(" "+std.getId()+" "+std.getName()+" "+std.getEmail()+" "+std.getAddress()+" "+std.getMarks());
	}
	else
		System.out.println("DB Error ");
	*/
		
		//============Get All===================
		List<Student> allstudent = business.getAll();
		if(allstudent !=null) {
			System.out.println(" "+allstudent);
			for(Student st : allstudent)
				System.out.println(" "+st.getId()+" "+st.getName()+" "+st.getEmail()+" "+st.getAddress()+" "+st.getMarks());	
		}
		else
			System.out.println("DB Error ");
		
		
	}

}
