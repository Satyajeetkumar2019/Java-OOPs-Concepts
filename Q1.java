//Q1.java
class Q2 
{ 
	static int a=10;
   static{
System.out.println("In A SB ");
System.out.println("a"+a);
//System.out.println("b"+b);
System.out.println("b"+Q1.b);
System.out.println("b"+Q1.getm1());

}
	
}//end of the class q1
class Q1 extends Q2
{
	static int b=20;
	static {
	System.out.println("In Q1");
	System.out.println("A"+a);
	System.out.println("B"+b);
	System.out.println("b"+getm1());
	
	}
	static int getm1(){
	System.out.println(" getm1()");
	return b;
	}
	public static void main(String []args){
	
System.out.println("In main ");
System.out.println("a"+a);
System.out.println("b"+b);

	}//end of the main method
}//end of the class
