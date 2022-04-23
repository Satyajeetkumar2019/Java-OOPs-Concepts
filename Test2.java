//Test.java
class A{
public void m1(){
	System.out.println(" class A and m1 method");
}//end of the m1 method
}//end of the class A

class B extends A{
	public void m2(){
	System.out.println("class b and method m2()");
}//end of the m2 method
}//end of the class B
interface f1{
	
	public void m3( );
}//end of the interface f1
interface f2 extends f1
{
	public void m4();
}
class C implements f1 {
public void m3(){

System.out.println("m3 method");
}
public  void m6(){

System.out.println(" by own method ");
}
}//end of the class c
public class Test2{
public static void main(String []args){

C c1=new C();
c1.m3();
c1.m6();


}//end of the main method
}//end of the class test 