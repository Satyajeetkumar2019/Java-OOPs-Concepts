class Test_Case_01 {
static void m1(int i){
System.out.println("int_arg");
}//end m1
static void m1(float f){
System.out.println("floar_arg");
}//end m1
static void m1(long i){
System.out.println("long_arg");
}//end m1
static void m1(double i){
System.out.println("double_arg");
}//end m1
static void m1(Integer  i){
System.out.println("Integer_arg");
}//end m1
static void m1(Number i){
System.out.println("Number_arg");
}//end m1
static void m1(Object  i){
System.out.println("Object_arg");
}//end m1
static void m1(int... i){
System.out.println("var_int");
}//end m1
static void m1(float... i){
System.out.println("var_float");
}//end m1
static void m1(long... i){
System.out.println("var_long");
}//end m1
static void m1(double... i){
System.out.println("var_double");
}//end m1
static void m1(Integer... i){
System.out.println("var_Integer");
}//end m1
static void m1(Long... i){
System.out.println("var_Long");
}//end m1
static void m1(Object... i){
System.out.println("var_Obect");
}//end m1
static void m1(Number... i){
System.out.println("var_Number");
}//end m1

	public static void main(String[] args) {
	m1(12);
		//System.out.println("Hello World!");
	}//end mm
}//end class
