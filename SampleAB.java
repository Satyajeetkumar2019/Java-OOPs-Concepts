class ExampleAB 
{
	void m1(int i){System.out.println("int-arg");}
	void m1(byte b){System.out.println("byte-arg");}
}
class SampleAB{
	public static void main(String[] args) {
		byte b=19;
		short s=20;
		char c='a';
		int i=10;
	ExampleAB e=new ExampleAB();
e.m1(b);
e.m1(s);
e.m1(c);
e.m1(i);
System.out.println();
e.m1(10);
e.m1(15);
e.m1('a');
e.m1(20);
e.m1((byte)10);e.m1((short)20);
	//	System.out.println("Hello World!");
	}
}//end class