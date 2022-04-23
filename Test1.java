//person.java
class  person{
void m1(){
System.out.println("person class");
}//end of the m1 method

}//end of the person class

class Student extends person{
	//Addr s1=new Addr();
void m2(){
	Addr p2=new Addr();
System.out.println("student class");
}//end of the m2 method

}//end of the class Student

class Employe extends person{
//Addr s2=new Addr();
void m3(){
Addr p1=new Addr();
	System.out.println("employe class");
}//end of the m3() method

}//end of the employe class
class Addr
{
}//end of the add class
public class Test1{
public static  void main(String []args){

Student s1=new Student();

s1.m1();
s1.m2();
Employe s2=new Employe();
s2.m3();
s2.m1();

}//end of the main method


}//end of the test class
