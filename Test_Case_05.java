interface Foo{}
class Alpha{}
class Beta extends Alpha implements Foo{}
class Test_Case_05 {
void m1(Foo f){
System.out.println("fool type");
}//end m1
void m1(Alpha s){
System.out.println("Alphs type");
}//end m1
	public static void main(String[] args) {
		Test_Case_05 e1=new Test_Case_05();
		//e1.m1(new Beta());
		e1.m1(null);
		System.out.println("Hello World!");
	}//end mm
}//end class
