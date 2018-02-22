package chapter2;
import java.util.*;

public class P2 {

	public static void main(String[] args) {
		
		System.out.print("Enter the radius and length of a cylinder:");
		Scanner input = new Scanner (System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double pi = 3.1415926;
		double area = radius *radius * pi;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + area * length);
		input.close();
		
	}
}
