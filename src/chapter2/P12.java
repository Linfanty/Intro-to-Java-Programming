package chapter2;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		System.out.print("Enter the speed and acceleration :");
		Scanner input = new Scanner(System.in);
		double v = input.nextDouble();
		double a = input.nextDouble();
		System.out.println("The minimum runway length for this airplane is " + v*v/2/a);
		input.close();
		
		
		
		
	}

}
