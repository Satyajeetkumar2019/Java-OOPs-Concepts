class A14{ 

void m1(){System.out.println("A m1 ");}
void m2(){
System.out.println("A m2");
m1();}
}//end class a14
class B14 extends A14{
void m1(){
System.out.println("B m1");
}//end m1 
public static void main(String []args){
B14 b1=new B14();
b1.m1();b1.m2();
A14 a1=new B14();
a1.m1();a1.m2();

}//end main 
}//end class
