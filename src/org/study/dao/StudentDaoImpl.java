package org.study.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.study.model.Student;

import dbconn.DBConnection;

import org.study.dao.*;
import org.study.business.*;
public class StudentDaoImpl implements StudentDao {

	
	//private Connection conn = DBConnection.getConnection();
	@Override
	public int insertStudent(Student std) {
		int insert = 0;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into student002 values(?,?,?,?,?)");
			ps.setInt(1,std.getId());
			ps.setString(2,std.getName());
			ps.setString(3,std.getEmail());
			ps.setString(4,std.getAddress());
			ps.setFloat(5,std.getMarks());
			insert	=	ps.executeUpdate();
			System.out.println("Insert Success..."+insert);
			
		}catch(Exception e){
		e.printStackTrace();	
		}
		return insert;
	}

	@Override
	public int updateStudent(Student std) {
		int upt = 0;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("update student002 set name=?,address=?,marks=? where id=?");
			
			ps.setString(1,std.getName());
			
			ps.setString(2,std.getAddress());
			ps.setFloat(3,std.getMarks());
			ps.setInt(4,std.getId());
			upt	=	ps.executeUpdate();
			System.out.println("Update Success..."+upt);
		}catch(Exception e){
			e.printStackTrace();	
			}
		return upt;
	}

	@Override
	public int deleteStudent(Student std) {
		int del = 0;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from student002 where id=?");
		
			ps.setInt(1,std.getId());
			del	=	ps.executeUpdate();
			System.out.println("deleted record Success..."+del);
		}catch(Exception e){
			e.printStackTrace();	
			}
		return del;
		
	}

	@Override
	public Student getByIdStudent(int id) {
		Student student = null;;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from student002 where id=?");
		
			ps.setInt(1,id);
			ResultSet rs	=	ps.executeQuery();
			if(rs.next()) {
				student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setAddress(rs.getString(4));
				student.setMarks(rs.getFloat(5));
				
			}
			System.out.println("Get record Success..."+student);
		}catch(Exception e){
			e.printStackTrace();	
			}
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		//Student student = null;
		List<Student> al=null;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from student002");
		
			ResultSet rs	=	ps.executeQuery();
			al = new ArrayList<Student>();
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setAddress(rs.getString(4));
				student.setMarks(rs.getFloat(5));
				al.add(student);
			}
			System.out.println("Get all record in list Success...");
		}catch(Exception e){
			e.printStackTrace();	
			}
		return al;
		
	}

	
	

}
