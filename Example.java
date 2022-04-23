class Example {
static int a=m1();
static{
System.out.println(" Example SB");
}
int x=m2();
	{
	System.out.println(" Example NSB");
	}
	static int m1(){
	System.out.println(" Example SV");
	return 10;
	}
	int m2(){
		System.out.println("Example NSV");
	return 20;
	}
	Example(){
	System.out.println("Example constructor");
	}
	void abc(){

System.out.println(" Example abc ");
	}
	void pqr(){
	
	System.out.println("pqr ");
	}


	public static void main(String[] args) {
	
		System.out.println("Hello World!");
	}//end of the main method
}//end of the Example
