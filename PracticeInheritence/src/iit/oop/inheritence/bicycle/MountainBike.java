package iit.oop.inheritence.bicycle;

public class MountainBike extends Bicycle {
        public int seatHeight;
        
        public MountainBike()
        {
        	
        }

		public MountainBike(int gear, int speed, int seatHeight) {
			super(gear, speed);
			this.seatHeight = seatHeight;
		}
        
		public void setHeight(int newValue)
		{
			this.seatHeight=newValue;
		}
		public void mountainBikeInter()
		{
			System.out.println("This is intermediary class");
		}

		@Override
		public String toString() {
			return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
		}
		
}
