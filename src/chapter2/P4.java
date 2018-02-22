package chapter2;
import java.util.*;

public class P4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter a number in pounds:");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		System.out.println( pounds + " pounds is "+ 0.454*pounds + " kilograms");
		input.close();
	}

}
