class ThisRule1 { 
ThisRule1(){
	this(12);
System.out.println("no param constructor ");}
ThisRule1(int s){
	this("asd");
System.out.println("int param constructor ");}
ThisRule1(String s){
	//this();
System.out.println("String param constructor");}



	public static void main(String[] args) {
	
	ThisRule1 s1=new ThisRule1();
		System.out.println("Hello World!");
	}//end mm
}//end class
