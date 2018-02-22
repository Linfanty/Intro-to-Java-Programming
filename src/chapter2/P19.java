package chapter2;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter three points for a triangle:");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.pow(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 0.5);
		double side2 = Math.pow(((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)), 0.5);
		double side3 = Math.pow(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)), 0.5);
		
		double s = (side1 + side2 + side3 )/2;
		double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
		System.out.println("The area of the triangle is "+ area);
	
		input.close();
	}

}
