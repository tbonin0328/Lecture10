
/**
 * The shape class is used to define a shape
 * @author tbonin
 *
 */
public abstract class Shape //class must be abstract for any method in the class to be abstract 
{
	private String color;
	
	/**
	 * Shape constructor, used to make shape
	 * @param color
	 */
	public Shape (String color)
	{
		this.color = color;
	}
	
	public abstract double getArea(); //forcing your children to implement the method; must be abstract b/c can't be defined here.
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public abstract String toString(); //made abstract because we can't define string at this level.

}
