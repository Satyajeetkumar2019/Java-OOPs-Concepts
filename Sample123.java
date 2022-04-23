class Example{
int x=10;
int y=20;
void m1(){
System.out.println("Exa class  m1");
}//end of the m1
}//end of the class exam
class Sample123  extends Example{
int x=30;
int y=40;
void m2(){
System.out.println("x...... "+x);
System.out.println("y...... "+y);

System.out.println("x...... "+super.x);
System.out.println("x...... "+super.y);
}//end m2
void m3(){
int x=50;
int y=60;
System.out.println("x...... "+x);
System.out.println("y...... "+y);


System.out.println("x...... "+this.x);
System.out.println("y...... "+this.y);


System.out.println("x...... "+super.x);
System.out.println("y...... "+super.y);


}//end m3
	public static void main(String[] args){ 
	Sample123  s=new Sample123();
	s.m2();
	s.m3();

	}//end main 
}//end of the class sample
