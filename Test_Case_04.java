interface Foo
{

}
class Beta implements Foo
{


}
class Test_Case_04 {
void m1(Object o){
System.out.println("object type");
}//end m1
void m1(Foo f){
System.out.println("Foo type");}
	public static void main(String[] args) {
	Test_Case_04  e1=new Test_Case_04();
e1.m1(new Beta());
e1.m1(null);
		System.out.println("Hello World!");
	}//end class
}//end class
