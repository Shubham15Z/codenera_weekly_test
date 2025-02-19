/*
 9. Create an abstract class Shape with an abstract method area(). 
 Implement two subclasses Circle and Rectangle that override the area() method.
  Create objects and call the area() method.  
 */

package wt.feb15.pkg;


abstract class Shape 
{
 abstract double area();
}

class Circle extends Shape 
{
	double radius;
	public Circle(double radius) 
	{
		this.radius = radius;
	}

	double area() 
	{
		return Math.PI * radius * radius;
	}
}


class Rectangle extends Shape {
	double length, width;
	
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	double area() 
	{
		return length * width;
	}
}

public class Question9 {
	public static void main(String[] args) 
	{
	     Shape circle = new Circle(5);
	     Shape rectangle = new Rectangle(4, 6);

	     System.out.println("Area of Circle: " + circle.area());
	     System.out.println("Area of Rectangle: " + rectangle.area());
	 }
}
