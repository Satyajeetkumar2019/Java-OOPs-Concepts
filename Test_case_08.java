class  Example	{
void add(int i,int j){
	System.out.println("Exam int int ");
}//end add
void add(String s,float f){
System.out.println("Exam string float");
}//end add
int add(String s1,String s2){
System.out.println("String and String ");
return 10;
}//end add
}//end class
class Sample extends Example{ 
void add(int i, int j){
System.out.println(" Sample int and int ");
}//end add
float add(float f, int i){
	System.out.println(" Sample float and int ");
	return f+i;
}//end add
String add(String s1,double d){
	System.out.println(" Sample String double");
	return s1+d;
}//end add
}//end class
class Test_case_08{
public static void main(String []args){
	Sample s1=new Sample();

s1.add(12,43);
s1.add("apkj",20);
s1.add("sd","fss");
s1.add("dss",90.80);
s1.add(10,20.0f);


}//end mm
}//end class