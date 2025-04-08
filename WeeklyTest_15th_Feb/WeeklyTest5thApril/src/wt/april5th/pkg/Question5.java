/*
5. Threading Coding – Concurrent Number Printing:
Write a Java program that demonstrates the use of threads. The program should:

Create two threads.

The first thread prints numbers from 1 to 5.

The second thread prints numbers from 6 to 10.

Ensure that the numbers from both threads are printed concurrently.
 */

package wt.april5th.pkg;

class MyThread01 extends Thread
{
	private void printOneToFive() 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void run()
	{
		printOneToFive();
	}
}
class MyThread02 extends Thread
{
	private void printSixToTen() 
	{
		int i = 6;
		while(i <= 10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void run()
	{
		printSixToTen();
	}
}

public class Question5
{
	public static void main(String[] args) 
	{
		MyThread01 t1 = new MyThread01();
		t1.start();
		
		MyThread02 t2 = new MyThread02();
		t2.start();
	}

}
