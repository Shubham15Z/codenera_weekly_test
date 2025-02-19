/*
4. Create a class Animal with a method makeSound(), and a subclass Dog that overrides makeSound(). 
Use the super keyword inside Dog to call the parent class method.  
 */


package wt.feb15.pkg;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		super.makeSound();
		System.out.println("Dog barks");
	}
	
}

public class Question4 
{
	public static void main(String[] args) {
		Dog ob = new Dog();
		ob.makeSound();
	}
	
	
	
}
