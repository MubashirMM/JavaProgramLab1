package object_oriented_programming;


public class Example13_room {

	
	//attributes
String roomNo;
String roomName;
//   constructor
      Example13_room(String n,String no){
    	  roomName=n;
    	  roomNo=no;    	
      };

      //details display function
      void roomDetails() {
    	  System.out.println("Room no: "+roomNo);
    	  System.out.println("Room name: "+roomName);
      }
      
}
