class A {
void m1(int j){
System.out.println("A int ");}
void m1(char ch){
System.out.println("A char ");}
}//end A class
class B extends A {
void m1(float h){
System.out.println("B float");}
void m1(char ch){
System.out.println("B char");}
}
class MOL5_02 { 
	public static void main(String[] args) {
	B b1=new B();
	b1.m1(20);
	b1.m1('s');
	b1.m1(29l);
	System.out.println();
	A a1=new B();
	a1.m1(12);
	a1.m1('a');
	//a1.m1(19l);
		//System.out.println("Hello World!");
	}//end mm
}//end class
