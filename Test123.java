class ABC{
static int a=10;
int b=20;
}
class Test123 extends ABC{
static int a=40;
int b=60;
	public static void main(String[] args) {
	
 Test123  b1=new  Test123();
b1.a=29;
b1.b=12;
System.out.println(b1.a+"......."+b1.b);
System.out.println(ABC.a);
		//System.out.println("Hello World!");
	}
}
