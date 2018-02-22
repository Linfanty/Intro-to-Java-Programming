package chapter2;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter x1 and y1:");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("The distance between the points is :" + Math.pow(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 0.5));
		
		input.close();
	}

}
