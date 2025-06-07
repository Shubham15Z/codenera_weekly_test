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

package wt.may25.pkg;

public class Question7 {
    public static void main(String[] args) {
        int maxNum = 3;

        for (int n = 0; n <= maxNum; n++) {
            if (n == 0) 
            {
                System.out.println("*");
            } 
            else 
            {
                System.out.print("* ");
                for (int i = 1; i <= n; i++)
                {
                    System.out.print(i + " ");
                }
                for (int i = n - 1; i >= 1; i--) 
                {
                    System.out.print(i + " ");
                }
                System.out.println("*");
            }
        }

        for (int n = maxNum - 1; n >= 0; n--)
        {
            if (n == 0) 
            {
                System.out.println("*");
            } 
            else 
            {
                System.out.print("* ");
                for (int i = 1; i <= n; i++) 
                {
                    System.out.print(i + " ");
                }
                for (int i = n - 1; i >= 1; i--) 
                {
                    System.out.print(i + " ");
                }
                System.out.println("*");
            }
        }
    }
}
