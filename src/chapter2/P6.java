package chapter2;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter the number between 0 and 1000:");
		
		Scanner input = new Scanner(System.in);
		int digits = input.nextInt();
		int sum = 0;
		while(digits != 0)
		{
			sum += digits %10 ;
			digits = digits / 10;
		}
		
		System.out.println( "The sum of the digits is " + sum);
		
		input.close();
	}

}
