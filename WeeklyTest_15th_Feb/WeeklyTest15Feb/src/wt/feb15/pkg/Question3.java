/*
3. Write a class MathOperations with multiple methods named multiply(), one taking two integers, another taking 
three integers, and another taking two doubles. Call all the methods in main(). 
*/
package wt.feb15.pkg;

class MathOperations
{
	void multiply(int n1, int n2)
	{
		System.out.println("The two int method :"+(n1*n2));
	}
	
	void multiply(int n1, int n2,int n3)
	{
		System.out.println("The three int method :"+(n1*n2*n3));
	}
	
	void multiply(double d1, double d2)
	{
		System.out.println("The two double method : "+(d1*d2));
	}
}

public class Question3 
{
	public static void main(String[] args) 
	{
		MathOperations ob = new MathOperations();
		ob.multiply(10, 20);
		ob.multiply(10, 5, 2);
		ob.multiply(43.2, 2.30);
	}
}
