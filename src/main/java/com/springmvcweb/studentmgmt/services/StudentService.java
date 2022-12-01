package com.springmvcweb.studentmgmt.services;

import java.util.List;

import com.springmvcweb.studentmgmt.models.Student;

public interface StudentService {

		public List<Student> getAllStudents();
		
		public Student addStudent(Student student);
}
