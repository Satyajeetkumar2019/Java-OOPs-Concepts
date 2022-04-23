 interface Vehicle {
 void Engine();
 void Break();
 }//end interface
 abstract class Bus implements Vehicle {
 void Engine();
 }
 class ReadBus extends Bus { 
void Break(){
System.out.println("breake funsanality ");}
	public static void main(String[] args) {
	
		System.out.println("Hello World!");
	}//end mm
}//end class
