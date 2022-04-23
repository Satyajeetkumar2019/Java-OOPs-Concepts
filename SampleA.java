class ExampleA{
static void m1(){System.out.println("Exam m1");}
void m2(){System.out.println("Exam m2");}
void m3(){System.out.println("Exam m3");}
//void m4(){System.out.println("Exam m4");}
}
class SampleA extends ExampleA{ 
static void m1(){System.out.println("Sample  m1");}
}
void m2(){System.out.println("Sample m2");}
void m3(){System.out.println("Sample m3");}
void m4(String str){System.out.println("Sample m4 ");}
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		SampleA  s=new SampleA();
		s.m1();
		s.m2();
		s.m3();
	//	s1.m4("satyajeet");
	}
}
