 abstract class Example99 {
abstract void m1();
static int a=90;
int y=20;
static{
System.out.println("Exam static block");}
	 {
	 System.out.println("Exam non static  block");
	 }
	Example99(){
	System.out.println("constructor ");}
	static void m2(){
	System.out.println("Example  static m2 ");}
	void m3(){
	System.out.println("Example non static  m3");}

 }//end class
class Sample99 extends Example99{
static int b=80;
int l=20;
static {
System.out.println("SB");}
	{
	System.out.println("NSB");}
	Sample99(){
	System.out.println("constructor ");}
	static void m4(){
	System.out.println("static m4()");}
	void m5(){
	System.out.println("non Static method");}
	void m1(){
	System.out.println("m1 sample class ");
	}

	public static void main(String []args){
	System.out.println("Sample main method ");
System.out.println(a+"....."+b);
m2();m4();
System.out.println();
Sample99 s=new Sample99();
s.m1();
s.m3();s.m5();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

	}//end mm
}//end class