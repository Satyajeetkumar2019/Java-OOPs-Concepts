class SampleConstructor1  {
SampleConstructor1(){
	this(12);
System.out.println("no param constructor ");}
SampleConstructor1(int s){
	this("sat");
System.out.println("int param constructor ");}
SampleConstructor1(String s){
System.out.println("String param constructor");}
void m1(){
	this("fsdg");
System.out.println("no m1 method");}
	public static void main(String[] args) {
	
	SampleConstructor1 s1=new SampleConstructor1();
	System.out.println();
		SampleConstructor1 s2=new SampleConstructor1(12);	
		System.out.println();
		SampleConstructor1 s3=new SampleConstructor1("aass");

		//System.out.println("Hello World!");
	}//end mm
}//end class
