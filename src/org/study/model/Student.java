package org.study.model;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private String address;
	private float marks;
	public Student() {
	
	}
	public Student(int id, String name, String email, String address, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public String toString() {
		System.out.println(" "+getId()+" "+getName()+" "+getEmail()+" "+getAddress()+" "+getMarks());
	return null;
	}
	
	
}



//create table student002(id int primary key, name varchar(255), email varchar(255) unique, address varchar(255), marks float);