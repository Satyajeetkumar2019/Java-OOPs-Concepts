class CalleeImpl{ 

	    public void foo(Object obj){System.out.println("object type");}
		public void foo(String str){System.out.println("String type");}	
		public void foo(Integer i1){System.out.println("integer type ");}
	
}//end class
class MLO2{
public static void main(String[] args) {
	CalleeImpl c1=new CalleeImpl();
Object obj1=new Object();
Object obj2="hk ";
Object obj3=7989;

c1.foo(obj1);
c1.foo(obj2);
c1.foo(obj3);
System.out.println();
c1.foo("hk");
c1.foo(1242);
System.out.println();
c1.foo((String)obj2);
//c1.foo((Integer)obj2);
System.out.println();
//c1.foo((String)obj1);

//c1.foo((Integer)obj1);

//c1.foo((String)obj3);

c1.foo((Integer)obj2);
		//System.out.println("Hello World!");
	}//end mm
}//END class