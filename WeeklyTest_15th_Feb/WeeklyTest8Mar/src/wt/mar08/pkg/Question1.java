/*
The Mysterious Scroll of Eldoria  

In the enchanted kingdom of Eldoria, two young adventurers, Ryan and Mia, stumbled upon an ancient scroll 
hidden deep within the forest. The scroll contained strange symbols and messages, and to uncover its secrets, 
they had to solve a series of string-related challenges.  

The Trials of the Ancient Scroll  

1. Ryan found the first sentence on the scroll but couldn't read it. Print the message.
 */

package wt.mar08.pkg;

public class Question1 
{	
	private String message = "The Ancient Wisdom lies within "; 
	
	void printMessage()
	{
		System.out.println("Message : "+message);
	}
	public static void main(String[] args) 
	{
		Question1 q1 = new Question1();
		q1.printMessage();
	}
}
