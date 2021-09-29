package swapping;


		import java.io.*;
		 
		class Geeks {
		 
		    public static void main(String args[])
		    {
		    	
		        int x = 20;
		        int y = 15;
		        x = x + y;
		        y = x - y;
		        x = x - y;
		        System.out.println("After swaping:"
		                           + " x = " + x + ", y = " + y);
		        
		        
		        
		        
		        
		        int s = 25;
		        int t = 12;
		 
		        // Code to swap 's' and 't'
		        s = s * t; // s now becomes 50
		        t = s / t; // t becomes 10
		        s = s / t; // s becomes 5
		 
		        System.out.println("After swaping:"
		                           + " s = " + s + ", t = " + t);
		    }
		
}