
public class Cylinder extends Circle
{
	private double height;
	
	public Cylinder(String color, double radius, double height)
	{	super(color, radius);
		this.height = height;
	}
	
	public double getArea()
	{
		return super.getArea() *2 + radius * height * Math.PI * 2;
	}
	
	public double getVolume()
	{
		return super.getArea() * height;
	}
	
	public String toString() {
		return "Cylinder";
	}
}