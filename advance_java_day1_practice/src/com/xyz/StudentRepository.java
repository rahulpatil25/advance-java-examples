package com.xyz;
import java.sql.*;
import java.util.*;

import com.xyz.beans.Student;
public class StudentRepository {
	public void addStudent(Student student) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student values(?,?,?,?,?);";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5, student.getAge());
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("Student Addition Failed");
			} else {
				System.out.println("Student Added Successfully");	
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> listOfAllStudents = new ArrayList<Student>();
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int rollNumber = rs.getInt("roll_number");
				String studentName = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				Student student = new Student(rollNumber, studentName, course, duration, age);
				listOfAllStudents.add(student);
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return listOfAllStudents;
	}
	public void deleteStudent(int rollNumber) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from student where roll_number=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollNumber);
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("Student Details Addition Failed");
			} else {
				System.out.println("Student Details Added Successfully");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	public Student getStudent(int rollNumber) {
		Student student = null;
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student where roll_number=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollNumber);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String studentName = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				
				student = new Student(rollNumber, studentName, course, duration, age);
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return student;
	}
}
