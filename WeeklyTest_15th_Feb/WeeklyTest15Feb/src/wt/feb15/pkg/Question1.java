/*
1. Create a base class Vehicle with attributes speed and fuelCapacity, and a derived class Car that adds an
 attribute numDoors. Write a program to display the details of a Car object. 
 */

package wt.feb15.pkg;

class Vehicle
{
	int speed = 120;
	int fuelCapacity = 15;
}

class Car extends Vehicle
{
	int numDoors = 4;

	void display()
	{
		System.out.println("The speed is :"+speed);
		System.out.println("The fuel capacity is :"+super.fuelCapacity+" Lit");
		System.out.println("The number of doors are : "+numDoors);
	}
}

public class Question1 
{
	public static void main(String[] args) 
	{
		Car ob = new Car();
		ob.display();
	}
}
