class A17{
static void m1(){
System.out.println("A m1");
}//end m1
static void m2(){
System.out.println("A m2");
m1();
}//end m2
}//end class
class B17 extends A17{
static void m1(){
System.out.println("B m1");
}//end m1
 void m3(){
	System.out.println("B m3");
	m1();
	super.m2();
}//end m3

}//end class
class C17 extends B17{
static void m2(){
	System.out.println("C m2");
	//m4();//CE becouse  of conot find symble 
}//end m2
}//end class
class  D17 extends C17{
static void m1(){
System.out.println("D  m1");
}//end m1
static void m2(){
System.out.println("D m2");
}//end m2
 static void m4(){
System.out.println("D  m4");
}//end m4
	public static void main(String[] args) {
	D17 d1=new D17();
	d1.m1();
	d1.m2();
	d1.m3();
	d1.m4();
		//System.out.println("Hello World!");
	}//end mm
}//end class
