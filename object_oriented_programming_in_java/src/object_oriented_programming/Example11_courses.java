package object_oriented_programming;
import java.util.*;
public class Example11_courses {
 String name;
 String courseCode;
 List<Example11_student> students;
 
 //Constructor
 Example11_courses(String cc,String name){
	 this.name=name;
	 courseCode=cc;
	students=new ArrayList<>(); 
 }
 
 //add student
 void addStudent(Example11_student newStudent) {
	// Example11_student newStudent=new Example11_student(id,name);
	 students.add(newStudent);
	 
 }
 
 //display
 void showCourses() {
	 System.out.println("Course Code:"+courseCode);
	 System.out.println("Course Name: "+name);
	 System.out.println("Student Enrolled in it are: ");
	 for(Example11_student s:students) {
		 
		 System.out.println("Name:"+s.name);
		 System.out.println("ID: "+s.id);
	 }
 }
}
