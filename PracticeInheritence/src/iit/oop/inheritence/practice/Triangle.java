package iit.oop.inheritence.practice;

public class Triangle extends Shape {
	
	public int base, height;
	public double area(int base, int height)
	{
		return 0.5 * super.area(base)* super.area(height);
	}

}
