class A {
void m1(int s){
System.out.println("A int ");
}//end m1
}//end class
class B extends A{
void m1(float f){
System.out.println("B float");
}//end m1
}//end class
class MOL5 {
	public static void main(String[] args) {
	B b1=new B();
b1.m1(12);
b1.m1('a');
b1.m1(20l);
System.out.println();
A a1=new B();
a1.m1(12);
a1.m1('a');
a1.m1(10L);

		//System.out.println("Hello World!");
	}//end mm
}//end class
