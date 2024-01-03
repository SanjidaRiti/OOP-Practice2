package iit.oop.inheritence.bicycle;

public class Bicycle {
	
	public int gear, speed;

	
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

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	
	

}
