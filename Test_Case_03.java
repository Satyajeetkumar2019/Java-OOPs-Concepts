class Test_Case_03 {
void m1(Object o){
System.out.println("object type");
}//end m1
void m1(Example e){
System.out.println("Example type");
}//end m1
void m1(Sample s){
System.out.println("Sample type");
}//end m1
/*
void m1(Test t){
System.out.println("Test type");
}//end m1
*/
	public static void main(String[] args) {
	 Test_Case_03 e1=new  Test_Case_03();
//e1.m1(new Example());
///e1.m1(new Sample());
e1.m1(new Test());
//e1.m1("jbb");
System.out.println();
//e1.m1((Sample)null);
//e1.m1((Example)null);
/*e1.m1((Test)null);
*/


	//	System.out.println("Hello World!");
	}//end mm
}//end class
class Example
{
}
class Test
{
}
class Sample
{
}