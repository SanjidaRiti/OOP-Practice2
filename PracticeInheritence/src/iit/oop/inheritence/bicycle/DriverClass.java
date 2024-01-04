package iit.oop.inheritence.bicycle;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MountainBike ob = new MountainBike(3, 200, 10);
//		ob.setHeight(12);
//		System.out.println(ob.toString());
		
		DerivedBike ob2= new DerivedBike();
		ob2.parentClass();
		ob2.mountainBikeInter();
		ob2.childDeriveBike();
		

	}

}
