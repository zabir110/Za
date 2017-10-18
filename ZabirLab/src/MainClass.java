
public class MainClass  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Object of all classes
		aeroplane ae=new aeroplane();
		Air ai=new Air();
		boat bo=new boat();
		bus bu=new bus();
		Car ca=new Car();
		helicopter he=new helicopter();
		Land la=new Land();
		ship sh=new ship();
		Water wa=new Water();
		
		//Polymarphism
		Vehicle vvehicle=new Land();
		
		//Call the related function
		ae.aerospeed();
		ai.speed();
		bo.boatspeed();
		bu.busspeed();
		ca.carspeed();
		he.speed();
		la.speed();
		sh.shipspeed();
		wa.speed();
		
		
		try{
			//Check the instance operator
			System.out.println(la instanceof Land);
			System.out.println(sh instanceof Vehicle);
			System.out.println(la instanceof Vehicle);
			System.out.println(sh instanceof ship);
			//using polymorphism object of vehicle
			System.out.println(vvehicle instanceof Land);
			
		}
		catch(Exception e){
			System.out.println("There is error");
		}
		
	}

}
