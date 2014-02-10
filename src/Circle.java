
public class Circle extends Shape
{
	protected double radius;
	
	public Circle(String color, double radius) {
		super(color); 
		
		this.radius = radius;
	}

	@Override //overriding is completely replacing
	public double getArea() 
	{
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public String toString() {
		return "Circle";
	}

}