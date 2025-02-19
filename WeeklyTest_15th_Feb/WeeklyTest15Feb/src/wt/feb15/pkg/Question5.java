/*
5. Create a class Counter with a static variable count that increments whenever an object is created. 
Display the value of count after creating multiple objects.
 */

package wt.feb15.pkg;

class Counter
{
	static int count = 0;
	Counter()
	{
		count++;
	}
	
	void display()
	{
		System.out.println(count);
	}
}
public class Question5 {
	public static void main(String[] args) {
		Counter ob = new Counter();
		Counter ob1 = new Counter();
		Counter ob2 = new Counter();
		Counter ob3 = new Counter();
		ob.display();
		
	}
}
