class A23{ 
	void m1(Example e){System.out.println("Example arg");}
	void m1(Sample s){System.out.println("Sample arg");}
	public static void main(String[] args) {
A23 a1=new A23();
a1.m1(new Example());
a1.m1(new Sample());
//a1.m1(null);
//a1.m1("akh");
Example ex1=new Example();
//Example ex2=new Sample();
Sample s1=new Sample();
Example ex3=null;
Sample s2=null;
a1.m1(ex1);
a1.m1(s1);
a1.m1(ex3);
a1.m1(s2);



	
	//	System.out.println("Hello World!");
	}//end mm
}//end class

