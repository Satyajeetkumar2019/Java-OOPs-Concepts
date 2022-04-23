class ExampleConstructor  {
ExampleConstructor(){
System.out.println("Exaple  no param comstructor ");
}
ExampleConstructor(int s){
System.out.println(" Exa int param constructor ");
}
ExampleConstructor(String s){
System.out.println("Exa String constructor ");
}//end string 

}
class SampleConstructor  extends ExampleConstructor{

 SampleConstructor(){
 System.out.println("Sample no  param constructor ");}
  SampleConstructor(int f){
  System.out.println("Samole int param ");}
   SampleConstructor(String s){
   System.out.println("Sample String param constructor ");}

public static void main(String[] args) {
	
	 SampleConstructor s1=new  SampleConstructor();
	  SampleConstructor s2=new  SampleConstructor("SA");
	   SampleConstructor S2=new  SampleConstructor(12);
	}


}//end class