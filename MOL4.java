class MOL4{ 
static void m1(byte b){System.out.println("byte-arg");}

	public static void main(String[] args) {
	//m1(12);//CE possible loss of conversion 
	m1((byte)12);
	byte b=12;
	m1(b);
		//System.out.println("Hello World!");
	}//end mm
}//end class 
