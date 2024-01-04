package iit.oop.inheritence.bicycle;

public class Bicycle {
	
	public int gear, speed;
	
	public Bicycle()
	{
		
	}

	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void speedup(int increament)
	{
		speed+=increament;
	}
	public void parentClass()
	{
		System.out.println("This is a parent class");
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	
	

}
