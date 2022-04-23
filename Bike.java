//Bike.java
class Bike{ 
//to static member	
String engNum;
String color;
String ownerName;
String bikeNum;
//intilize the eng num and color using constructor
Bike(String engNum,String color){
this.engNum=engNum;
this.color=color;
}//end of the constructor
//some method creating 
void setBikeNum(String bikeNum){
this.bikeNum=bikeNum;
}//end method
void setOwnerName(String ownerName){
this.ownerName=ownerName;
}//end of the method
void start(){
System.out.println("start bike");
}//end of the start method
void move(){
System.out.println("move method");
}//end of the move method
void stop(){
System.out.println("stope the  bike");
}//end of the stop method
}//end of the bikec  class
