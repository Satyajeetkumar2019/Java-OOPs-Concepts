interface Vehicle 
{
void engine();
void breaks();

}//end interface
abstract class Buss implements Vehicle {
public void breaks(){
System.out.println("bus have two breake :");
}//end implemention 
}//end class
class Bus extends Buss  implements Vehicle{
	 void breaks(){
	System.out.println("break");}
	void engine(){
	System.out.println("engine ");}
public static void main(String []args){
System.out.println("main method ");}
}