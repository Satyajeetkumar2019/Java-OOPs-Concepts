//B3.java
class A3 {
int x=m1();
int m1(){
	System.out.println(" A  NSV");
return 10;
}

	{
	
	System.out.println(" A NSB");
	}

A3(){

System.out.println(" A3 constructor");
}	
}//end of the class A3
class B3 extends A3{
int y=m2();
int m2(){
System.out.println("In B3 NSV");
return 20;
}
	{
	System.out.println(" In B3 NSB ");
	}
	B3(){
	System.out.println(" In B constructor ");
	}

public static void main(String []args){
System.out.println("B main ");
B3 b1=new B3();
System.out.println(b1.x);
System.out.println(b1.y);

}//end of the mai method

}