class MOL1{
void m1(int i){System.out.println("int-param");}
void m1(char ch){System.out.println("char param ");}

	public static void main(String[] args) {
	MOL1 a1=new MOL1();
	a1.m1(12);
	a1.m1('c');
a1.m1((char)100);
a1.m1((int)'d');
System.out.println();
int i1=97;
int i2='a';
char ch1=98;
char ch2='b';

a1.m1(i1);
a1.m1(i2);
a1.m1(ch1);
a1.m1(ch2);
System.out.println();
a1.m1((char)i1);
a1.m1((int)ch1);
System.out.println();
a1.m1(i1+i2);
a1.m1(ch1+ch2);
System.out.println();
a1.m1(i1+10);
a1.m1('a'+'b');
a1.m1((char)('a'+'b'));
a1.m1((char)'a'+'b');
System.out.println();
a1.m1(m2());
a1.m1(m3());






		//System.out.println("Hello World!");
	}//end  mm
	static int m2(){
System.out.println(" m2 ");
return 'a';
}//end m2
static char m3(){
System.out.println(" m3");
return 97;
}//end m3

}//end class
