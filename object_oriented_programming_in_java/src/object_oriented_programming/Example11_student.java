package object_oriented_programming;

import java.util.*;
public class Example11_student {

	//Attribute
	String  name;
	String id;
	List<Example11_courses> courses;

	//Constructor
	Example11_student(String id,String name){
		this.name=name;
		this.id=id;
		courses=new ArrayList<>();
	}
	
	//enroll in courses
	void enrollCourse(Example11_courses newCourse) {
		//Example11_courses newCourse=new Example11_courses(course,c);
		courses.add(newCourse);
	}
	
	//show student 
	void showStudent() {
		System.out.println("Student ID: "+id);
		System.out.println("Student "+name);
		System.out.println("Enrolled in follwing courses:");
		for(Example11_courses a:courses) {
			System.out.println("Course Code "+a.courseCode);
			System.out.println("Course Name "+a.name);
		}
	}
}
	
