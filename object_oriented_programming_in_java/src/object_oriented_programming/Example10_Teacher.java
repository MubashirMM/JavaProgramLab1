package object_oriented_programming;

public class Example10_Teacher {

	//attributes 
	String name;
	String subject;
	String id;
 
	//constructor 
	Example10_Teacher(String n,String s, String i){
		name=n;
		subject=s;
		id=i; 
	}
	
	void teacherRecord() {
		System.out.println("Teacher details:");
		System.out.println(name);
		System.out.println(subject);
		System.out.println(id);
	}
}
