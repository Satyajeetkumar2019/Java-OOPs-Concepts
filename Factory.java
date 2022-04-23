//factory.java
class Factory{ 
	public static void main(String[] args) {
	//Create two bike object below
	Bike pulser=new Bike("aljhhvbg526256","78tygg78");
	Bike bullet=new Bike("PQR123ergtre","76565");
//Setting remeaning another method
pulser.setBikeNum("jghg");
pulser.setOwnerName("rggbrg");
//antother  bike set method
bullet.setBikeNum("HHGIGyy");
bullet.setOwnerName("HK SIR");
//perform operaction in bike
pulser.start();
pulser.move();
pulser.stop();
bullet.start();
bullet.move();
bullet.stop();


		//System.out.println("Hello World!");
	}//end of the main menthof
}//end of the factory
