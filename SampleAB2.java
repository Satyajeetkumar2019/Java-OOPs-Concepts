class ExampleAB2{
void m1(int i,float f){System.out.println("int float method");}
void m1(float f,int i){System.out.println("float int  method");}
}
class SampleAB2 {
	public static void main(String[] args) {
	ExampleAB2 e1=new ExampleAB2();
	e1.m1(12,12.675f);
	e1.m1(78.768f,89);
	System.out.println();
	e1.m1(10,20);
		//System.out.println("Hello World!");
	}//end mm
}//end classs
