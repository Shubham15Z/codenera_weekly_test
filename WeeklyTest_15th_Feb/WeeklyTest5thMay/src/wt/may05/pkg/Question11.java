package wt.may05.pkg;

public class Question11 
{

	public static void main(String[] args) 
	{
		int[][] a = {{1,2,}, {3,4}};
		 
        int[] b = (int[]) a[1];

        Object o1 = a;

        int[][] a2 = (int[][]) o1;

        int[] b2 = (int[]) o1;

        System.out.println(b[1]);
        
//		for(int i = 1; i <= 4; i++)
//		{
//			for(int j = i; j <= 3; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= 2*i - 1; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
