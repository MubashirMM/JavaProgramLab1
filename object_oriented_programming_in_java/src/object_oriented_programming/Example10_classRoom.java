package object_oriented_programming;

public class Example10_classRoom {

	//attributes
	String name;
	Example10_Teacher teacher;
	String classNo;
	int classStrength;
	
	//constructor
	Example10_classRoom(String n,String no,Example10_Teacher teacher,int s){
		this.teacher=teacher;
		name=n;
		classStrength=s;
	    classNo=no;
	}
	
	void classDetail() {
		System.out.println("Class details:");
		System.out.println(name);
		System.out.println(classNo);
		System.out.println(classStrength);
		teacher.teacherRecord();
		
	}
}
