/*
10. Design a thread-safe Singleton class in Java.
 */

package wt.april26.pkg;

class Singleton 
{
	
    private static Singleton instance;
    
    private Singleton() 
    {
    	
    }
    
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Question7 
{
	 public static void main(String[] args) 
	 {
		 Singleton obj1 = Singleton.getInstance();
	     Singleton obj2 = Singleton.getInstance();

	     System.out.println(obj1 == obj2);
	 }
}
