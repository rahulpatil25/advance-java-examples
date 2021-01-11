package com.xyz.beans;

public class Student {
	private int rollNumber;
	private String studentName;
	private String course;
	private int duration;
	private int age;
	
	
	public Student(int rollNumber, String studentName, String course, int duration, int age) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
		this.duration = duration;
		this.age = age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [ Roll No: " + rollNumber + ", Name: " + studentName + ", Course:" + course
				+ ", Duration: " + duration + ", Age: " + age + "]";
	}
	
	
	
}
