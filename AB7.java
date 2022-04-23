class A7{
int x=10;
int y=20;
}
class B7 extends A7{
	int x=30;
	int y=40;
}
class AB7 { 

	public static void main(String[] args){
	B7 s=new B7();
	A7 s1=new A7();
	System.out.println(s.x+"..........."+s.y);
		System.out.println(s1.x+".........."+s1.y);
s.x=90;
s.y=80;

System.out.println(s.x+"..........."+s.y);
		System.out.println(s1.x+".........."+s1.y);

	}
}
