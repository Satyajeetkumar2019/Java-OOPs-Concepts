class A15{
private void m1(){
System.out.println("A m1 ");}
void m2(){
System.out.println("A m2");
m1();
}//end m2
}//end class
class B15 extends A15{
void m1(){
System.out.println("B m1");}
	public static void main(String[] args) {
	B15 b1=new B15();
	//b1.m1();
	//b1.m2();
	A15 a1=new B15();
	//a1.m1();
	a1.m2();
		System.out.println("Hello World!");
	}//end of the mm
}//end class 
