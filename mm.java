class  mm{ 
	int x=90;
	void m1(){
	System.out.println(this);
System.out.println(mm.this);
//System.out.println(super);
	}
	public static void main(String[] args){ 
	
mm s=new mm();
		s.m1();
	}//end mm
}//end class
