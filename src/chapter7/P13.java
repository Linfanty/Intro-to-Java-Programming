package chapter7;

public class P13 {
	  public static void main(String[] args) 
	  {
	    System.out.println(getRandom(1, 2, 3, 10));
	  }

	  
	  
	  public static int getRandom(int ...numbers)
	  {
	    generateRandom: while (true) 
	    {
	      int value = 1 + (int)(Math.random() * 54);

	      // Check if value is in numbers
	      for (int i = 0; i < numbers.length; i++)
	      {
	        if (numbers[i] == value)
	        {
	          continue generateRandom;
	        }
	      }

	      return value;
	    }
	  }
	  
}