 final class Example { 
int x=10;
final  int y=20;
void m1(){
System.out.println("Example m1()");
}//end m1
final void m2(){
System.out.println("Example m2() and final ");
}//end m2

}//end final class
class  Test_Final{
public static void main(String []args){
Example s2=new Example();
System.out.println(s2.x+"...."+s2.y);
s2.m1();s2.m2();


}//end main
}//end class