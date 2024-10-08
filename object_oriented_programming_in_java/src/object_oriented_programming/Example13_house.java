package object_oriented_programming;

import java.util.*;
public class Example13_house {
	 
	//attributes
	String houseAddress;
	String houseId;
	List< Example13_room> room;
	///constructor
	Example13_house(String i,String a){
		houseAddress=a;
		houseId=i;
		room=new ArrayList<>();
	}
	
	//add room 
	void addRoom(String name,String no) {
	Example13_room newRoom=new Example13_room(name,no);
	room.add(newRoom);
	}
	
	///show house details 
	void showHouse() {
		System.out.println("House Address: "+houseAddress);
		System.out.println("House Number: "+houseId);
		for(Example13_room rm:room) {
			rm.roomDetails();
		}	
		
	}

}
