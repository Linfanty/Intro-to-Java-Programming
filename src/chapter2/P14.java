package chapter2;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter weight in pounds:");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches:");
		double inches = input.nextDouble();
		
		
		
		System.out.println("BMI is " + (pounds*0.45359237/(inches*0.0254)) );
		input.close();
	}

}
