class MOL3{ 
	static void m1(int i){System.out.println("int-arg");}
	static void m1(float f){System.out.println("float-arg");}
	public static void main(String[] args) {
	m1(10);
	m1('s');
	m1(20L);
	System.out.println();
	long l=50;
	m1(l);
	//m1(12.3);
		//System.out.println("Hello World!");
	}//end mm
}//end class
