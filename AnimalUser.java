interface Animal {
public void eat();
public void sleep();
}//end interface
 class Lion implements Animal {
public void eat(){
System.out.println("i am loin eat non veg ");}
public void sleep(){System.out.println("i am loin sleep night ");}
}//end class
 class Rabbit implements Animal {
public void eat(){
System.out.println("i am rabbit eat non veg ");}
public void sleep(){System.out.println("i am Rabbit sleep night ");}
}//end class
 class Got implements Animal {
public void eat(){
System.out.println("i am Got eat non veg ");}
public void sleep(){System.out.println("i am Got sleep night ");}
}//end class
class Zoo {
public static void sendAnimal(Animal a){
a.eat();
a.sleep();
}
}//end class
class AnimalUser {
public static void main(String[]args){
//Zoo.sendAnimal(new Lion());
Zoo.sendAnimal(new Rabbit());
Zoo.sendAnimal(new Got());

}
}