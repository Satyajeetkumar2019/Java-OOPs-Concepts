class Sample  extends Example{
static int b=m3();
static{
System.out.println(" Sample SB");
}
int y=m4();
	{
	System.out.println(" Sample NSB");
	}
Sample(){

System.out.println("Sample Constructor");
}
static int m3(){
	System.out.println(" Sample SV");
return 30;
}
int m4(){
System.out.println("Sample NSV");
return 40;
} void abct(){
System.out.println("Sample abc method");
}

	public static void main(String[] args) {
		System.out.println("Sample is loade ");
		Sample s1=new Sample();
		s1.abc();
	}
}//end of the Sample class
