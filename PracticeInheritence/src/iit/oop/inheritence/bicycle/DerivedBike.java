package iit.oop.inheritence.bicycle;

public class DerivedBike extends MountainBike {
	
	
	public DerivedBike(int gear, int speed, int seatHeight) {
		super(gear, speed, seatHeight);
		// TODO Auto-generated constructor stub
	}
	public DerivedBike()
	{
		
	}

	public void childDeriveBike()
	{
		System.out.println("This is Derived class");
	}


}
