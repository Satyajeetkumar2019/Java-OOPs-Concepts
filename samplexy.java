class Exampleyx{
void m1(){
	System.out.println("Exam m1");
}//end m1
void m2(){
	System.out.println("Exam m2");
}//end m2
void m3(){
	System.out.println("Exam m3");
}//end m3

}//end class
class samplexy extends Exampleyx{ 
	void m1(){
	System.out.println("Sample m1");
	}//end m1
	void m2(){
		super.m2();
	System.out.println("Sample  m2");
	
}//end m1

	public static void main(String[] args) {
	samplexy s1=new samplexy();
	s1.m1();s1.m2();
	s1.m3();
		//System.out.println("Hello World!");
	}//end mm
}//end class
