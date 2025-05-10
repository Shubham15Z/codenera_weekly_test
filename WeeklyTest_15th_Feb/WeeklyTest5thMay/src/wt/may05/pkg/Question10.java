/*
10. print the following pattern.


     A1A
    B2*2B
   C3***3C
  D4*****4D
 E5*******5E
 
 */

package wt.may05.pkg;

public class Question10 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j <= 4; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = i; j <= i; j++)
			{
				if(i == 1)
				{
					System.out.print(""+ch + i + ch++);
				}
				else
				{
					System.out.print(""+ch + i);
					for(int k = 3; k <= 2*i-1; k++)
					{
						System.out.print("*");
					}
					System.out.print(""+i + ch++);
				}
				
			}
			System.out.println();
		}
	}
}
