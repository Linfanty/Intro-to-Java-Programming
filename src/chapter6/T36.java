package c6;
import java.util.Scanner;
public class T36 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 System.out.print("Enter the number of sides: ");
		    int numberOfSides = input.nextInt();

		    System.out.print("Enter the side: ");
		    double side = input.nextDouble();
		    
		    System.out.println("The area of the polygon is " + 
		      area(numberOfSides, side));
		  }
		  
		  public static double area(int n, double side) {
		    return n * side * side / Math.tan(Math.PI / n) / 4;
	}
//Math.tan ( Math.PI / n ) ;
}
