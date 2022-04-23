interface Shapes {
public static double Areas();
public static double perimeter();
}//end interfaceclass
class Rectangles implements Shapes{
	int length=20;
	int hight=10;
public static double Areas(){
return (length*hight);
System.out.println("find Area rectangle ");
}//end method 
public static double perimeter(){
	return (2*lenght*hight);
	System.out.println("find perimeter of rectangle");
}//end method
}//end class
class Circle {

}//end circle class
class Squar {

}//end squar 
class Tringle {

}//end Tringle 
class FindArea {
public static double SendArea(Shapes s){
	s.Areas();
	s.perimeter();
}//end method
}//end class

class AreaUser  {
	public static void main(String []args){
	FindArea.Areas(new Rectangles());
	}//end mm




}//end main/ user  class 