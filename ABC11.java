class A11{
	static int a=10;
	int x=20;
	static{
	System.out.println("A class load");
	}//end static b
}//end class
class B11 extends A11{
static int b=40;
int y=50;
static{
System.out.println("B clas load"  );
}//end b
}//end class
class C11 extends A11{
static int c=60;
int z=70;
static{
System.out.println("Cclass load");
}//end sb
}//end class
class ABC11{ 
static{
System.out.println("main classs is loade");}//end sb
	public static void main(String[] args) {
	B11 b1 =new B11();
	C11 c1=new C11();
			b1.a=15;
			b1.x=16;
System.out.println(b1.a+"......");

System.out.println(c1.a+"......");

System.out.println(b1.x+"......");
System.out.println(c1.x+"......");


		//System.out.println("Hello World!");
	}//end of the mm
}//End of the class
