class A5{
static int a=10;
int x=30;
static void m1(){
System.out.println("A class m1  ");
}//end of the m1
void m2(){
System.out.println("A class m2 ");
}//end of the m2 
void m3(){
System.out.println("A class m3 ");
}//end of the m3

}//end of the class a5
class B5 extends A5{ 
	static int a=50;
	int x=60;
	static void m1(){
	//super.m1();
	System.out.println(" B class m1");
	}//end of the m1 
	void m2(){
		System.out.println("B  class m2");
		super.m2();
	}//end of the m2 

	void m4(){
System.out.println(super.a+"..........."+a);
System.out.println(super.x+"..........."+x);
super.m1();
m1();
super.m2();
m2();
}//end of the  m4

	public static void main(String[] args){ 
	 B5 b1=new B5();
	 b1.m4();
		System.out.println("Hello World!");
	}//end of the main method 

}//END of the class b5 
