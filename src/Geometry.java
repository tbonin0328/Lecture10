import java.awt.Color;

import acm.program.ConsoleProgram;

public class Geometry extends ConsoleProgram
{
	public void run()
	{
		//create a square, then display its area and color
		
		Square square = new Square("red", 37);
		//println("My square is " + square.getColor() + ", and has area: " + square.getArea());
		//create a new cylinder, then display its area, volume, and color
		
		Cylinder cylinder = new Cylinder("red", 23, 19);
		//println("My Cylinder is " + cylinder.getColor() + ", and has area: " + cylinder.getArea() + ", and volume: " + cylinder.getVolume());
		
		Rectangle rectangle = new Rectangle("blue", 12, 12);
		
		Circle circle = new Circle("purple", 15);
		
		//create an array of shapes, size 4
		//loop through and display shapes like:
		//pink, square, area: 24
		
		Shape[] shapes = new Shape[4];
		shapes[0] = square;
		shapes[1] = cylinder;
		shapes[2] = rectangle;
		shapes[3] = circle;
		
		println(((Cylinder)shapes[2]).getVolume());
		
		for (Shape shape: shapes)
		{
			println(shape.getColor() + ", " + shape + ", area: " + shape.getArea()); 
		}
	}

}
