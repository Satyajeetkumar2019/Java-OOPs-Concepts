abstract interface Vehicle 
{void Break();
void engine();
}
interface sim
{ void vodafone();
void idea();
void jio();
void airtel();
}
 class Axy  implements Vehicle ,sim {
 public void Break(){
System.out.println("break method ");}
public void engine(){
System.out.println("engine ");}


public void idea(){ System.out.println("idea");}
public void ijo(){System.out.println("jio");}
public void airtel(){System.out.println("airtel");}
	public static void main(String[] args) {
	Axy s=new Axy();
	s.jio();
		System.out.println("Hello World!");

	}
}
