package iit.oop.inheritence.practice;

public class Circle extends Shape{
	public int radian;
	
	public double area(int r)
	{
		return Math.PI * super.area(r)*super.area(r);
	}

}
