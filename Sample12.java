class Example1{
 Example1(){
System.out.println("Example zero constructor");
}//end const
Example1(int x){
System.out.println("Example int constructor");
}
}//end of the class
class Sample12 extends Example1 {
Sample12(){
	System.out.println("sample 1");
}
public static void main(String []args){
System.out.println("sample ");
Sample12 s1=new Sample12();
//System.out.println("sample ");

}//end of the main method

}//end of the sample class