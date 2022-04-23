class A16{
void m1(){
System.out.println("A m1");
}//end m1 
void m2(){
System.out.println("A m2");
m1();
}//end m2
}///end clas
class B16 extends A16{
void m1(){
System.out.println("B m1");
}//end m1
void m3(){
System.out.println("B m3");
m1();
super.m2();
}//end m3
}//end class
class C16 extends B16{
void m2(){
	System.out.println("C m2");
	//m4();
}//end m1
}//end class
class D16 extends C16{
void m1(){
System.out.println("D16 m1");
}//end m1
void m2(){
System.out.println("D16 m2");
}//end m2
void m4(){
System.out.println("D16 M4");
}//end m4
public static void main(String []args){
	D16 d1=new D16();
d1.m1();
d1.m2();
d1.m3();
d1.m4();
}//emd mm
}//end class