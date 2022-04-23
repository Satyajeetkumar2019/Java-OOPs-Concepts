class A{
void m1(int i){
System.out.println("A int-args ");
}//end m1
}//end class
class B extends A{
void m1(float f){
System.out.println("B float args");
}//end m1
void m1(char ch){
	System.out.println("B char args");
}//end m1
}
class MOL5_01{ 
	public static void main(String[] args) {
		B b1=new B();
b1.m1(17);
b1.m1('j');
b1.m1(18l);
System.out.println();
A a1=new B();
a1.m1(12);
a1.m1('h');
//a1.m1(12l);

		System.out.println("Hello World!");
	}//end mm
}//end classs
