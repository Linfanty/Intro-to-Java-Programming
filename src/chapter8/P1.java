package chapter8;
import java.util.Scanner;

public class P1 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double[][] m = new double[3][4];
	    //System.out.println(m.length + "   " + m[1].length);
	    for (int i = 0; i < m.length; i++)
	      for (int j = 0; j < m[i].length; j++)
	        m[i][j] = input.nextDouble();

	    for (int j = 0; j < m[2].length; j++) {
	      System.out.println("Sum of the elements at column " 
	    		  + j + " is " + 
	        sumColumn(m, j));      
	    } 
	  }
	  
	  
	  
	  public static double sumColumn(double[][] m, int columnIndex) 
	  {
	    double total = 0;
	    
	    for (int i = 0; i < m.length; i++)
	      total += m[i][columnIndex];
	    
	    return total;
	  }  
	}
