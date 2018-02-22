package chapter6;
import java.util.Scanner;

public class P18 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s= input.nextLine();
		
		if (isValidPassword(s))
		      System.out.println("Valid password");
		else
		      System.out.println("Invalid password");
		input.close();
	}
	
	public static boolean isValidPassword(String s)
	{
	    // Only letters and digits?
	    for (int i = 0; i < s.length(); i++) 
	    {
	      if (!Character.isLetter(s.charAt(i))
	    		  	&& 
	          !Character.isDigit(s.charAt(i)))
	        return false;
	    }
	    
	    if (s.length() < 8)
	      return false;
	    
	    int count = 0;
	    for (int i = 0; i < s.length(); i++) 
	    {
	      if (Character.isDigit(s.charAt(i)))
	        count++;
	    }
	    
	    if (count >= 2)
	      return true;
	    else 
	      return false;
	  }
	
}
