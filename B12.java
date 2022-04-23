class A {
	static int a=20;
	int x=10;
	static void m1(){
System.out.println("A class  m1");
	}//end of the m1 

	void m2(){
System.out.println("A class m2 ");
	}//end of the m2 

}//end of the class a

class B12 extends A{
static int a=90;
int x=80;
static void m1(){
System.out.println("B class m1 ");
//super.m1();
}//end of the m1 
void m2(){
	System.out.println("B class m2");
	super.m2();
}//end of the m2

public static void main(String[] args){ 
	B12  b1=new B12();
	b1.m2();
	//System.out.println(super.a+"......."+a);//CE non-static variable super cannot be referenced from a static context
	//super.m1();
	//super.m2();
	}//end of the main method 
}//end of the class