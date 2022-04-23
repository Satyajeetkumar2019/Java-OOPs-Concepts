class A13{
static void m1(){
	System.out.println("A m1");
}//end m1
void m2(){
	System.out.println("A m2");
	m1();
}//end m2 
}
class B13 extends A13 {
static void m1(){
System.out.println("B m1");
}

	public static void main(String[] args) {
	B13 b1=new B13();
	b1.m1();b1.m2();
		System.out.println("Hello World!");
	}//end of the mm
}//end of the AB13
