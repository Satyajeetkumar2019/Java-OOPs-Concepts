//B.java
class B1 extends A1{ 
static int b=m2();
static int m2(){
System.out.println(" B SV");
return 20;
}//END of the m2() method
static{
System.out.println("B SV");
}//End of the static block
	public static void main(String[] args) {
	
		System.out.println("Bmain ");

System.out.println("	A sv"+a);
System.out.println("B sv"+b);

	}//end of the main method
}//end of the class
