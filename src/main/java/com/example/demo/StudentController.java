package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Vidya","Verma");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> student = new ArrayList<>();
		student.add(new Student("Ashish","tripathi"));
		student.add(new Student("Ravi","Sharma"));
		student.add(new Student("Virat","Kohli"));
		student.add(new Student("Akshay","Kumar"));
		student.add(new Student("Riva","Shankar"));
		student.add(new Student("Ganga","Gupta"));
		student.add(new Student("Bittu","Tiwari"));
	    return student;
		
	}

}
