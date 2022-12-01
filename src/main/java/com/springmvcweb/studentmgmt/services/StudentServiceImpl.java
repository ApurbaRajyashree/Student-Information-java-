package com.springmvcweb.studentmgmt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvcweb.studentmgmt.models.Student;


@Service
public class StudentServiceImpl implements StudentService {

	static List<Student> slist = new ArrayList<Student>();
	static {
		Student student = new Student();
		student.setStudentId(1);
		student.setFirstName("Apurba");
		student.setLastName("Thapa");
		student.setGender("female");
		student.setMobileNo("9813399811");
		student.setEmail("apurba@gmail.com");
		slist.add(student);
		
		 student = new Student();
		student.setStudentId(2);
		student.setFirstName("Ankit");
		student.setLastName("Thapa");
		student.setGender("male");
		student.setMobileNo("9841249118");
		student.setEmail("ankit@gmail.com");
		slist.add(student);
		
	}
	
	public List<Student> getAllStudents() {		
		return slist;
	}

	@Override
	public Student addStudent(Student student) {
		slist.add(student);
		return student;
	}

}
