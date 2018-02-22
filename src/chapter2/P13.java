package chapter2;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter the mouthly saving amount :");
		Scanner input = new Scanner(System.in);
		double free =  input.nextDouble();
		double count = free ;
		free = (free )*(1 + 0.00417);
		for( int i=0 ; i<5 ; ++i)
		{
			free = (free + count )*(1 + 0.00417);
		}
		System.out.println("After the sixth mouth, the account value is $" + free);
		input.close();
		
	}

}
