/*

Q7.


  *
  * 1 *
  * 1 2 1 *
  * 1 2 3 2 1 *
  * 1 2 1 *
  * 1 *
  *
  
  
 */

package wt.may10.pkg;

public class Question7 
{
	public static void main(String[] args)
	{
		int rows = 4;
		for(int i = 0; i < rows; i++)
		{
			System.out.print("* ");
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			
			for(int j = i-1; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			if (i >= 1) {
                System.out.print("*");
            }
            System.out.println();
		}
		
		for(int i = rows - 2; i >= 0; i--)
		{
			System.out.print("* ");
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			for(int j = i-1; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			if (i >= 1) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
}
