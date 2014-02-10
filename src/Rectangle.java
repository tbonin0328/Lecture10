
public class Rectangle extends Shape 
{
	private double width;
	private double height;
	
	public Rectangle(String color, double width, double height) {
		super(color); //must be first line if called
		//pass the color to my parent so he can use it at the constructor level
		//calling parent constructor
		
		this.width = width;
		this.height = height; //don't redeclare color
	}

	@Override //overriding is completely replacing
	public double getArea() 
	{
		return width * height;
	}
	
	public double getArea(int extra) //this is overloading, not overriding; overloading is duplicating with 
	//a different signature.
	{
		return width * height;
	}

	@Override //whenever you have a method in the parent and you have the same method in the child,
	//your are overriding.
	public String toString() {
		return "Rectangle";
	}

}
